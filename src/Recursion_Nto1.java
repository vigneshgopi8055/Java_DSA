package src;

import java.util.Scanner;

public class Recursion_Nto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recurse(n);
    }
    static void recurse(int n){
        if (n == 0){
            return;
        }
        recurse(n-1);
        System.out.println(n);
    }
}
