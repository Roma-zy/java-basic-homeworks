package ru.roman.yuzyuk.java.basic.homeworks.homeWorkLesson9;

import ru.roman.yuzyuk.java.basic.homeworks.homeWorkLesson9.object.value.Color;

import java.time.Year;

public class Main {
    public static void main(String[] args) {
        User[] arrUser = {
            new User("Roman", "Yuzyuk", "Valentinovch", (short) 1991, "mail@mail.ru"),
            new User("Mihail", "Ivanov", (short) 1994),
            new User("Elena", "Romanova", "Mihailovna", (short) 1950),
            new User("Dima", "Petrov", (short) 1955, "mail@mail.com"),
            new User("Viktor", "Petrov", "Petrovich",(short) 1966),
            new User("Anna", "Sidorova", "Olegovana",(short) 1976, "mail1@mail.com"),
            new User("Jenia", "Lebedeva", "Artemovna",(short) 1999),
            new User("Ksenia", "Voroncova", "RomAnnovna",(short) 2000, "mail2@mail.com"),
            new User("Oleg", "Soloviev", "Pavlovich",(short) 2023),
            new User("Vikrom", "Vorobiev", "aleksandrovich",(short) 1984, "mail3@mail.com"),
        };


        final short ageToShowInfo = 40;
        final int currentYear = Year.now().getValue();
        for (User user: arrUser) {
            if (currentYear - user.getYearBirth() < ageToShowInfo) continue;

            user.showInfo();
            System.out.println();
        }

        Color color = new Color("#FFFFFF");
        Box box = new Box(100, 200, 100, color);

        box
            .showInfo()
            .open()
            .fill("Бриллиант")
            .close()
            .clear()
            .open()
            .clear()
            .fill("Телефон")
            .repaint(new Color("#000000"))
            .showInfo();
    }
}
