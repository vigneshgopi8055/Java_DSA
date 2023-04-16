package src;

import java.util.ArrayList;
import java.util.List;

public class SubSeq_Of_String {
    public static void main(String[] args) {
        String s = "abc";
        subseq("","abc");

    }
    static void subseq(String p , String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p+ch , up.substring(1));
        subseq(p,up.substring(1));
    }
}
