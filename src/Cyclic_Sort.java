package src;

import java.util.Arrays;

public class Cyclic_Sort {
    public static void main(String[] args) {
        int []arr = {4,5,3,1,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int sort(int []nums){
        int i = 0;
        while (i< nums.length){
            int correct_index = nums[i] - 1;
            if (nums[i] != nums[correct_index]){
                int temp = nums[i];
                nums[i] = nums[correct_index];
                nums[correct_index] = temp;
            }else {
                i++;
            }
        }
        return 0;
    }
}
