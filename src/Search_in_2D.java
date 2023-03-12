package src;

import java.util.Arrays;

public class Search_in_2D {
    public static void main(String[] args) {
        int [][]nums = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target = 6;
        int []ans = search(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int [][]nums , int target){
        for (int i = 0 ; i< nums.length;i++){
            for (int j = 0 ; j< nums.length;j++){
                if (target == nums[i][j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
