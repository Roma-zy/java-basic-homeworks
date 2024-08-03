package ru.roman.yuzyuk.java.basic.homeworks.homeWorkLesson10.Animals;

public class Dog extends Animal{
    public Dog(String name, short runningSpeed, short swimmingSpeed) {
        super(name, runningSpeed);
        this.swimmingSpeed = swimmingSpeed;
        this.staminaSwimmingCost = 2;
    }
}
