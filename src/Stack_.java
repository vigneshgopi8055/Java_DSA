package src;

import java.util.Stack;
//Stack follows LIFO or FILO(last in first out or first in last out)
/*Queue follows FIFO or LILO(first in first out or last in first out)
Stack and Queue are fundamental data structures in Java Collections Framework.
 They are used to store the same type of data and retrieve the data in a specific order.
 Stack and Queue both are Linear Data Structures.*/
public class Stack_ {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);//push is used to insert an item
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        stack.pop();//pop is used to remove the item from the last of list
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack);
    }
}
