package src;

public class Reverse_Number {
    static int sum = 0;

    static void rev(int n) {
        if (n == 0) {
            return;
        }
        int r = n % 10;
        sum = sum * 10 + r;
         rev(n / 10);
    }

    public static void main(String[] args) {
        int n = 1234;
        rev(n);
        System.out.println(sum);
    }
}

