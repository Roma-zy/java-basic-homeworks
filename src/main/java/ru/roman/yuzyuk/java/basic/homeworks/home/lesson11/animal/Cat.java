package ru.roman.yuzyuk.java.basic.homeworks.home.lesson11.animal;

import ru.roman.yuzyuk.java.basic.homeworks.home.lesson11.container.Bowl;
import ru.roman.yuzyuk.java.basic.homeworks.home.lesson11.object.value.FoodAmount;
import ru.roman.yuzyuk.java.basic.homeworks.home.lesson11.object.value.Name;

import java.util.Objects;

public class Cat {
    protected String name;
    protected short appetite;
    protected boolean satiety = false;

    public Cat(Name name, FoodAmount appetite) {
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

    public Cat feed (Bowl bowl) {
        satiety = bowl.feed(new FoodAmount(appetite));

        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return appetite == cat.appetite && satiety == cat.satiety && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, appetite, satiety);
    }
}
