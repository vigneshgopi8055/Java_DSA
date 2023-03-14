package src;

import java.util.Arrays;

public class Bubble_Q1 {
    public static void main(String[] args) {
        int []arr = {6,2,11,7,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int sort(int []nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length-i; j++) {
                if (nums[j] < nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }

            }

        }
        return 0;
    }
}
