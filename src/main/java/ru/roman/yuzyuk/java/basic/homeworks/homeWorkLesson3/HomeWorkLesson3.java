package ru.roman.yuzyuk.java.basic.homeworks.homeWorkLesson3;

import java.util.Scanner;

public class HomeWorkLesson3 {
    public static void main(String[] args) {
        callingMethodByEnteredNumber();
    }

    public static void greetings() {
        System.out.println("Hello\nWorld\nfrom\nJava");
    }

    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
            return;
        }

        System.out.println("Сумма отрицательная");
    }

    public static void selectColor(int data) {
        if (data <= 10) {
            System.out.println("Красный");
            return;
        }

        if (data <= 20) {
            System.out.println("Желтый");
            return;
        }

        System.out.println("Зеленый");
    }

    public static void compareNumbers(int a, int b) {
        System.out.println(a >= b ? "a >= b" : "a < b");
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        int result = increment ? initValue + delta : initValue - delta;

        System.out.println(result);
    }

    // Хохмы ради сделал по ТЗ =))
    public static void addOrSubtractAndPrint2(int initValue, int delta, boolean increment) {
        if (increment) {
            int result = initValue + delta;
            System.out.println(result);
        } else {
            initValue -= delta;
        }
    }

    public static void callingMethodByEnteredNumber () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите число от 1 до 5:");
        int methodNumber = scanner.nextInt();

        switch (methodNumber) {
            case 1:
                greetings();
                break;
            case 2:
                int a = generateRandomNumberInInterval(-100, 100);
                int b = generateRandomNumberInInterval(-100, 100);
                int c = generateRandomNumberInInterval(-100, 100);
                checkSign(a, b, c);
                break;
            case 3:
                selectColor(generateRandomNumberInInterval(1, 30));
                break;
            case 4:
                compareNumbers(generateRandomNumberInInterval(1, 100), generateRandomNumberInInterval(1, 100));
                break;
            case 5:
                int d = generateRandomNumberInInterval(1, 100);
                int e = generateRandomNumberInInterval(1, 100);
                boolean randomBool = generateRandomNumberInInterval(1, 2) == 1;
                addOrSubtractAndPrint(d, e, randomBool);
                break;
            default:
                System.out.println("Выбрано не верное число");
                break;
        }
    }

    public static int generateRandomNumberInInterval(int min, int max) {
        return min + (int) (Math.random() * (max - min + 1));
    }
}
