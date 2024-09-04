package ru.roman.yuzyuk.java.basic.homeworks.home.lesson11.container;

import ru.roman.yuzyuk.java.basic.homeworks.home.lesson11.object.value.FoodAmount;

import java.util.Objects;

public class Bowl {
    protected short maximumFoodAmount;
    protected short currentFoodAmount;

    public Bowl(FoodAmount maximumFoodAmount) {
        this.maximumFoodAmount = maximumFoodAmount.getAmount();
        this.currentFoodAmount = maximumFoodAmount.getAmount();
    }

    public short getMaximumFoodAmount() {
        return maximumFoodAmount;
    }

    public short getCurrentFoodAmount() {
        return currentFoodAmount;
    }

    public Bowl addFood(FoodAmount food) {
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
        return foodAmount <= currentFoodAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bowl bowl = (Bowl) o;
        return maximumFoodAmount == bowl.maximumFoodAmount && currentFoodAmount == bowl.currentFoodAmount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maximumFoodAmount, currentFoodAmount);
    }
}
