package java_8_Features.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {

//        Creating a ArrayList of Object
        ArrayList<Integer> al = new ArrayList<>();

//        Inserting elements
        al.add(2);
        al.add(6);
        al.add(9);
        al.add(4);
        al.add(20);

//        Printing the collecton
        System.out.println("Print the collection : "+al);

//        Streams operatins

        List<Integer> ls
                =al.stream() // Getting the stream from collection
                .filter(i -> i%2==0) // Filtering only even element
                .toList(); // Collecting the requried element to list


//        Printing the collection after stream operation
        System.out.println("Printing the list after stream operation : "+ ls);

    }
}
