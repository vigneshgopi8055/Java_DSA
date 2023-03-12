package src;

public class LinearSearch {
    public static void main(String[] args) {
        int []nums = {1,2,3,4,5,6,7,89};
        int target = 10;
        System.out.println(ls(nums,target));
    }
    static boolean ls(int []nums , int target){
        for (int i = 0 ; i< nums.length ; i++){
            if (nums[i] == target){
                return true;
            }
        }
        return false;
    }
}
