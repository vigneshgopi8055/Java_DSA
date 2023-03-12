package src;

public class Mount_array {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,3,2,1};
        int target = 3;
        System.out.println(search(arr,target));

    }
    static int max(int []nums){
        for (int num : nums) {
            int max = Integer.MIN_VALUE;
            if (nums[num] == max){
                return max;
            }
        }
        return 0;
    }

    static int search(int []nums , int target){
        int start = 0;
        int end = max(nums);
        while(start<=end){
            int mid = start + (end - start)/2;
            if (target<nums[mid]){
                end = mid-1;
            } else if (target>nums[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }
        }

        return start;
    }
}
