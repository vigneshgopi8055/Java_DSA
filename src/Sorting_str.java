package src;
//Sorting in String

import java.util.Arrays;

public class Sorting_str {
    public static void main(String[] args) {
        String s1 = "hello world my name is";
        String[] a = s1.split(" ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length-i; j++) {
                if (a[j].length()<a[j-1].length()){
                    String temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
