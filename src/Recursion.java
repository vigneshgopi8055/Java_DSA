package src;
//def : Recursion is the technique of making a function call itself.
// This technique provides a way to break complicated problems down into simple problems which are easier to solve.
public class Recursion {
    public static void main(String[] args) {
        Message1();
    }
    static void Message1(){
        System.out.println("hello world");
        Message2();
    }
    private static void Message2() {
        System.out.println("hello world");
        Message3();
    }
    private static void Message3() {
        System.out.println("hello world");
        Message4();
    }
    private static void Message4() {
        System.out.println("hello world");
        Message5();
    }
    private static void Message5() {
        System.out.println("hello world");
    }
}
