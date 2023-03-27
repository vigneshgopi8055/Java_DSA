package src;

import java.util.Scanner;

public class Recursion_1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recurse(n);
    }
    static void recurse(int n){
        if (n == 0) {
            return;
        }
        System.out.println(n);
        recurse(n-1);
    }
}
