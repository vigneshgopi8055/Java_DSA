package src;

import java.util.ArrayList;
import java.util.Arrays;

public class Duplicates_Array {
    public static void main(String[] args) {
        int []arr = {-2,1,-3,4,-1,2,1,-5,4};
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {

                if (arr[i] != arr[i+1])
                    list.add(arr[i]);
        }
        System.out.println(list);
    }
}
