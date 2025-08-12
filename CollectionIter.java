
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;
public class CollectionIter {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(40);
        al.add(90);
        al.add(50);
        System.out.println(al);
        for (Object al1 : al) {
            System.out.print(al1 + " ");
        }
        System.out.println();
        System.out.println("********************");
        


        for(int i=0;i<al.size();i++){

            System.out.print(al.get(i) + " ");

        }
        System.out.println();
        System.out.println("********************");
        //Iterator 
        Iterator itr = al.iterator();
        while(itr.hasNext()){
            Integer i = (Integer) itr.next();
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("reverse An Array");
        System.out.println("ArrayList | LinedList  - List Iterator ");


        ListIterator li = al.listIterator(al.size());
        while(li.hasPrevious()){
            System.out.print(li.previous() + " ");
        }
        System.out.println();
        System.out.println("Desending Itrator ");
        System.out.println("ArrayDeque , LinkedList , TreeSet ");

        LinkedList l2 = new LinkedList();
        l2.add(100);
        l2.add(50);
        l2.add(125);
        Iterator sri = l2.descendingIterator();
        while(sri.hasNext()){
            System.out.print(sri.next() + " ");
        }
        System.out.println("***************");
        Vector v = new Vector();
        v.add(100);
        v.add(200);
        v.add(300);
        System.out.println(v);
        System.out.println(v.get(1));
        System.out.println("**Enumeration**");
        Enumeration em = v.elements();
        while(em.hasMoreElements()){
            System.out.println(em.nextElement());
        }

    }
}
