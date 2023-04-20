package src;

import java.util.ArrayList;

public class Sliding_Window {
    public static void main(String[] args) {
        int []nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        ArrayList ans = new ArrayList<>();
        System.out.println(sw(nums,0,k-1,ans));
    }
    static ArrayList sw(int []arr , int i , int j , ArrayList list){
        while (j<arr.length) {
            list.add(max(arr, i, j));
            sw(arr, i + 1, j + 1, list);
            return list;
        }
        return null;
    }

    static int max(int []arr , int start , int end){
        int ans = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i]>ans)
                ans=arr[i];
        }
        return ans;
    }
}
