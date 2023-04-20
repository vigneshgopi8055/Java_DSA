package src;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int []arr = {3,1,5,4,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void sort(int []nums){
        for (int i = 0; i < nums.length; i++) {
            int last = nums.length-i-1;
            int max = maxIndex(nums,0,last);
            int temp = nums[last];
            nums[last] =nums[max];
            nums[max] = temp;
        }

    }
    static int maxIndex(int []nums, int start, int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if (nums[max]<nums[i])
                max = i;
        }
        return max;
    }
}
