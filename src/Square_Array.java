package src;

//https://leetcode.com/problems/squares-of-a-sorted-array/

import java.util.Arrays;

public class Square_Array {
    public static void main(String[] args) {
        int []arr = {-4,-1,0,3,10};
        square(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] square(int []arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]*arr[i];

        }
        sort(arr);
        return arr;
    }
    static int sort(int []arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i ; j++) {
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return 0;
    }
}
