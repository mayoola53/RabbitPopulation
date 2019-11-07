package com.sparta.ma.charactersController;
import com.sparta.ma.characters.Animal;
import com.sparta.ma.characters.Rabbit;

import java.util.ArrayList;
import java.util.List;

public class SimulationEnviorment<list> {
    ArrayList<Animal>rabbitList =  new ArrayList<>();
    private int months = 0;
    private int population =0;

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
   public void incrementPopulation (){
       this.population++;
   }
    public void decrementPopulation (){
       this.population--;
    }

    public ArrayList<Animal> getRabbitList() {
        return rabbitList;
    }
    public int getMonths(){
        return months;


    }

    private  Animal  createRabbit() {
        Animal rabbit1;
        rabbit1 = new Rabbit(3,60,14);
        int gender = (int)(Math.random()*2)+1;
        rabbit1.setGender(gender);
        rabbit1.setAge(0);

        return rabbit1;
    }

    private void addAnimalToArrayList(Animal animal){
        getRabbitList().add(animal);
        incrementPopulation();
    }

    private void removeAmimal(Animal animal){
        getRabbitList().remove(animal);
        decrementPopulation();
    }

    public void createEnvironment(){
        Animal firstMaleRabbit = createRabbit();
        Animal firstFemaleRabbit =createRabbit();
        firstFemaleRabbit.setGender(2);
        firstMaleRabbit.setGender(1);
        addAnimalToArrayList(firstFemaleRabbit);
        addAnimalToArrayList(firstMaleRabbit);
        ArrayList<Animal> deadRabbits = new ArrayList<>();
        ArrayList<Animal> newRabbits =  new ArrayList<>();

        while (months<80) {
            for(Animal rabbit: rabbitList){
                rabbit.increamentAge();
                rabbit.isAlive();

                if(!rabbit.getAlive()){
                 deadRabbits.add(rabbit);

                 decrementPopulation();
                }

            }
            months++;

        }
       getRabbitList().removeAll(deadRabbits);


    }












}
