package src;

import java.util.Arrays;

public class Majority_Element {
    public static void main(String[] args) {
        int []arr = {2,2,1,1,1,2,2};
        sort(arr);

        System.out.println(sort(arr));
    }
    static int sort(int []nums){
        int majorityCount = nums.length/2;

        for (int num : nums) {
            int count = 0;
            for (int elem : nums) {
                if (elem == num) {
                    count += 1;
                }
            }

            if (count > majorityCount) {
                return num;
            }

        }

        return -1;
    }
}
