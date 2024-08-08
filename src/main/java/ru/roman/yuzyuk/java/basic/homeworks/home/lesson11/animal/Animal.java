package ru.roman.yuzyuk.java.basic.homeworks.home.lesson11.animal;

import ru.roman.yuzyuk.java.basic.homeworks.home.lesson11.container.Bowl;
import ru.roman.yuzyuk.java.basic.homeworks.home.lesson11.container.Container;
import ru.roman.yuzyuk.java.basic.homeworks.home.lesson11.object.value.FoodAmount;
import ru.roman.yuzyuk.java.basic.homeworks.home.lesson11.object.value.Name;

import java.util.Objects;

public abstract class Animal {
    protected String name;
    protected short appetite;
    protected boolean satiety = false;

    public Animal(Name name, FoodAmount appetite) {
        this.name = name.getName();
        this.appetite = appetite.getAmount();
    }

    public String getName() {
        return name;
    }

    public short getAppetite() {
        return appetite;
    }

    public boolean getSatiety() {
        return satiety;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal feed (Container container) {
        satiety = container.feed(new FoodAmount(appetite));

        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return appetite == animal.appetite && satiety == animal.satiety && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, appetite, satiety);
    }
}
