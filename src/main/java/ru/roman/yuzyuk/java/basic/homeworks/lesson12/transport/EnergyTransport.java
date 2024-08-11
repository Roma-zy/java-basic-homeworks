package ru.roman.yuzyuk.java.basic.homeworks.lesson12.transport;

import ru.roman.yuzyuk.java.basic.homeworks.object.value.EnergyAmount;

abstract public class EnergyTransport extends Transport {
    byte energy;

    public EnergyTransport(EnergyAmount energyAmount) {
        this.energy = energyAmount.getAmount();
    }

    @Override
    public boolean canMove() {
        if (energy > 0) {
            return true;
        }

        System.out.println("Энергия кончилась!!!");
        return false;
    }

    protected boolean calculateEnergy(int wayLength, float cost) {
        int restWay = (int) (wayLength - energy / cost);

        if (restWay > 0) {
            energy = 0;
            System.out.println("Энергия кончилась, дальше идем пешком...");
            return false;
        }

        energy = (byte) ((Math.abs(restWay) - wayLength) * cost);

        printEnergyInfo();

        return true;
    }

    private void printEnergyInfo() {
        System.out.println("Энергии осталось:" + energy);
    }
}
