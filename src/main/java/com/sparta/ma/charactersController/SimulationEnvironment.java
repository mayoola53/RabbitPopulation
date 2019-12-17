package com.sparta.ma.charactersController;

import com.sparta.ma.characters.Animal;
import com.sparta.ma.characters.Fox;
import com.sparta.ma.characters.Rabbit;

import java.util.ArrayList;
import java.util.Random;


public class SimulationEnvironment {
    Random randomGenerator = new Random();
    private int years = 0;
    private int foxPopulation = 0;
    private int rabbitPopulation = 0;
    private int populationTotal = 0;
    private ArrayList<Animal> animals = new ArrayList<>();
    private ArrayList<Animal> deadRabbits = new ArrayList<>();
    private ArrayList<Animal> newRabbits = new ArrayList<>();
    private ArrayList<Animal> deadFoxes = new ArrayList<>();
    private ArrayList<Animal> newFoxes = new ArrayList<>();


    public int getFoxPopulation() {
        return foxPopulation;
    }

    public void setFoxPopulation(int foxPopulation) {
        this.foxPopulation = foxPopulation;
    }

    public int getRabbitPopulation() {
        return rabbitPopulation;
    }

    public void setRabbitPopulation(int rabbitPopulation) {
        this.rabbitPopulation = rabbitPopulation;
    }

    public ArrayList<Animal> getDeadFoxes() {
        return deadFoxes;
    }

    public void setDeadFoxes(ArrayList<Animal> deadFoxes) {
        this.deadFoxes = deadFoxes;
    }

    public ArrayList<Animal> getNewFoxes() {
        return newFoxes;
    }

    public void setNewFoxes(ArrayList<Animal> newFoxes) {
        this.newFoxes = newFoxes;
    }

    public ArrayList<Animal> getDeadRabbits() {
        return deadRabbits;
    }

    public void setDeadRabbits(ArrayList<Animal> deadRabbits) {
        this.deadRabbits = deadRabbits;
    }

    public ArrayList<Animal> getNewRabbits() {
        return newRabbits;
    }

    public void setNewRabbits(ArrayList<Animal> newRabbits) {
        this.newRabbits = newRabbits;
    }

    public int getPopulationTotal() {
        return populationTotal;
    }

    public void setPopulationTotal(int populationTotal) {
        this.populationTotal = populationTotal;
    }

    public void incrementYears() {
        this.years++;
    }

    private void incrementRabbitPopulation(){
        this.rabbitPopulation++;
    }

    private void incrementFoxPopulation(){
        this.foxPopulation++;
    }

    private void incrementPopulation() {
        this.populationTotal++;
    }

    private void decrementRabbitPopulation(){
        this.rabbitPopulation--;
    }
    private void decrementFoxPopulation(){
        this.foxPopulation--;
    }
    private void decrementPopulation() {
        this.populationTotal--;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public int getYears() {
        return years;
    }

    private Animal createRabbit() {
        Animal rabbit1;
        rabbit1 = new Rabbit(3, 30, 1);
        int name = 1;
        int gender = randomGenerator.nextInt((2 - 1) + 1) + 1;
        ;
        rabbit1.setGender(gender);
        rabbit1.setAge(0);
        rabbit1.setAlive(true);
        incrementRabbitPopulation();
        incrementPopulation();
        return rabbit1;
    }

    private Animal createFox() {
        Animal fox1;
        fox1 = new Fox(12, 90, 1);
        int name = 1;
        int gender = randomGenerator.nextInt((2 - 1) + 1) + 1;
        fox1.setGender(gender);
        fox1.setAge(0);
        fox1.setAlive(true);
        incrementFoxPopulation();
        incrementPopulation();
        return fox1;

    }

    private void addAnimalToArrayList(Animal animal) {
        getAnimals().add(animal);
    }

    private void createFirstFoxBreedingPair(){
        Animal firstMaleFox = createFox();
        Animal firstFemaleFox = createFox();
        firstFemaleFox.setGender(2);
        firstMaleFox.setGender(1);
        addAnimalToArrayList(firstFemaleFox);
        addAnimalToArrayList(firstMaleFox);

    }

    private void createFirstRabbitBreedingPair() {
        Animal firstMaleRabbit = createRabbit();
        Animal firstFemaleRabbit = createRabbit();
        firstFemaleRabbit.setGender(2);
        firstMaleRabbit.setGender(1);
        addAnimalToArrayList(firstFemaleRabbit);
        addAnimalToArrayList(firstMaleRabbit);
    }


    public void createEnvironment() {
        createFirstRabbitBreedingPair();
        createFirstFoxBreedingPair();
        while (getYears() < 4) {
            for (Animal animal : getAnimals()) {
                animal.incrementAge();
                animal.isAlive();
                animal.canBreed();
                animal.setName(getYears());
                animal.giveBirth();
                if (!animal.getAlive()) {
                    getDeadRabbits().add(animal);
                    decrementPopulation();
                }
                if (animal.getAlive()) {
                    breedRabbits(animal);
                }
//             System.out.println("Rabbit: "+ animal.getName() + " is " + animal.getAge());
            }
            incrementYears();
            getAnimals().addAll(getNewRabbits());
            getNewRabbits().removeAll(getAnimals());

        }

    }

    public void getSimulationInfo() {
        System.out.println(getPopulationTotal());
    }


    private void breedRabbits(Animal animal) {
        int randomLitterSize = randomGenerator.nextInt((animal.getMaxNoOfChildren() - 1) + 1) + 1;
        if (animal.canBreed() & animal.getAlive() && animal.getGender() == 1) {
            for (Animal potentialPartner : getAnimals()) {
                if (potentialPartner.canBreed() & potentialPartner.getAlive() && potentialPartner.getGender() == 2 && potentialPartner.getBreedingAge()==animal.getBreedingAge()) {
                    for (int i = 1; i <= randomLitterSize; i++) {
                        Animal newRabbit = createRabbit();
                        getNewRabbits().add(newRabbit);
                    }
                }

            }
        }

    }



}
