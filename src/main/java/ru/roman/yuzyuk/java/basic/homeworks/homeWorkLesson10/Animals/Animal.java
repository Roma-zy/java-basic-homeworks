package ru.roman.yuzyuk.java.basic.homeworks.homeWorkLesson10.Animals;

import java.util.Objects;

public abstract class Animal {
    protected String name;
    protected short runningSpeed;
    protected short swimmingSpeed;
    protected short stamina;
    protected byte staminaRunningCost;
    protected byte staminaSwimmingCost;

    public Animal(String name, short runningSpeed) {
        this.name = name;
        this.stamina = 100;
        this.runningSpeed = runningSpeed;
        this.staminaRunningCost = 1;
    }

    public String getName() {
        return name;
    }

    public short getRunningSpeed() {
        return runningSpeed;
    }

    public short getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public short getStamina() {
        return stamina;
    }

    public byte getStaminaRunningCost() {
        return staminaRunningCost;
    }

    public byte getStaminaSwimmingCost() {
        return staminaSwimmingCost;
    }

    public void info() {
        System.out.println("Имя: " + name);
        System.out.println("Скорость бега: " + runningSpeed);
        System.out.println("Скорость плаванья: " + swimmingSpeed);
        System.out.println("Запас сил: " + stamina);
        System.out.println("Затраты на 1 метр бега: " + staminaRunningCost);
        System.out.println("Затраты на 1 метр плаванья: " + staminaSwimmingCost);
    }

    public int run(int distance) {
        if (staminaRunningCost < 1 || runningSpeed < 1) {
            System.out.println(name + " Не умеет бегать!!!");
            return -1;
        }
        if (stamina == 0) {
            System.out.println(name + " валяется без сил");
            return -1;
        }
        int possibleDistance = getPossibleDistance(staminaRunningCost);

        recalculateStamina(Math.min(distance, possibleDistance), staminaRunningCost);

        if (stamina == 0) {
            System.out.println(name + " чувствует усталость! До конца пути: " + (distance - possibleDistance) + " метров");
        } else {
            System.out.println("Заданная дистанция пройдена! " + name + " может пройти еще...");
        }

        return getTravelTime(Math.min(distance, possibleDistance), runningSpeed);
    }

    public int swim(int distance) {
        if (staminaSwimmingCost < 1 || swimmingSpeed < 1) {
            System.out.println(name + " Не умеет плавать!!!");
            return -1;
        }
        if (stamina == 0) {
            System.out.println(name + " бултыхается без сил");
            return -1;
        }
        int possibleDistance = getPossibleDistance(staminaSwimmingCost);

        recalculateStamina(Math.min(distance, possibleDistance), staminaSwimmingCost);

        if (stamina == 0) {
            System.out.println(name + " чувствует усталость! До конца пути: " + (distance - possibleDistance) + " метров");
        } else {
            System.out.println("Заданная дистанция пройдена! " + name + " может проплыть еще...");
        }

        return getTravelTime(Math.min(distance, possibleDistance), swimmingSpeed);
    }

    private int getTravelTime(int distance, short speed) {
        return distance / speed;
    }

    private int getPossibleDistance(byte staminaCost) {
        return stamina / staminaCost;
    }

    private void recalculateStamina(int distance, byte staminaCost) {
        stamina = (short) (stamina - distance * staminaCost);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return runningSpeed == animal.runningSpeed &&
                swimmingSpeed == animal.swimmingSpeed &&
                stamina == animal.stamina &&
                staminaRunningCost == animal.staminaRunningCost &&
                staminaSwimmingCost == animal.staminaSwimmingCost &&
                Objects.equals(name, animal.name);
    }
}
