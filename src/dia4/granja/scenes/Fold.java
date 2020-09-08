package dia4.granja.scenes;

import dia4.granja.animals.birdAnimals.Bird;
import dia4.granja.animals.birdAnimals.Chicken;
import dia4.granja.animals.stableAnimals.Cow;
import dia4.granja.animals.stableAnimals.StableAnimal;
import dia4.granja.interfaces.IFoldable;

import java.util.ArrayList;
import java.util.List;

public class Fold {

    protected List<IFoldable> foldList = new ArrayList<IFoldable>();

    public String addFoldableAnimal(IFoldable animal){
        foldList.add(animal);
        return animal.getName() + " has arrived to Fold.";
    }

    public String pastureAnimal(IFoldable animal){
        if(!isInTheFold(animal)){
            return "This animal is not in the fold!";
        }else {
            StringBuilder sb = new StringBuilder("Hi! I'm a ");
            sb.append(animal.getClass().getSimpleName());
            sb.append(", my name is ");
            sb.append(animal.getName());
            sb.append(" and I'm being pastured :D");
            return sb.toString();
        }
    }

    public String automaticPasture(){
        for (IFoldable animal : foldList){
            System.out.println(pastureAnimal(animal));
        }
        return "All animals have been pastured.";
    }

    public String carryToChickenCoop(Bird bird, ChickenCoop chickenCoop){
        System.out.println("C'mon " + bird.getName() + ". Pitas pitas pitas.");
        chickenCoop.addBird(bird);
        foldList.remove(bird);
        return bird.getName() + " carried to ChickenCoop.";
    }

    public String carryToStable(StableAnimal animal, Stable stable){
        if(stable.stableIsFull()){
            return "This stable is full!";
        }else {
            System.out.println("C'mon Mr./Ms." + animal.getName() + ".");
            stable.addStableAnimal(animal);
            foldList.remove(animal);
            return animal.getName() + " carried to ChickenCoop.";
        }
    }

    public String getFoldMembers(){
        StringBuilder sb = new StringBuilder("In the fold are: \n");
        sb.append(getNumberOfCows());
        sb.append(" cows and ");
        sb.append(getNumberOfChickens());
        sb.append(" chickens.\nCows: \n");
        for(IFoldable animal:foldList){
            if(animal instanceof Cow){
                sb.append("- ");
                sb.append(animal.getName());
                sb.append(".\n");
            }
        }
        sb.append("Chickens: \n");
        for(IFoldable animal:foldList) {
            if (animal instanceof Chicken) {
                sb.append("- ");
                sb.append(animal.getName());
                sb.append(".\n");
            }
        }

        return sb.toString();
    }

    public int getNumberOfCows(){
        int numberOfCows = 0;
        for (IFoldable animal : foldList){
            if(animal instanceof Cow){
                numberOfCows++;
            }
        }
        return numberOfCows;
    }

    public int getNumberOfChickens(){
        int numberOfChickens = 0;
        for (IFoldable animal : foldList){
            if(animal instanceof Chicken){
                numberOfChickens++;
            }
        }
        return numberOfChickens;
    }

    public boolean isInTheFold(IFoldable animal){
        for(IFoldable x: foldList){
            if (x == animal){
                return true;
            }
        }
        return false;
    }

}
