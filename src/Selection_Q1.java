package src;

import java.util.Arrays;

public class Selection_Q1 {
    public static void main(String[] args) {
        int []arr = {6,2,11,7,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static int sort(int []nums){
        for (int i = 0; i < nums.length-1; i++) {
            int index = i;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j] < nums[index])
                    index = j;
            }
            int temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;
            }

        return 0;
    }


    static int Max_Index(int[]nums){
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>max){
                max = nums[i];
                return i;
            }
        }

        return 0;
    }
}
