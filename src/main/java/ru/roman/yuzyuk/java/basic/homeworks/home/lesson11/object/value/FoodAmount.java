package ru.roman.yuzyuk.java.basic.homeworks.home.lesson11.object.value;

public class FoodAmount {
    private final short min = 1;
    private final short max = 3000;
    private final short amount;
    
    public FoodAmount(short amount) throws IllegalArgumentException {
        if (isValidAmount(amount)) {
            this.amount = amount;
        } else {
            throw new IllegalArgumentException("Еды н может быть меньше " + min + " и больше " + max);
        }
    }

    // Геттер для количества
    public short getAmount() {
        return amount;
    }

    // Метод для проверки валидности количества
    private boolean isValidAmount(short amount) {
        return amount >= min && amount <= max;
    }
}
