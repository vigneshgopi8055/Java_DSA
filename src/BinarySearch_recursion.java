package src;

public class BinarySearch_recursion {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,89};
        int target = 5;
        System.out.println(search(arr,target,0,arr.length-1));

    }
    static int search(int []arr , int target , int s , int e){
        if (s>e){
            return -1;
        }
        int m = s + (e - s)/2;
        if (arr[m] == target){
            return m;
        }
        if (arr[m] > target){
            return search(arr,target,s,e-1);
        }else {
            return search(arr,target,s+1,e);
        }
    }
}
