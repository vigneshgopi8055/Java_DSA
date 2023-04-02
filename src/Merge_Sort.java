package src;

import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args) {
        int []a = {4,5,6};
        int []b = {1,2,3};
        int []c = new int[a.length+ b.length];
        c = merge(a,b);
        System.out.println(Arrays.toString(sort(c)));
    }
    static int[] merge(int []a,int []b){
        int []c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }
        return c;
    }
    static int[] sort(int []nums){
        for (int i = 0 ; i< nums.length ; i++){
            for (int j = 1; j < nums.length-i ; j++) {
                if (nums[j]<nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }

        return nums;
    }
}
