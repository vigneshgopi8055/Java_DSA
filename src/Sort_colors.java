package src;
//https://leetcode.com/problems/sort-colors/
public class Sort_colors {
    public static void main(String[] args) {
        int []nums = {2,0,2,1,1,0};
        System.out.println(sort(nums));
    }

    static void sort(int[] nums){
        for (int i = 0 ; i<nums.length;i++){
            for (int j=1 ; j< nums.length-i ; j++){
                if (nums[j]<nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }

    }
}
