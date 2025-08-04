package Collection_List.stack;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {

        Stack<Integer> stacks = new Stack<>();

        // Adding element
        stacks.push(1);
        stacks.push(2);
        stacks.push(3);
        stacks.push(4);
        stacks.push(4);
        System.out.println(stacks); // [1, 2, 3, 4, 4]

        // pop element
        stacks.pop();
        System.out.println(stacks); // 4

        // does not modify the stack by removing any elements.
        stacks.peek();
        System.out.println(stacks); // [1, 2, 3, 4]

        // checking stack is empty
        System.out.println(stacks.isEmpty()); // false

        //search element in stack
        System.out.println(stacks.search(1));// 4

        // Printing element one by one
        for (int i : stacks)
            System.out.print(i+" ");


    }
}
