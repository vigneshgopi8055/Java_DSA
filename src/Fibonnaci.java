package src;

import java.util.Scanner;

//To calculate Fibonacci Series up to n numbers.
public class Fibonnaci {
    public static void main(String[] args) {
        System.out.println("enter the value of n");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int n1 = 0;
        int n2 = 1;
        System.out.println(n1);
        System.out.println(n2);
        for (int i = 2 ; i < n ; i++){
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(n3);

        }
    }
}
