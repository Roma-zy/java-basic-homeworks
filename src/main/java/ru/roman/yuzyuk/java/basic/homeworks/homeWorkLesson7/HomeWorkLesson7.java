package ru.roman.yuzyuk.java.basic.homeworks.homeWorkLesson7;

public class HomeWorkLesson7 {
    public static void main(String[] args) {}

    public static int sumOfPositiveElements(int[][] inputArray) {
        int result = 0;
        for (int[] intArray : inputArray) {
            for (int item : intArray) {
                if (item <= 0) continue;
                result += item;
            }
        }

        return result;
    }

    public static void printSquare(int squareSize) {
        for (int i = 1; i <= squareSize; i++) {
            for (int j = 1; j <= squareSize; j++) {
                if(i == 1 || i == squareSize || j == 1 || j == squareSize) {
                    System.out.print("* ");
                    continue;
                }
                System.out.print("  ");
            }
            System.out.println("");
        }
    }

    public static void resetDiagonalsToZero(int[][] inputArray) {
        for (int[] intsArray : inputArray) {
            if(intsArray.length != inputArray.length) {
                return;
            }
        }

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[i].length; j++) {
               if(i + j == inputArray[i].length - 1 || i == j) {
                   inputArray[i][j] = 0;
               }
            }
        }
    }

    public static int findMax(int[][] inputArray) {
        int result = inputArray[0][0];
        for (int[] intsArray : inputArray) {
            for (int integer : intsArray) {
                result = Math.max(result, integer);
            }
        }

        return result;
    }

    // Решил немного отойти от ТЗ
    public static int calcSumArrayByIndex(int[][] inputArray, int rowIndex) {
        if(rowIndex < 0) return -2;
        if(inputArray.length <= rowIndex) return -1;

        int result = 0;
        for (int integer : inputArray[rowIndex]) {
            result += integer;
        }

        return result;
    }
}
