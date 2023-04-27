package src;

import java.util.ArrayList;

public class Lamda_Function {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        list.forEach((i) -> System.out.println(i));
    }
}
