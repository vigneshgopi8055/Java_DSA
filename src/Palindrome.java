package src;

import java.util.Scanner;
//To find out whether the given String is Palindrome or not.

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string");
        String str = in.next();
        String rev = "";
        for (int i = str.length()-1;i>=0 ; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
