
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Student{
    int rollNo;
    String name;
    String address;
    Student(int rollNo, String name, String address){
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }
    public int getrollNo() {
        return rollNo;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }

}
public class MapNew {
    public static void main(String[] args) {
        Student s1 = new Student(12, "kunal", "address1");
        Student s2 = new Student(10, "john", "address2");
        Student s3 = new Student(15, "doe", "address3");
        HashMap<Integer, Student> hm = new HashMap<>();
        hm.put(1, s1);
        hm.put(2, s2);
        hm.put(3, s3);
        //view 

        System.out.println("HashMap: " + hm);
        //value
        Collection<Student> c = hm.values();
        Iterator<Student> its = c.iterator();
        while (its.hasNext()) {
            Student student = its.next();
            System.out.println("Roll No: " + student.getrollNo() + ", Name: " + student.getName() + ", Address: " + student.getAddress());
        }      
        System.err.println("******************************************");
        System.out.println("All Students: " + c);
        System.err.println("******************************************");

        //key
        Set keys = hm.keySet();
        Iterator it = keys.iterator();
        while (it.hasNext()) {
            Integer key = (Integer) it.next();
            System.out.println("Key: " + key);
            Student student = hm.get(key);
            System.out.println("Roll No: " + student.getrollNo() + ", Name: " + student.getName() + ", Address: " + student.getAddress());
        }
        System.err.println("******************************************");
        System.out.println("Entry ");
        Set entries = hm.entrySet();
        Iterator it2 = entries.iterator();
        while (it2.hasNext()) {
            Map.Entry<Integer, Student> entry = (Map.Entry<Integer, Student>) it2.next();
            Integer key = entry.getKey();
            Student student = entry.getValue();
            System.out.println("Key: " + key + ", Roll No: " + student.getrollNo() + ", Name: " + student.getName() + ", Address: " + student.getAddress());
        }

    }
}
