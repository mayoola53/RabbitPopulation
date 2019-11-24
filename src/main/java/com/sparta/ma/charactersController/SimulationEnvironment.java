package com.sparta.ma.charactersController;
import com.sparta.ma.characters.Animal;
import com.sparta.ma.characters.Rabbit;
import java.util.ArrayList;
import java.util.Random;


public class SimulationEnvironment {
    private int months = 0;
    private int population =0;
    Random randomGenerator = new Random();
    private ArrayList<Animal> animals =  new ArrayList<>();
    private ArrayList<Animal> deadRabbits = new ArrayList<>();
    private ArrayList<Animal> newRabbits =  new ArrayList<>();


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
        int name = 1;
        int gender =  randomGenerator.nextInt((2-1)+1) + 1;;
        rabbit1.setGender(gender);
        rabbit1.setAge(0);
        rabbit1.setAlive(true);
        rabbit1.setName(name++);
        incrementPopulation();
        return rabbit1;
    }

    private void addAnimalToArrayList(Animal animal){
        getAnimals().add(animal);
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
        while (months<100) {
            for(Animal rabbit: getAnimals()){
                rabbit.incrementAge();
                rabbit.isAlive();
                rabbit.canBreed();
                rabbit.setName(months++);
                rabbit.giveBirth();
                if(!rabbit.getAlive()){
                 getDeadRabbits().add(rabbit);
                 decrementPopulation();
                }
                if(rabbit.getAlive()) {
                    breedRabbits(rabbit);
                }
              //System.out.println("Rabbit: "+ rabbit.getName() + " is " + rabbit.getAge());
            }
            months++;

      getAnimals().addAll(getNewRabbits());
        }

    }

    public void getSimulationInfo() {


        System.out.println(getPopulation());


    }


  public void breedRabbits(Animal rabbit ){

      int randomLitterSize = randomGenerator.nextInt((rabbit.getMaxNoOfChildren()-1)+1) + 1;
       if(rabbit.canBreed()& rabbit.getAlive() ) {
           for (Animal potentialPartner : getAnimals()) {
               if(potentialPartner.canBreed()& potentialPartner.getAlive()&&rabbit.getMaxNoOfChildren()==14) {
                   for (int i = 1; i <= randomLitterSize; i++) {
                       Animal newRabbit = createRabbit();
                       getNewRabbits().add(newRabbit);
                   }
               }

           }
       }
  }








}
