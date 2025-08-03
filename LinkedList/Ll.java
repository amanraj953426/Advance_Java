package LinkedList;

import java.util.LinkedList;

public class Ll {
    public static void main(String[] args) {
        // creating a LinkedList
        LinkedList<String> list = new LinkedList<>();

        //Adding element to the linkedlist using add() method
        list.add("Two");
        System.out.println(list); // [Two]

        //Adding element to the linkedlist using addFirst() method
        list.addFirst("One");
        System.out.println(list); // [One, Two]

        //Adding element in last position in linkedlist using addLast() method
        list.addLast("Three");
        System.out.println(list); // [One, Two, Three]

        //Print size of linkedlist
        System.out.println(list.size());// 3

        //Print all element in linkedlist
        for (String i : list){
            System.out.print(i+" ");

//            System.out.println(list.lastIndexOf("one"));
//            System.out.println(list);
        }
    }
}
