package ru.RomanYuzyuk.java.basic.homeworks.homeWorkLesson5;

import java.util.Objects;

public class homeWorkLesson5 {
    public static void main(String[] args) {
    }

    public static void printStringSpecifiedNumbers (String stringForPrint, int counter) {
        for (int i = 0; i < counter; i++) {
            System.out.println(stringForPrint);
        }
    }

    public static void fillArraySpecifiedNumber(int number, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = number;
        }
    }

    public static void increaseEachElementArrayBySpecifiedNumber(int number, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] += number;
        }
    }

    public static void printBiggestSumArraySide(int[] array) {
        // В задании небыло, решил добавить
        if(array.length % 2 != 0) {
            System.out.println("Длинна массива должна быть минимум 2 элемента и длинна массива должна делиться на 2");
            return;
        }

        int counter = 0;
        int leftSideEndPosition = array.length / 2;

        for (int i = 0; i < array.length; i++) {
            if (leftSideEndPosition > i) {
                counter += array[i];
                continue;
            }

            counter -= array[i];
        }

        // В задании небыло, решил добавить
        if (counter == 0) {
            System.out.println("сумма элементов половин массива равны");
            return;
        }

        String side = counter > 0 ? "левой" : "правой";

        System.out.println("сумма элементов " + side + " половины массива больше");
    }

    public static int[] sumArraysItems (int[] firstArray, int[] secondArray, int[] thirdArray ) {
        int[] longestArray;

        if (firstArray.length > secondArray.length) {
            longestArray = firstArray;
        } else if (secondArray.length > thirdArray.length) {
            longestArray = secondArray;
        } else {
            longestArray = thirdArray;
        }

        int[] resultArray =  new int[longestArray.length];

        for (int i = 0; i < longestArray.length; i++) {
            if(firstArray.length > i){
                resultArray[i] += firstArray[i];
            }
            if(secondArray.length > i){
                resultArray[i] += secondArray[i];
            }
            if(thirdArray.length > i){
                resultArray[i] += thirdArray[i];
            }
        }

        return resultArray;
    }

    public static boolean isArraySumSidesEqual (int[] array) {
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            int leftSideSum = 0;
            int rightSideSum = 0;

            for (int j = 0; j < array.length; j++) {
                if(j <= i) {
                    leftSideSum += array[j];
                } else {
                    rightSideSum += array[j];
                }
            }
            result = rightSideSum == leftSideSum;

            if(result) break;
        }
        return result;
    }

    public static boolean isCorrectArrayDirection (int[] array, String direction) {
        if(!Objects.equals(direction, "ASC") && !Objects.equals(direction, "DESC")) {
            System.out.println("Не верно передано направление сортировки");
            return false;
        }

        boolean isCorrect = true;
        for (int i = 0; i < array.length - 1; i++) {
            isCorrect = Objects.equals(direction, "ASC") ? array[i] <= array[i + 1] : array[i] > array[i + 1];

            if(!isCorrect) {
                break;
            }
        }

        return isCorrect;
    }

    public static int[] arrayReverse(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[array.length - i - 1] = array[i];
        }
        return result;
    }
}
