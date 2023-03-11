package src;
//Subtract the Product and Sum of Digits of an Integer
//link : https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

import java.util.Scanner;

public class LeetCode_1 {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int product = 1 , sum = 0;
        while(n > 0)
        {
            //n % 10 extracts the last digit out of N
            product *= (n % 10);
            sum += (n % 10);
            n /= 10;
        }
        System.out.println(product - sum);
    }
}
