package ru.roman.yuzyuk.java.basic.homeworks.homeWorkLesson10.Animals;

public class Horse extends Animal{
    public Horse(String name, short runningSpeed, short swimmingSpeed) {
        super(name, runningSpeed);
        this.swimmingSpeed = swimmingSpeed;
        this.staminaSwimmingCost = 4;
    }
}
