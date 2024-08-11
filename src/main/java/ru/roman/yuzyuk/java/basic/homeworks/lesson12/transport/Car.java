package ru.roman.yuzyuk.java.basic.homeworks.lesson12.transport;

import ru.roman.yuzyuk.java.basic.homeworks.lesson12.terrain.Terrain;
import ru.roman.yuzyuk.java.basic.homeworks.object.value.FuelAmount;

final public class Car extends FuelTransport {
    public Car(FuelAmount fuel) {
        super(fuel);
        this.plainCostFactor = 0.2f;
    }

    protected boolean moveThroughForest(Terrain terrain) {
        System.out.println("Не проехать между деревьев...");

        return false;
    }

    protected boolean moveThroughPlain(Terrain terrain) {
        System.out.println("Отправляемся на машине по полю...");

        return calculateFuel(terrain.getLength(), plainCostFactor);
    }

    protected boolean moveThroughSwamp(Terrain terrain) {
        System.out.println("Машина тонет в болоте...");

        return false;
    }
}
