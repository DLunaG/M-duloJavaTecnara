package dia4.granja.scenes;

import dia4.granja.animals.birdAnimals.*;
import dia4.granja.interfaces.IFoldable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ChickenCoop {

    protected List<Bird> birdsList = new ArrayList<Bird>();

    public String addBird(Bird bird){
        if(bird.isAlive()) {
            birdsList.add(bird);
            return bird.getName() + " has been introduced.";
        }else{
            return "This bird had been slaughtered.";
        }
    }


    public String takeEggs(int eggsToTake){
        int eggs = calculateEggs();
        if(eggsToTake > eggs){
            return "You have only been able to collect " + eggs + " eggs.";
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

    public String carryToFold(IFoldable animal, Fold fold){
        birdsList.remove(animal);
        System.out.println("Pitas pitas pitas " + animal.getName() + ".");
        return fold.addFoldableAnimal(animal);
    }


    public int getNumberOfChickens(){
        int numberOfChickens = 0;
        for (Bird x : birdsList){
            if(x instanceof Chicken){
                numberOfChickens++;
            }
        }
        return numberOfChickens;
    }

    public int getNumberOfTurkeys(){
        int numberOfTurkeys = 0;
        for (Bird x : birdsList){
            if(x instanceof Turkey){
                numberOfTurkeys++;
            }
        }
        return numberOfTurkeys;
    }

    public int getNumberOfBirds(){
        return getNumberOfChickens() + getNumberOfTurkeys();
    }

    public String getChickenCoopMembers(){
        StringBuilder sb = new StringBuilder("The chicken coop have :\n");
        sb.append(getNumberOfChickens());
        sb.append(" chickens and ");
        sb.append(getNumberOfTurkeys());
        sb.append(" turkeys.");
        return sb.toString();
    }

    private int calculateEggs(){
        return getNumberOfChickens()*2;
    }
}
