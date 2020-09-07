package dia4.granja.scenes;

import dia4.granja.animals.Bird;
import dia4.granja.animals.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ChickenCoop {

    private int eggs;
    protected List<Bird> birdsList = new ArrayList<Bird>();
    private int numberOfChickens;
    private int numberOfTurkeys;

    public String addBird(Bird bird){
        if(bird instanceof Chicken){
            numberOfChickens++;
            eggs++;
        }else{
            numberOfTurkeys++;
        }
        birdsList.add(bird);
        return bird + " has been introduced.";
    }


    public String takeEggs(int eggsToTake){
        if(eggsToTake > this.eggs){
            return "You have only been able to collect " + this.eggs + " eggs.";
        }else{
            return "You have collected " + eggsToTake + " eggs.";
        }
    }

    public Bird takeToSlaughter(){
        Random rndm = new Random();
        int randomBird = rndm.nextInt(birdsList.size());
        Bird birdToSacriface = birdsList.get(randomBird);
        birdsList.remove(randomBird);
        return birdToSacriface;
    }

}
