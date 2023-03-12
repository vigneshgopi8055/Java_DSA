package src;

public class Search_in_Range {
    public static void main(String[] args) {
        int []nums = {1,2,3,4,5,6,7,8,9};
        int target = 5;
        int index1 = 3;
        int index2 = 7;
        System.out.println(search(nums,target,index1,index2));
    }
    static boolean search(int[]nums , int target , int index1 , int index2){
        for (int i = index1 ; i<=index2 ; i++){
            if (target == nums[i])
                return true;
        }
        return false;
    }
}
