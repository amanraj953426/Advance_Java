package set.sortedSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Demo{
    public static void main(String[] args) {


        // Initialisation TreeSet
        // and adding element

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(5);
        ts.add(34);
        ts.add(2);
        ts.add(1);

        // Traversing element

        Iterator itr = ts.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next()); // 1 2 5 34

        }
        }

    }
