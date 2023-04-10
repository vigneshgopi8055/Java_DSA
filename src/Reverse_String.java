package src;

public class Reverse_String {
    public static void main(String[] args) {
        String s1 = "abcd";
        rev(s1,s1.length()-1);
    }
    static void rev(String s, int index){
       if (index == 0) {
           System.out.println(s.charAt(0));
           return;
       }
        System.out.print(s.charAt(index));
        rev(s,index-1);
    }
}
