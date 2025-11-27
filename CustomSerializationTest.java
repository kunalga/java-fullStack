import java.io.*;

class Account implements Serializable {

    String userName = "sachin";
    transient String password = "tendulkar";

    // Custom serialization
    private void writeObject(ObjectOutputStream oos) throws Exception {
        System.out.println("writeObject method is called...");
        
        // Write non-transient fields
        oos.defaultWriteObject();

        // Simple encryption
        String encpwd = "123" + password;

        // Write encrypted password
        oos.writeObject(encpwd);
    }

    // Custom deserialization
    private void readObject(ObjectInputStream ois) throws Exception {
        System.out.println("readObject method is called...");

        // Read non-transient fields
        ois.defaultReadObject();

        // Read encrypted password
        String encpwd = (String) ois.readObject();

        // Simple decryption (remove "123")
        password = encpwd.substring(3);
    }
}

public class CustomSerializationTest {
    public static void main(String[] args) {
        try {
            Account acc = new Account();
            
            System.out.println("Before Serialization:");
            System.out.println("User Name: " + acc.userName);
            System.out.println("Password: " + acc.password);

            // Serialize
            FileOutputStream fos = new FileOutputStream("account.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(acc);
            oos.close();

            System.out.println("\n--- Serialization Completed ---\n");

            // Deserialize
            FileInputStream fis = new FileInputStream("account.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Account deserializedAcc = (Account) ois.readObject();
            ois.close();

            System.out.println("After Deserialization:");
            System.out.println("User Name: " + deserializedAcc.userName);
            System.out.println("Password: " + deserializedAcc.password);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
