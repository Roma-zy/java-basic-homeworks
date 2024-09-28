package ru.roman.yuzyuk.java.basic.homeworks.lesson25;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple(1.0f));
        appleBox.addFruit(new Apple(1.2f));

        System.out.println("Вес коробки с яблоками: " + appleBox.weight());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange(0.9f));
        orangeBox.addFruit(new Orange(2.2f));

        System.out.println("Вес коробки с апельсинами: " + orangeBox.weight());

        Box<Fruit> fruitBox = new Box<>();

        orangeBox.transferFruitsTo(fruitBox);
        appleBox.transferFruitsTo(fruitBox);

        System.out.println("Вес коробки с яблоками после пересыпания: " + appleBox.weight());
        System.out.println("Вес коробки с апельсинами после пересыпания: " + orangeBox.weight());
        System.out.println("Вес коробки с фруктами: " + fruitBox.weight());
    }
}
