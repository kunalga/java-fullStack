import java.util.*;

class Student1 {
    String name;
    int age;
    String city;

    Student1(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }


}

public class HashMapDemo {
    public static void main(String[] args) {
        Student1 st1 = new Student1("Rohan", 18, "Mumbai");
        Student1 st2 = new Student1("Rahul", 18, "Bengaluru");
        Student1 st3 = new Student1("Rohan", 19, "Delhi");

        HashMap<Integer, Student1> hm = new HashMap<>();
        hm.put(1, st1);
        hm.put(2, st2);
        hm.put(3, st3);

        System.out.println("HashMap: " + hm);

        // Iterate using 
        Collection coll =hm.values();
        Iterator itr = coll.iterator();
        while(itr.hasNext()){
            Student1 st = (Student1)itr.next();
            System.out.println("Name: " + st.name + ", Age: " + st.age + ", City: " + st.city);

        }
        Set sets = hm.keySet();
        Iterator itr1 = sets.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());

        }

       Set sets1 = hm.entrySet();
       Iterator itr2 = sets1.iterator();
       while (itr2.hasNext()){
           Map.Entry mentry = (Map.Entry) itr2.next();
           Student1 st = (Student1)mentry.getValue();
           System.out.println("Key: " + mentry.getKey() + ", Name: " + st.name + ", Age: " + st.age + ", City: " + st.city);

       }





   }



    }


