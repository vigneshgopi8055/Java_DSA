package src;

import java.util.Arrays;

public class Bubble_Q1 {
    public static void main(String[] args) {
        int []arr = {6,2,11,7,5};
        sort(arr,0,1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int []nums , int index1 , int index2){
        if (index1<0 || index2>nums.length-1)
            return;
        for (int i = 0; i < nums.length; i++) {
            if (nums[index2]<nums[index1]){
                swap(nums,index2,index1);
            }
            sort(nums,index1+1,index2+1);
        }
    }
    static void swap(int []nums , int index1 , int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
