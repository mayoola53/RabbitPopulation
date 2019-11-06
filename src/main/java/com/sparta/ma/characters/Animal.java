package com.sparta.ma.characters;

import com.sparta.ma.charactersController.SimulationEnviorment;

public abstract class Animal {
    private int age;
    private int gender;
    private boolean alive;
    private int breedingAge;
    private final int maxNoOfChildren;
    private final int MAXAGE;
    private SimulationEnviorment simulationEnviorment;

    public Animal(int MAXAGE, int maxNoOfChildren) {
        this.MAXAGE = MAXAGE;
        this.maxNoOfChildren = maxNoOfChildren;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int isGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public boolean isAlive(boolean alive) {
        this.alive = alive;
        if (getAge() > this.MAXAGE) {
            alive = false;
        } else {
            alive = true;
        }
        return alive;
    }



}
