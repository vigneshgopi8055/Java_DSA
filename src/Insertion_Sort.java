package src;

import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 3, 2};
        sortAsc(arr);
        System.out.println(Arrays.toString(arr));
        sortDesc(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int sortAsc(int[] nums) {
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

    static int sortDesc(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (nums[j] > nums[j - 1]) {    //Descending order
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
}
