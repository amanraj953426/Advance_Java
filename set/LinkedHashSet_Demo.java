package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet_Demo {
    public static void main(String[] args) {

                // Initialisation HashSet
                LinkedHashSet<Integer> hs = new LinkedHashSet<>();

                // Adding element
                hs.add(50);
                hs.add(21);
                hs.add(4);
                hs.add(5);

                // Traversing element
                Iterator itr = hs.iterator();
                while (itr.hasNext()){
                    System.out.println(itr.next()); // 50 21 4 5
                }
            }
        }
