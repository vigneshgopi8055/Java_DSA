package src;

public class Max_max {
    public static void main(String[] args) {
        int[] arr = {23, 67, 12, 45, 78, 2};
        System.out.println(MaxVal(arr));
        System.out.println(Minval(arr));
    }
    static int MaxVal(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int Minval(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];

            }
        }
        return min;
    }
}