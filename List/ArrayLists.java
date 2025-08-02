package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class ArrayLists {
    public static void main(String[] args) {
        // Declearing the ArrayList with initial size n
        ArrayList<Integer> list = new ArrayList<>();

        // Appending new elemtnt at the end of the list
        for (int i=1; i<=5; i++){
            list.add(i); // [1, 2, 3, 4, 5]
        }
        System.out.println(list);

        // add element in between
        list.add(0, 7);
        System.out.println(list); // [7, 1, 2, 3, 4, 5]

        // size
        int size = list.size();
        System.out.println(size); // 6

        // get element using for each loop
        for (int i : list){
            System.out.println(i);
        }

        // Sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
