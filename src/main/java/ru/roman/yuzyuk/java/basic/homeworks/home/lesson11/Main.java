package ru.roman.yuzyuk.java.basic.homeworks.home.lesson11;

import ru.roman.yuzyuk.java.basic.homeworks.home.lesson11.animal.Cat;
import ru.roman.yuzyuk.java.basic.homeworks.home.lesson11.container.Bowl;
import ru.roman.yuzyuk.java.basic.homeworks.home.lesson11.object.value.FoodAmount;
import ru.roman.yuzyuk.java.basic.homeworks.home.lesson11.object.value.Name;

public class Main {
    public static void main(String[] args) {
        Bowl bowl = new Bowl(new FoodAmount((short) 25));
        Cat[] cats = {
                new Cat(new Name("Катышка"), new FoodAmount((short) 5)),
                new Cat(new Name("Пятнышка"), new FoodAmount((short) 7)),
                new Cat(new Name("Толстяк обжоркин"), new FoodAmount((short) 80)),
                new Cat(new Name("Смурфета"), new FoodAmount((short) 7)),
                new Cat(new Name("Егор"), new FoodAmount((short) 10)),
        };

        for (Cat cat : cats) {
            System.out.println("Сытость " + cat.getName() + ": " + cat.feed(bowl).getSatiety());
        }
    }
}
