package src;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int []arr = {3,1,5,4,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(maxindex(arr));

    }
    static void sort(int []nums){
        for (int i = 0; i < nums.length; i++) {
            int last = nums.length-i-1;
            int max = maxindex(nums);

            int temp = nums[max];
            nums[max] = nums[last];
            nums[last] = temp;
        }

    }
    static int maxindex(int []nums){
        int max = nums[0];
        for (int i = 1; i < nums.length; i++){
            if (nums[i]>max){
                max = i;
            }
        }
        return max;
    }
}
