package com.sparta.ma.characters;

import com.sparta.ma.charactersController.SimulationEnviorment;

public abstract class Animal {
    private int age;
    private int gender;
    private boolean alive;
    private int breedingAge;
    private final int maxNoOfChildren;
    private final int MAXAGE;



    public Animal(int breedingAge, int MAXAGE, int maxNoOfChildren) {
        this.breedingAge = breedingAge;
        this.MAXAGE = MAXAGE;
        this.maxNoOfChildren = maxNoOfChildren;
    }
    public int getBreedingAge() {
        return breedingAge;
    }
    public void setAlive(boolean alive) {
        this.alive = alive;
    }
    public Boolean getAlive() {
       return alive;
    }

    public int getMAXAGE() {
        return MAXAGE;
    }

    public int getAge() {
        return age;
    }

    public int getMaxNoOfChildren() {
        return maxNoOfChildren;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public void isAlive() {
        Boolean alive = false;
        this.alive = alive;
        if (getAge() > this.MAXAGE) {
            alive = false;
        } else {
            alive = true;
        }
        setAlive(alive);
    }

    public void giveBirth(){
    }

    public  boolean canBreed(){
        if (this.age >=this.breedingAge && this.alive == true){
            return true;
        }
        return false;
    }

    public void increamentAge(){
       this.age++;
    }




}
