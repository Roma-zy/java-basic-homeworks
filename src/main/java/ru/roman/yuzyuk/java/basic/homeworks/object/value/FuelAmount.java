package ru.roman.yuzyuk.java.basic.homeworks.object.value;

public class FuelAmount {
    private final byte min = 1;
    private final byte max = 100;
    private final byte amount;

    public FuelAmount(byte amount) {
        if (isValidAmount(amount)) {
            this.amount = amount;
        } else {
            throw new IllegalArgumentException("Топрлива н может быть меньше " + min + " и больше " + max);
        }
    }

    public byte getAmount() {
        return amount;
    }

    private boolean isValidAmount(short amount) {
        return amount >= min && amount <= max;
    }
}
