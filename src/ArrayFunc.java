package src;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFunc {
    public static void main(String[] args) {
        int []arr = new int[5];
        System.out.println(arrfun(arr));

    }

    static int arrfun(int []nums){
        Scanner sc = new Scanner(System.in);
        for (int i = 0 ; i< nums.length;i++){
            nums[i] = sc.nextInt();

        }
        System.out.println(Arrays.toString(nums));

        return 0;
    }
}
