package src;

//Build Array from Permutation
public class Array_Permutation {
    public static void main(String[] args) {
        int []nums = {0,2,1,5,3,4};

        System.out.println(Arrper(nums));

    }
    static int[] Arrper(int []nums){
        final int n = nums.length;

        for (int i = 0; i < n; ++i)
            nums[i] += n * (nums[nums[i]] % n);

        for (int i = 0; i < n; ++i)
            nums[i] /= n;

        return nums;
    }

}
