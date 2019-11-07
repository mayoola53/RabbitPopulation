package com.sparta.ma.charactersController;
import com.sparta.ma.characters.Animal;
import com.sparta.ma.characters.Rabbit;
import java.util.ArrayList;


public class SimulationEnviorment {
    private ArrayList<Animal> animals =  new ArrayList<>();
    private ArrayList<Animal> deadRabbits = new ArrayList<>();
    private ArrayList<Animal> newRabbits =  new ArrayList<>();
    private int months = 0;
    private int population =0;

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
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

    public ArrayList<Animal> getAnimals() {
        return animals;
    }
    public int getMonths(){
        return months;


    }

    public   Animal  createRabbit() {
        Animal rabbit1;
        rabbit1 = new Rabbit(3,60,14);
        int gender = (int)(Math.random()*2)+1;
        rabbit1.setGender(gender);
        rabbit1.setAge(0);

        return rabbit1;
    }

    private void addAnimalToArrayList(Animal animal){
        getAnimals().add(animal);
        incrementPopulation();
    }

   private void createFirstBreedingPair(){
       Animal firstMaleRabbit = createRabbit();
       Animal firstFemaleRabbit =createRabbit();
       firstFemaleRabbit.setGender(2);
       firstMaleRabbit.setGender(1);
       addAnimalToArrayList(firstFemaleRabbit);
       addAnimalToArrayList(firstMaleRabbit);
   }


    public void createEnvironment(){
        createFirstBreedingPair();

        while (months<50) {
            for(Animal rabbit: getAnimals()){
                rabbit.increamentAge();
                rabbit.isAlive();
                if(!rabbit.getAlive()){
                 getDeadRabbits().add(rabbit);
                 decrementPopulation();
                }
            }
            months++;

        }
       getAnimals().removeAll(getDeadRabbits());

    }












}
