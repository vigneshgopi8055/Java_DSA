package src;

import java.util.ArrayList;

public class Factors_of_Number {
    public static void main(String[] args) {
        System.out.println(factors(6));
    }
    static ArrayList<Integer> factors(int n){
        ArrayList<Integer>list = new ArrayList<>();
        for (int i = 1; i <= n ; i++) {
            if (n%i==0){
                list.add(i);
            }
        }
        return list;
    }
}
