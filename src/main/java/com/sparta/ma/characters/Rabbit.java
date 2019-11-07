package com.sparta.ma.characters;

import java.util.ArrayList;
import java.util.Random;

public class Rabbit extends Animal {

    public Rabbit(int breedingAge, int MAXAGE, int maxNoOfChildren) {
        super(breedingAge, MAXAGE, maxNoOfChildren);

    }

    @Override
    public void giveBirth() {
        Random randomGenerator = new Random();
        int randomLitterSize = randomGenerator.nextInt(getMaxNoOfChildren()) + 1;
//        ArrayList<Animal> currentListofAnimals = getSimulationEnviorment().getAnimals();
        for (Animal animal : getSimulationEnviorment().getAnimals()) {
            if (canBreed() == true && animal.canBreed() == true && getGender() == 1 && animal.getGender() == 2) {
                for (int i = 1; i < randomLitterSize; i++) {
                    Animal rabbit = getSimulationEnviorment().createRabbit();
                    getSimulationEnviorment().getNewRabbits().add(rabbit);
                }

            }


        }

    }
}
