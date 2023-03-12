package src;

public class Ceiling_floor {
    public static void main(String[] args) {
        int []nums = {2,3,5,9,14,16,18};
        int target = 15;
        System.out.println(ceiling(nums,target));
        System.out.println(floor(nums,target));

    }
    static int ceiling(int[] nums , int target){
        int start = 0;
        int end = nums.length-1;
        while (start<=end){
            int mid = start + (end - start)/2;
            if (target < nums[mid]){
                end = mid-1;
            } else if (target>nums[mid]) {
                start = mid+1;
            }else {
                return nums[mid];
            }
        }
        return nums[start];
    }
    static int floor(int[] nums , int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return nums[mid];
            }
        }
        return nums[end];
    }

}
