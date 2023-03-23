package src;

public class Factorial_Recursion {
    public static void main(String[] args) {
        System.out.println(fact(10));
    }
    static int fact(int n){
        if (n == 0 || n == 1){
            return n;
        } else {
            return n*fact(n-1);
        }
    }
}
