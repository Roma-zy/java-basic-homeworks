package ru.roman.yuzyuk.java.basic.homeworks.lesson12.transport;

import ru.roman.yuzyuk.java.basic.homeworks.lesson12.terrain.Terrain;

final public class Bike extends Transport {
    public Bike() {
        this.forestCostFactor = 2;
        this.plainCostFactor = 1;
    }

    protected boolean moveThroughForest(Terrain terrain) {
        System.out.println("Отправляемся на велике по лесу...");

        return true;
    }

    protected boolean moveThroughPlain(Terrain terrain) {
        System.out.println("Отправляемся на велике по полю...");

        return true;
    }

    protected boolean moveThroughSwamp(Terrain terrain) {
        System.out.println("Буль буль велик утонул...");

        return false;
    }
}
