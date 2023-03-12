package src;

public class Peak_index {
    public static void main(String[] args) {
        int []arr = {0,2,1,0,5,4,2};
        System.out.println(peak(arr));
    }
    static int peak(int []arr ){
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0 ; i< arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
                index = i;

            }
        }

     return index;
    }
}
