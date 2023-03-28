package src;

public class Linear_Search_Recursion {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        System.out.println(search(arr,7,0));
    }
    static int search(int []arr,int target,int index){
        if (index == arr.length){
            return -1;
        }
        if (target == arr[index]){
            return index;
        }
        return search(arr,target,index+1);
    }
}
