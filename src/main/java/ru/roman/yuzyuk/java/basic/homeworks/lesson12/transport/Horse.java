package ru.roman.yuzyuk.java.basic.homeworks.lesson12.transport;

import ru.roman.yuzyuk.java.basic.homeworks.lesson12.terrain.Terrain;
import ru.roman.yuzyuk.java.basic.homeworks.object.value.EnergyAmount;

final public class Horse extends EnergyTransport {
    public Horse(EnergyAmount energyAmount) {
        super(energyAmount);
        this.forestCostFactor = 2;
        this.plainCostFactor = 1;
    }

    protected boolean moveThroughForest(Terrain terrain) {
        System.out.println("Отправляемся на лошади по лесу...");

        return calculateEnergy(terrain.getLength(), forestCostFactor);
    }

    protected boolean moveThroughPlain(Terrain terrain) {
        System.out.println("Отправляемся на лошади по полю...");

        return calculateEnergy(terrain.getLength(), plainCostFactor);
    }

    protected boolean moveThroughSwamp(Terrain terrain) {
        System.out.println("Лошадь боится болота и убегает...");

        return false;
    }
}
