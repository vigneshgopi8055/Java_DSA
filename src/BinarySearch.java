package src;

public class BinarySearch {
    public static void main(String[] args) {
        int []nums = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target = 22;
        System.out.println(search(nums,target));

    }
    static int search(int []nums , int target){
        int start = 0;
        int end = nums.length-1;
        while (start<=end){
            int mid = start + (end - start)/2;
            if (target<nums[mid]){
                end = mid-1;
            } else if (target>nums[mid]) {
                start = mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
