package ru.roman.yuzyuk.java.basic.homeworks.object.value;

public class EnergyAmount {
    private final byte min = 1;
    private final byte max = 50;
    private final byte amount;

    public EnergyAmount(byte amount) {
        if (isValidAmount(amount)) {
            this.amount = amount;
        } else {
            throw new IllegalArgumentException("Энергии н может быть меньше " + min + " и больше " + max);
        }
    }

    public byte getAmount() {
        return amount;
    }

    private boolean isValidAmount(short amount) {
        return amount >= min && amount <= max;
    }
}
