package src;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("enter the value of n");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n%2 == 0)
            System.out.println("even");
        else
            System.out.println("odd");
    }
}
