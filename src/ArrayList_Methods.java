package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList_Methods {
    public static void main(String[] args) {
        String s1 = "hello my name is vignesh";
        String[] ban = {"name"};
        String []s2 = s1.split(" ");
        ArrayList<String> list = new ArrayList<>(List.of(s2));
        String s3 = Arrays.toString(ban);
        System.out.println(list);
        System.out.println(s3);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(ban[0])){
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
