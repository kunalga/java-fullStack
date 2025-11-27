import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class MyObj implements  Serializable{
    MyObj(){
        System.out.println("Object is Created ");
    }
    int i = 5 ;
    int j =10;
    

    
}

class Cat implements Serializable {
    Cat(){
        System.out.println("Cat Object is created ");
    }
    transient int i =5;
    int j =10;

    
}
public class FileIOJava {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception{
        MyObj ob = new MyObj();
        Cat animal = new Cat();
        System.out.println("Seralization in java Start ....");
        FileOutputStream fos = new FileOutputStream("ars.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(ob);
        oos.writeObject(animal);
        System.in.read();
        FileInputStream fis = new FileInputStream("ars.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Object obj = ois.readObject();
        Object obj1 = ois.readObject();


        MyObj d1 = (MyObj) obj;
        Cat ani = (Cat) obj1;
        
        System.out.println("Serializable End ....");
        System.out.println("new Obj is Created " + d1 );
        System.out.println("new Obj is Created " + ob);
        System.out.println(ani.i + " " + ani.j );





    }
}
