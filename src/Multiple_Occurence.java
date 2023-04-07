package src;

import java.util.ArrayList;

public class Multiple_Occurence {
    public static void main(String[] args) {
        int []arr = {5,7,7,8,8,10};
        Findindex(arr,8,0);
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
