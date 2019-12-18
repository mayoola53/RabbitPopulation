package com.sparta.ma.characters;

public class Fox extends Animal {
    private int hungerLevel = 50;
    private boolean canEat;


    public Fox(int breedingAge, int MAXAGEINMONTHS, int maxNoOfChildren) {
        super(breedingAge, MAXAGEINMONTHS, maxNoOfChildren);
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public boolean getCanEat() {
        return canEat;
    }

    public void setCanEat(boolean canEat) {
        this.canEat = canEat;
    }

    public void canEat() {
        boolean canEat = this.canEat;
        if (this.hungerLevel <= 0) {
            canEat = false;
        } else {
            canEat = true;
        }
        setCanEat(canEat);
    }


}
