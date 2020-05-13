package collections;

import java.util.Collections;
import java.util.LinkedList;

public class Practice {
    public static void main(String[] args) {
        
        LinkedList<Emp> ll = new LinkedList<Emp>();
        ll.add(new Emp(2, "Meete"));
        ll.add(new Emp(1, "Meet"));
        Collections.sort(ll);
        for (Emp emp : ll) {
            
            System.out.println(emp.eid);
        }
    }
}