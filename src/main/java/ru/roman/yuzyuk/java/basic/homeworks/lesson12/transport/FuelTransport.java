package ru.roman.yuzyuk.java.basic.homeworks.lesson12.transport;

import ru.roman.yuzyuk.java.basic.homeworks.object.value.FuelAmount;

public abstract class FuelTransport extends Transport {
    byte fuel;

    public FuelTransport(FuelAmount fuelAmount) {
        this.fuel = fuelAmount.getAmount();
    }

    @Override
    public boolean canMove() {
        if (fuel > 0) {
            return true;
        }

        System.out.println("Нет топлива!!!");
        return false;
    }

    protected boolean calculateFuel(int wayLength, float cost) {
        int restWay = (int) (wayLength - fuel / cost);
        if (restWay > 0) {
            fuel = 0;
            System.out.println("Топливо кончилось, дальше идем пешком...");
            return false;
        }

        fuel = (byte) ((Math.abs(restWay) - wayLength) * cost);

        printFuelInfo();

        return true;
    }

    private void printFuelInfo() {
        System.out.println("Топлива осталось:" + fuel);
    }
}
