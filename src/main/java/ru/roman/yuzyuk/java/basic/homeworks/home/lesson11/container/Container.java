package ru.roman.yuzyuk.java.basic.homeworks.home.lesson11.container;

import ru.roman.yuzyuk.java.basic.homeworks.home.lesson11.object.value.FoodAmount;

import java.util.Objects;

public abstract class Container {
    protected short maximumFoodAmount;
    protected short currentFoodAmount;

    public Container(FoodAmount maximumFoodAmount) {
        this.maximumFoodAmount = maximumFoodAmount.getAmount();
        this.currentFoodAmount = maximumFoodAmount.getAmount();
    }

    public short getMaximumFoodAmount() {
        return maximumFoodAmount;
    }

    public short getCurrentFoodAmount() {
        return currentFoodAmount;
    }

    public Container addFood(FoodAmount food) {
        currentFoodAmount = (currentFoodAmount + food.getAmount() >= maximumFoodAmount) ? maximumFoodAmount : food.getAmount();
        return this;
    }

    public boolean feed(FoodAmount foodAmount) {
        if (!isPossibleGetFood(foodAmount.getAmount())) {
            return false;
        }

        currentFoodAmount -= foodAmount.getAmount();
        return true;
    }

    private boolean isPossibleGetFood(short foodAmount) {
        return foodAmount < currentFoodAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Container container = (Container) o;
        return maximumFoodAmount == container.maximumFoodAmount && currentFoodAmount == container.currentFoodAmount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maximumFoodAmount, currentFoodAmount);
    }
}
