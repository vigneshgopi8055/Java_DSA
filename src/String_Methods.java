package src;

import java.util.Arrays;

public class String_Methods {
    public static void main(String[] args) {
        String s1 = "hello my name is vignesh";
        String s2 = "   Hello   ";
        //Starts with method
        System.out.println(s1.startsWith("h"));
        //ends with method
        System.out.println(s1.endsWith("nesh"));
        //contains method
        System.out.println(s1.contains(s2));
        //equals method
        System.out.println(s1.equals(s2));
        //equalsIgnoreCase
        System.out.println(s1.equalsIgnoreCase(s2));
        //String length
        System.out.println(s1.length());
        //trim
        System.out.println(s2.trim());
        //to char Array
        char []a = s1.toCharArray();
        System.out.println(Arrays.toString(a));
        //to lowe case
        System.out.println(s1.toLowerCase());
        //to upper case
        System.out.println(s1.toUpperCase());
        // subString
        System.out.println(s1.substring(3,7));
        //split
        System.out.println(Arrays.toString(s1.split(" ")));
        //char at
        System.out.println(s1.charAt(6));
        //replace
        System.out.println(s1.replace("hello","hi"));
        //valueOf
        String s3 = "1789";
        System.out.println(Integer.valueOf(s3));
        int i = 189;
        System.out.println(String.valueOf(i));
    }
}
