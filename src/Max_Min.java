package src;

public class Max_Min {
    public static void main(String[] args) {
        int []arr = {3, 2, 1, 56, 10000, 167};
        System.out.println(max_min(arr));
    }
    static String max_min(int []arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];

            }
        }
        System.out.println("max value is " + max);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min = arr[i];

            }
        }
        return "min value is " + min;
    }
}
