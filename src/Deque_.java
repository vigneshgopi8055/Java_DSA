package src;

import java.util.ArrayDeque;
import java.util.Deque;

/* In java we can insert and remove the elements from both the sides,
   front and back using deck interface
 */
public class Deque_ {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();//array deque has no capacity restrictions
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        deque.add(5);
        deque.addFirst(70);
        deque.addLast(100);
        System.out.println(deque);
    }
}
