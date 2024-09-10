package ru.roman.yuzyuk.java.basic.homeworks.lesson19;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();

        firstImplementation();
        System.out.println("Метод firstImplementation отработал за " + (System.currentTimeMillis() - startTime) + "мс.");

        startTime = System.currentTimeMillis();

        secondImplementation();
        System.out.println("Метод secondImplementation отработал за " + (System.currentTimeMillis() - startTime) + "мс.");
    }

    private static void firstImplementation() {
        double[] result = new double[100_000_000];
        for (int i = 0; i < 100_000_000; i++) {
            result[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
    }

    private static void secondImplementation() throws InterruptedException {
        double[] result = new double[100_000_000];
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 25_000_000; i++) {
                result[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 25_000_001; i < 50_000_000; i++) {
                result[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });
        Thread t3 = new Thread(() -> {
            for (int i = 50_000_001; i < 75_000_000; i++) {
                result[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });
        Thread t4 = new Thread(() -> {
            for (int i = 75_000_001; i < 100_000_000; i++) {
                result[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });
        t1.join();
        t2.join();
        t3.join();
        t4.join();
    }
}
