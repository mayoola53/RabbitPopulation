package com.sparta.ma.charactersController;
import com.sparta.ma.characters.Rabbit;

import java.util.ArrayList;

public class SimulationEnviorment<list> {
    ArrayList<Rabbit>rabbitList =  new ArrayList<>();
    Rabbit rabbit;
    public ArrayList<Rabbit> getRabbitList() {
        return rabbitList;
    }


    private  Rabbit  createRabbit() {
        Rabbit rabbit1 = rabbit;
        rabbit1 = new Rabbit(60,14);
        int gender = (int)(Math.random())+1;
        rabbit1.setGender(gender);
        rabbit1.setAge(0);

        return rabbit1;
    }

    private void addRabbitToArrayList(){
        getRabbitList().add(createRabbit());
    }

    private void createEnviroment(){

    }












}
