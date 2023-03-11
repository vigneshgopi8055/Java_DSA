//Write a program to print whether a number is even or odd, also take input from the user

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("enter the number : ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num % 2 == 0)
            System.out.println("even");
        else
            System.out.println("odd");
    }
}
