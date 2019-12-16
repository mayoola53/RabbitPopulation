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
    private ArrayList<Animal> deadFoxes = new ArrayList<>();
    private ArrayList<Animal> newFoxes = new ArrayList<>();

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

    public void increamentMonths(){
        this.months++;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    private void incrementPopulation (){
       this.population++;
   }
    private void decrementPopulation (){
       this.population--;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }
    public int getMonths(){
        return months;

    }

    private  Animal  createRabbit() {
        Animal rabbit1;
        rabbit1 = new Rabbit(3,60,1);
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
        while (getMonths()<12) {
            for(Animal rabbit: getAnimals()){
                rabbit.incrementAge();
                rabbit.isAlive();
                rabbit.canBreed();
                rabbit.setName(getMonths());
                rabbit.giveBirth();
                if(!rabbit.getAlive()){
                 getDeadRabbits().add(rabbit);
                 decrementPopulation();
                }
                if(rabbit.getAlive()) {
                    breedRabbits(rabbit);
                }
//             System.out.println("Rabbit: "+ rabbit.getName() + " is " + rabbit.getAge());
            }
            increamentMonths();

      getAnimals().addAll(getNewRabbits());
        }

    }

    public void getSimulationInfo() {


        System.out.println(getPopulation());


    }


  private void breedRabbits(Animal rabbit ){
      int randomLitterSize = randomGenerator.nextInt((rabbit.getMaxNoOfChildren()-1)+1) + 1;
       if(rabbit.canBreed()& rabbit.getAlive() && rabbit.getGender()==1 &&rabbit.getMAXAGE()==60 ) {
           for (Animal potentialPartner : getAnimals()) {
               if(potentialPartner.canBreed()& potentialPartner.getAlive() && potentialPartner.getGender()==2 && potentialPartner.getMAXAGE()==60) {
                   for (int i = 1; i <= randomLitterSize; i++) {
                       Animal newRabbit = createRabbit();
                       getNewRabbits().add(newRabbit);
                   }
               }

           }
       }

  }


private void breedFoxes(Animal foxes){


}





}
