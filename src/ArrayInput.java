package src;

import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        System.out.println("enter the size of array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int []arr = new int[size];
        for (int i = 0 ; i< arr.length; i++){
            arr[i]  = sc.nextInt();
        }
        for (int j = 0 ; j< arr.length;j++){
            System.out.print(arr[j] + " ");
        }

    }
}
