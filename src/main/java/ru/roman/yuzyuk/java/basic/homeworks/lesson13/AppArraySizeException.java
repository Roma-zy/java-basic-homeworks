package ru.roman.yuzyuk.java.basic.homeworks.lesson13;

public class AppArraySizeException extends Exception {
    AppArraySizeException() {
        super("Incorrect array length");
    }

    AppArraySizeException(String errorMessage) {
        super(errorMessage);
    }
}
