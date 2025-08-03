package Vector;

import java.util.Vector;

public class vectorDemo {
    public static void main(String[] args) {

        // Declearing the vector
        Vector<Integer> v = new Vector<>();



        //Appending new element at the end of the list
        for (int i=0; i<=5; i++)
            v.add(i);
        System.out.println(v);// [0, 1, 2, 3, 4, 5]

        // checking size of vector
        System.out.println(v.capacity()); // 10

        // Insert  an element at the specific index
        v.add(2, 6);
        System.out.println(v); // [0, 1, 6, 2, 3, 4, 5]

        // Replace the element
        v.set(0, 7);
        System.out.println(v); // [7, 1, 6, 2, 3, 4, 5]

        //Remove the element at specific index
        v.remove(0);
        System.out.println(v); // [1, 6, 2, 3, 4, 5]

        // remove the first occurrence at the specific element
        v.remove((Integer) 6);
        System.out.println(v); // [1, 2, 3, 4, 5]

//        check if the vector is empty
        System.out.println(v.isEmpty()); // false

        // check vector contain the element
        System.out.println(v.contains(5)); // true

        //Remove all the element from the vector
//        v.clear();
//        System.out.println(v); //[]

        // Printing all element one by one
        for (int i=0; i<v.size(); i++){
            System.out.print(v.get(i)+" "); // 1 2 3 4 5
        }





    }
}
