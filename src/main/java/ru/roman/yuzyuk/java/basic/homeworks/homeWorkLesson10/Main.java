package ru.roman.yuzyuk.java.basic.homeworks.homeWorkLesson10;

import ru.roman.yuzyuk.java.basic.homeworks.homeWorkLesson10.Animals.Cat;
import ru.roman.yuzyuk.java.basic.homeworks.homeWorkLesson10.Animals.Dog;
import ru.roman.yuzyuk.java.basic.homeworks.homeWorkLesson10.Animals.Horse;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("cat", (short) 2);
        Dog dog = new Dog("dog", (short) 3, (short) 2);
        Horse horse = new Horse("horse", (short) 5, (short) 1);

        System.out.println("Что то делает кот");
        cat.info();
        System.out.println(cat.swim(10));
        cat.info();
        System.out.println(cat.run(10));
        cat.info();
        cat.run(140);
        cat.info();
        cat.run(140);
        cat.info();
        System.out.println();

        System.out.println("Что то делает собака");
        dog.info();
        System.out.println(dog.swim(10));
        dog.info();
        System.out.println(dog.run(30));
        dog.info();
        dog.swim(140);
        dog.info();
        dog.swim(140);
        dog.info();
        System.out.println();

        System.out.println("Что то делает конь");
        horse.info();
        System.out.println(horse.swim(10));
        horse.info();
        System.out.println(horse.run(10));
        horse.info();
        horse.swim(200);
        horse.info();
        horse.swim(200);
        horse.info();
    }
}
