package ru.roman.yuzyuk.java.basic.homeworks.lesson28;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    private final Object monitor = new Object();
    private int counter = 0;

    public static void main(String[] args) {
        Main app = new Main();

        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.submit(() -> app.printA());
        executor.submit(() -> app.printB());
        executor.submit(() -> app.printC());

        executor.shutdown();
    }

    public void printA() {
        synchronized (monitor) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (counter != 0) {
                        monitor.wait();
                    }
                    System.out.print('A');
                    counter++;
                    monitor.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printB() {
        synchronized (monitor) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (counter != 1) {
                        monitor.wait();
                    }
                    System.out.print('B');
                    counter++;
                    monitor.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printC() {
        synchronized (monitor) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (counter != 2) {
                        monitor.wait();
                    }
                    System.out.print('C');
                    counter = 0;
                    monitor.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

