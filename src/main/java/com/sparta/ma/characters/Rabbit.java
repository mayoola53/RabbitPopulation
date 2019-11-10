package com.sparta.ma.characters;

import com.sparta.ma.charactersController.SimulationEnviorment;

import java.util.ArrayList;
import java.util.Random;

public class Rabbit extends Animal {

    public Rabbit(int breedingAge, int MAXAGE, int maxNoOfChildren) {
        super(breedingAge, MAXAGE, maxNoOfChildren);

    }


//    public void giveBirth() {
//        Random randomGenerator = new Random();
//        int randomLitterSize = randomGenerator.nextInt(getMaxNoOfChildren()) + 1;
//        SimulationEnviorment simulationEnviorment = new SimulationEnviorment();
//        simulationEnviorment.createEnvironment();
//        ArrayList<Animal> currentListOfNewRabbits =  simulationEnviorment.getNewRabbits();
//        ArrayList<Animal> currentListOfRabbits = simulationEnviorment.getAnimals();
//
//        for (Animal animal : simulationEnviorment.getAnimals()) {
//            animal.canBreed();
//            if (canBreed() == true && animal.canBreed() == true && (getGender() == 1 && animal.getGender() == 2) ||getGender() == 2 && animal.getGender() == 1)  {
//                for (int i = 1; i < randomLitterSize; i++) {
//                    Animal rabbit = simulationEnviorment.createRabbit();
//                    simulationEnviorment.getNewRabbits().add(rabbit);
//                }
//
//            }
//
//
//        }
//
//    }
//}
}