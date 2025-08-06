package set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Demo {
    public static void main(String[] args) {

        // Initialisation HashSet
        HashSet<Integer> hs = new HashSet<>();

        // Adding element
        hs.add(50);
        hs.add(21);
        hs.add(4);
        hs.add(5);

        // Traversing element
        Iterator itr = hs.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next()); // 50 4 21 5
        }
    }
}
