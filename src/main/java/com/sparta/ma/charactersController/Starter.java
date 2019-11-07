package com.sparta.ma.charactersController;

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
        System.out.println(simulationEnviorment.getRabbitList().toString());

    }


}
