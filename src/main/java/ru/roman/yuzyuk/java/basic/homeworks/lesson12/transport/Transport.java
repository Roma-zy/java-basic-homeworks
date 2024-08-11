package ru.roman.yuzyuk.java.basic.homeworks.lesson12.transport;

import ru.roman.yuzyuk.java.basic.homeworks.lesson12.IMoveble;
import ru.roman.yuzyuk.java.basic.homeworks.lesson12.terrain.Terrain;

public abstract class Transport implements IMoveble {
    protected float forestCostFactor;
    protected float plainCostFactor;
    protected float swampCostFactor;

    @Override
    public boolean move(Terrain terrain) {
        if (!canMove()){
            return false;
        }

        boolean result;
        switch (terrain.getTerrain()) {
            case FOREST:
                result = moveThroughForest(terrain);
                break;
            case SWAMP:
                result = moveThroughSwamp(terrain);
                break;
            case PLAIN:
                result = moveThroughPlain(terrain);
                break;
            default:
                System.out.println("Действие не возможно!!!");
                result = false;
                break;
        }

        if (result) {
            System.out.println("Весь путь пройден!!!");
        } else {
            System.out.println("Часть пути придется идти ножками =((");
        }

        return result;
    }

    @Override
    public boolean canMove() {
        return true;
    }

    protected abstract boolean moveThroughForest(Terrain terrain);

    protected abstract boolean moveThroughSwamp(Terrain terrain);

    protected abstract boolean moveThroughPlain(Terrain terrain);
}
