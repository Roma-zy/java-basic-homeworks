package ru.roman.yuzyuk.java.basic.homeworks.lesson12.human;

import ru.roman.yuzyuk.java.basic.homeworks.lesson12.IMoveble;
import ru.roman.yuzyuk.java.basic.homeworks.lesson12.terrain.Terrain;
import ru.roman.yuzyuk.java.basic.homeworks.lesson12.transport.Transport;
import ru.roman.yuzyuk.java.basic.homeworks.object.value.Name;

public class Human implements IMoveble {
    String name;
    IMoveble currentTransport;

    public Human(Name name) {
        this.name = name.getName();
    }

    public String getName() {
        return name;
    }

    public IMoveble getCurrentTransport() {
        return currentTransport;
    }

    public Human chooseTransport(Transport transport) {
        if (currentTransport != null) {
            System.out.println("Транспорт уже выбран, нужно его оставить!!!");

            return this;
        }

        System.out.println(name + " выбрал транспорт...");
        currentTransport = transport;

        return this;
    }

    public Human leaveTransport() {
        if (currentTransport == null) {
            System.out.println("Транспорт не был выбран, нечего оставить!!!");

            return this;
        }

        System.out.println(name + " оставил транспорт...");
        currentTransport = null;

        return this;
    }

    @Override
    public boolean move(Terrain terrain) {
        if (currentTransport == null) {
            System.out.println(name + " отправился пешком...");
            return true;
        }

        return currentTransport.move(terrain);
    }

    @Override
    public boolean canMove() {
        return true;
    }
}
