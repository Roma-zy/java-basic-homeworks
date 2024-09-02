package ru.roman.yuzyuk.java.basic.homeworks.lesson18.server.calculator;

public class Calculator {
    public static String getAvailableOperations() {
        return "+,-,*,/";
    }
    
    public static double sum(double a, double b) {
        return a + b;
    }


    public static double difference(double a, double b) {
        return a - b;
    }

    public static double division(double a, double b) {
        return a / b;
    }

    public static double multiplication(double a, double b) {
        return a * b;
    }
}
