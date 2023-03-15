package src;

import java.util.*;

import static java.util.Collections.list;

public class Array_list {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //adding elements
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        System.out.println(list);

        //get elements;
        int element = list.get(3);
        System.out.println(element);

        //add elements in between
        list.add(2,10);
        System.out.println(list);

        //deleting elements
        list.remove(4);
        System.out.println(list);

        //size of list
        int size = list.size();
        System.out.println(size);

        //sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
