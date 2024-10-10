package ru.roman.yuzyuk.java.basic.homeworks.lesson29;

import java.util.*;

public class Main {
    public static void main(String[] args) {}

    public static int[] getItemsAfterLastOne(int[] input) {
        List<Integer> res = new ArrayList<>();

        if (input.length == 0) {
            throw new RuntimeException("input - должен содержать еденицу");
        }

        for (int i = input.length - 1; i >= 0; i--) {
            if (input[i] == 1) break;

            if (i == 0 && input[i] != 1) {
                throw new RuntimeException("input - должен содержать еденицу");
            }

            res.add(input[i]);
        }

        Collections.reverse(res);
        return res.stream().mapToInt(i -> i).toArray();
    }

    public static boolean checkHasOnlyOneAndTwo(int[] input) {
        int oneCounter = 0;
        int twoCounter = 0;
        for (int i : input) {
            if (i != 2 && i != 1) return false;

            if (i == 1) {
                oneCounter++;
                continue;
            };

            twoCounter++;
        }

        return oneCounter > 0 && twoCounter > 0;
    }
}
