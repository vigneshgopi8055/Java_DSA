package src;

import java.util.Arrays;

public class Sort_People {
    public static void main(String[] args) {
        String []name = {"Mary","John","Emma"};
        int[] heights = {180,165,170};
        String []ans = sort(name,heights);
        System.out.println(Arrays.toString(ans));

    }

    static String[] sort(String[] names, int[] heights){
        int n = heights.length;
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; ++i) {
            arr[i] = new int[] {heights[i], i};
        }


        Arrays.sort(arr, (a, b) -> b[0] - a[0]);
        String[] ans = new String[n];
        for (int i = 0; i < n; ++i) {
            ans[i] = names[arr[i][1]];
        }
        return ans;
    }
}
