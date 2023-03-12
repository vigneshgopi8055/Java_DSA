package src;

import java.util.Arrays;

public class Count_neg {
    public static void main(String[] args) {
        int [][]arr = {{5,1,0},
                {-5,-5,-5}};
        System.out.println(search(arr));
    }
    static int search(int [][]arr){
        int count = 0;
        for (int i = 0 ; i< arr.length ; i++){
            for (int j = 0 ; j<arr[i].length ; j++){
                 if (arr[i][j]<0){
                        count++;
                }
            }
        }

        return count;
    }
}
