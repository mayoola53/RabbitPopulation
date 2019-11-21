package com.sparta.ma.charactersController;

/**
 * Hello world!
 *
 */
public class Starter
{
    public static void main( String[] args )
    {
        SimulationEnvironment simulationEnvironment = new SimulationEnvironment();

        simulationEnvironment.createEnvironment();
//        System.out.println(simulationEnviorment.getAnimals().toString());
        System.out.println(simulationEnvironment.getPopulation());
//        System.out.println(simulationEnvironment.getAnimals().toString());

//        System.out.println(simulationEnviorment.getNewRabbits().toString());

    }


}
