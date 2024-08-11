package ru.roman.yuzyuk.java.basic.homeworks.lesson12;

import ru.roman.yuzyuk.java.basic.homeworks.lesson12.human.Human;
import ru.roman.yuzyuk.java.basic.homeworks.lesson12.terrain.Terrain;
import ru.roman.yuzyuk.java.basic.homeworks.lesson12.terrain.terrain;
import ru.roman.yuzyuk.java.basic.homeworks.lesson12.transport.*;
import ru.roman.yuzyuk.java.basic.homeworks.object.value.EnergyAmount;
import ru.roman.yuzyuk.java.basic.homeworks.object.value.FuelAmount;
import ru.roman.yuzyuk.java.basic.homeworks.object.value.Name;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(new FuelAmount((byte) 70));
        AllTerrainVehicle allTerrainVehicle = new AllTerrainVehicle(new FuelAmount((byte) 100));
        Horse horse = new Horse(new EnergyAmount((byte) 25));
        Bike bike = new Bike();

        Terrain forest = new Terrain(terrain.FOREST, 120);
        Terrain plain = new Terrain(terrain.PLAIN, 120);
        Terrain swamp = new Terrain(terrain.SWAMP, 120);

        Human human = new Human(new Name("Егорка"));

        human.move(forest);
        human.chooseTransport(car).move(plain);
        human.move(plain);
        human.move(plain);

        human.leaveTransport().chooseTransport(allTerrainVehicle).move(swamp);

        human.leaveTransport().chooseTransport(horse).move(swamp);
        human.move(forest);
        human.move(forest);

        human.leaveTransport().chooseTransport(bike).move(forest);
    }
}
