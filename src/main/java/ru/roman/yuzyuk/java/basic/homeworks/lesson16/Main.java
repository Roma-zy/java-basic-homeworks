package ru.roman.yuzyuk.java.basic.homeworks.lesson16;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(8);
        list.add(10);

        SearchTree<Integer> tree = new SearchTree<>(list);

        System.out.println(tree.find(6));
        System.out.println(tree.getSortedList());
    }
}
