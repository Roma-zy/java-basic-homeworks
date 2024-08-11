package ru.roman.yuzyuk.java.basic.homeworks.lesson12.terrain;

public class Terrain {
    private terrain terrain;
    private final int length;

    public Terrain(terrain terrain, int length) {
        this.terrain = terrain;
        this.length = length;
    }

    public terrain getTerrain() {
        return terrain;
    }

    public int getLength() {
        return length;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
