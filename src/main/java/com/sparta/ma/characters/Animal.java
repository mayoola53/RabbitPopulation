package com.sparta.ma.characters;

public abstract class Animal {
    private int age;
    private int gender;
    private boolean alive;
    private int breedingAge;
    private final int maxNoOfChildren;
    private final int MAXAGEINMONTHS;
    private int name;


    public Animal(int breedingAge, int MAXAGEINMONTHS, int maxNoOfChildren) {
        this.breedingAge = breedingAge;
        this.MAXAGEINMONTHS = MAXAGEINMONTHS;
        this.maxNoOfChildren = maxNoOfChildren;
    }

//    public Animal(){
//
//    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
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

    public int getMAXAGEINMONTHS() {
        return MAXAGEINMONTHS;
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
        if (getAge() > this.MAXAGEINMONTHS) {
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

    public void incrementAge(){
       this.age++;
    }

}
