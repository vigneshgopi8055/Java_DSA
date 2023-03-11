package src;

import java.util.Scanner;

//Take 2 numbers as input and print the largest number.
public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        if (n1>n2)
            System.out.println("greatest number is : " + n1);
        else
            System.out.println("greatest number is : " + n2);
    }
}
