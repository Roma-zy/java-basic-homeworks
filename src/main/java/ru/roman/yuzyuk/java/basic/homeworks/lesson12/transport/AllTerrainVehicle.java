package ru.roman.yuzyuk.java.basic.homeworks.lesson12.transport;

import ru.roman.yuzyuk.java.basic.homeworks.lesson12.terrain.Terrain;
import ru.roman.yuzyuk.java.basic.homeworks.object.value.FuelAmount;

final public class AllTerrainVehicle extends FuelTransport {
    public AllTerrainVehicle(FuelAmount fuel) {
        super(fuel);
        this.forestCostFactor = 1;
        this.swampCostFactor = 1.5f;
        this.plainCostFactor = 0.5f;
    }

    protected boolean moveThroughForest(Terrain terrain) {
        System.out.println("Отправляемся на вездеходе по лесу...");

        return calculateFuel(terrain.getLength(), forestCostFactor);
    }

    protected boolean moveThroughPlain(Terrain terrain) {
        System.out.println("Отправляемся на вездеходе по полю...");

        return calculateFuel(terrain.getLength(), plainCostFactor);
    }

    protected boolean moveThroughSwamp(Terrain terrain) {
        System.out.println("Отправляемся на вездеходе по болоту...");

        return calculateFuel(terrain.getLength(), swampCostFactor);
    }
}
