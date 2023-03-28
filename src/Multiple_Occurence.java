package src;

import java.util.ArrayList;

public class Multiple_Occurence {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,3,2,1};
        Findindex(arr,2,0);
        System.out.println(list);
    }
    static ArrayList<Integer>list =new ArrayList<>();
    static void Findindex(int []arr , int target , int index){
        if (index == arr.length)
            return;
        if (arr[index] == target)
            list.add(index);
        Findindex(arr,target,index+1);
    }
}
