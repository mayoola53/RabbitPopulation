package com.sparta.ma.characters;

public class Fox extends Animal {
     private int hungerLevel = 50;
     private boolean canEat;


    public Fox(int breedingAge,int MAXAGEINMONTHS, int maxNoOfChildren) {
        super(breedingAge, MAXAGEINMONTHS, maxNoOfChildren);
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public boolean isCanEat() {
        return canEat;
    }

    public void setCanEat(boolean canEat) {
        this.canEat = canEat;
    }
}
