package src;

import java.util.Arrays;
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
        System.out.println(Arrays.toString(arr));

    }
}
