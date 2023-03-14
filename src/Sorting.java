package src;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int []arr = {4,2,5,1,3};
        Bubble(arr);
        System.out.println("Bubble sort : " + Arrays.toString(arr));
        selection(arr);
        System.out.println("selection sort : " + Arrays.toString(arr));
        insertion(arr);
        System.out.println("insertion sort : " + Arrays.toString(arr));
        cyclic(arr);
        System.out.println("cyclic sort : " + Arrays.toString(arr));
    }
    static int Bubble(int []nums){
        for (int i = 0 ; i< nums.length ; i++){
            for (int j = 1; j < nums.length-i ; j++) {
                if (nums[j]<nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }

            }
        }
        return 0;
    }
    static int selection(int []nums){
        for (int i = 0; i < nums.length-1; i++) {
            int index = i;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j] < nums[index])
                    index = j;
            }
            int temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;
        }
        return 0;
    }

    static int insertion(int []nums){
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
    static int cyclic(int []nums){
        int i = 0;
        while (i< nums.length){
            int correct_index = nums[i] - 1;
            if (nums[i] != nums[correct_index]){
                int temp = nums[i];
                nums[i] = nums[correct_index];
                nums[correct_index] = temp;
            }else {
                i++;
            }
        }
        return 0;
    }

}
