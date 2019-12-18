package com.sparta.ma.characters;

public class Rabbit extends Animal {
    private int foodValue = 5;

    @Override
    public void isAlive() {
        Boolean alive = getAlive();

        if (getAge() > getMAXAGEINMONTHS() || getFoodValue()==0) {
            alive = false;
        } else {
            alive = true;
        }
        setAlive(alive);
    }

    public int getFoodValue() {
        return foodValue;
    }

    public void setFoodValue(int foodValue) {
        this.foodValue = foodValue;
    }


    public Rabbit(int breedingAge, int MAXAGEINMONTHS, int maxNoOfChildren) {
        super(breedingAge, MAXAGEINMONTHS, maxNoOfChildren);

    }



}