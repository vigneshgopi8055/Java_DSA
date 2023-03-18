import java.util.Arrays;

class Three_sum {
    public static void main(String[] args) {
        int []arr = {0,1,1};
        int []ans = four(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] three(int []nums){
        int []ans = new int[3];
        ans = new int[]{};
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length-i ; j++) {
                for (int k = 2; k < nums.length-i-j ; k++) {
                    if (nums[i]+nums[j]+nums[k] == 0){
                        ans[0] = nums[i];
                        ans[1] = nums[j];
                        ans[2] = nums[k];
                    }else {
                        return ans;
                    }
                }
            }
        }
        return ans;
    }
}