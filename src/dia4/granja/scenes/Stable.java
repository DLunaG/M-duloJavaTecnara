package dia4.granja.scenes;


import dia4.granja.animals.Animal;
import dia4.granja.animals.stableAnimals.Cow;
import dia4.granja.animals.stableAnimals.StableAnimal;
import dia4.granja.interfaces.IFoldable;

import java.util.ArrayList;
import java.util.List;

public class Stable {

    private final int MAX_ANIMALS = 5;
    List<StableAnimal> animalList = new ArrayList<StableAnimal>();

    public String addStableAnimal(StableAnimal animal) {
        if (stableIsFull()) {
            return "The stable is full. You can't introduce more StableAnimals in this stable.";
        } else {
            animalList.add(animal);
            return animal.getName() + " has been introduced.";
        }
    }

    public String carryToFold(IFoldable animal, Fold fold){
        animalList.remove(animal);
        System.out.println("C'mooooon " + animal.getName() + ".");
        return fold.addFoldableAnimal(animal);
    }

    public String getStableMembers() {
        StringBuilder sb = new StringBuilder("These are the animals in the stable: \n");
        for (StableAnimal x : animalList){
            sb.append("- ");
            sb.append(x.getName());
            sb.append(". A/An ");
            sb.append(x.getAnimalType());
            sb.append(".\n");
        }
        return sb.toString();
    }

    public int getNumberOfCows(){
        int numberOfCows = 0;
        for (StableAnimal x : animalList){
            if(x instanceof Cow){
                numberOfCows++;
            }
        }
        return numberOfCows;
    }

    public int getNumberOfHorses(){
        int numberOfHorses = 0;
        for (StableAnimal x : animalList){
            if(x instanceof Cow){
                numberOfHorses++;
            }
        }
        return numberOfHorses;
    }

    public int getNumberOfOxes(){
        int numberOfOxes = 0;
        for (StableAnimal x : animalList){
            if(x instanceof Cow){
                numberOfOxes++;
            }
        }
        return numberOfOxes;
    }

    public boolean stableIsFull(){
        if(animalList.size() == 5){
            return true;
        }else{
            return false;
        }
    }
}

