package src;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int []arr = {5,4,3,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
    static int bubble(int []nums ){
        for (int i = 0 ; i<nums.length;i++){
            for (int j = 1 ; j< nums.length-i;j++){
                if (nums[j]<nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }
        return 0;
    }
}
