package com.zenan.practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class test {
    public static void main(String[] args) {
        String string = "string";
        System.out.println(string.indexOf(""));
//        List<Integer> list = Arrays.asList(-1, 0, 1, 2, -1, -4);
//        int[] array = new int[]{-1, 0, 1, 2, -1, -4};
//        Integer[] arrays1 = Arrays.stream(array).boxed().toArray(Integer[]::new);
//        List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(-1, 0, 1, 2, -1, -4));
//        List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(arrays1));
//        System.out.println(list1.subList(1, 2));
//        System.out.println(list2.subList(1, 2));

//        Integer[] array = new Integer[]{2, 1, 3, 5, 4};
//        List<Integer> list = Arrays.asList(array);
//        System.out.print("old array: ");
//        for (Integer i : array) {
//            System.out.print(i);
//        }
//        System.out.println();
//        System.out.print("old list: ");
//        for (Integer i : list) {
//            System.out.print(i);
//        }
//        System.out.println();
//        list.set(2, 9);
//
//        System.out.print("new array: ");
//        for (Integer i : array) {
//            System.out.print(i);
//        }
//        System.out.println();
//        System.out.print("new list: ");
//        for (Integer i : list) {
//            System.out.print(i);
//        }
//        System.out.println();
        List<String> names = new ArrayList<String>() {{
            add("aaa");
            add("bbb");
            add("ccc");
            add("ddd");
            add("eee");
        }};

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if ("ccc".equals(s)) {
                iterator.remove();
            }
        }

        for (String name : names) {
            System.out.println(name);
        }
    }
}
