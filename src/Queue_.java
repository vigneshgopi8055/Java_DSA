package src;

import java.util.LinkedList;
import java.util.Queue;
/*Queue follows FIFO or LILO(first in first out or last in first out)
Stack and Queue are fundamental data structures in Java Collections Framework.
They are used to store the same type of data and retrieve the data in a specific order.
Stack and Queue both are Linear Data Structures.*/
public class Queue_ {
    public static void main(String[] args) {
        Queue<Integer>queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue.peek()); //returns first value in the list
        System.out.println(queue.remove());//removes the first element in list and returns the value

    }
}
