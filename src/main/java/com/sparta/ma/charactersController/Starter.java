package com.sparta.ma.charactersController;

import com.sparta.ma.characters.Rabbit;

/**
 * Hello world!
 *
 */
public class Starter
{
    public static void main( String[] args )
    {
        SimulationEnviorment simulationEnviorment = new SimulationEnviorment();
        simulationEnviorment.createEnvironment();
        System.out.println(simulationEnviorment.getAnimals().toString());
        Rabbit rabbit = new Rabbit(3,60,14);
        rabbit.giveBirth();
        simulationEnviorment.getNewRabbits();

    }


}
