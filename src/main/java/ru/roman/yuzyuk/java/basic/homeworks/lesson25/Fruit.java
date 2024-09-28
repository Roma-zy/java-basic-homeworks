package ru.roman.yuzyuk.java.basic.homeworks.lesson25;

abstract class Fruit {
    protected float weight; // вес фрукта

    public Fruit(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }
}
