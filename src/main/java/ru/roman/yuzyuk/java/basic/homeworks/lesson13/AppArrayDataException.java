package ru.roman.yuzyuk.java.basic.homeworks.lesson13;

public class AppArrayDataException extends Exception {
    AppArrayDataException(int i, int j) {
        super("The cell at coordinates " + i + ":" + j + " contains incorrect data");
    }

    AppArrayDataException(String errorMessage) {
        super(errorMessage);
    }
}
