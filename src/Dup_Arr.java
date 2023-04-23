package src;

import java.util.ArrayList;

public class Dup_Arr {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,3,2,1};
        System.out.println(dup(arr));
    }
    static int sort(int []nums){
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (nums[j] < nums[j - 1]) {    //Ascending order
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        return 0;
    }
    static ArrayList<Integer> dup(int []nums){
        sort(nums);
        ArrayList<Integer> arr = new ArrayList();
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] != nums[i+1]){
                arr.add(nums[i]);

            }
        }
        arr.add(nums[nums.length-1] );
        return arr;
    }
}
