package dia4.granja.scenes;

import dia4.granja.animals.StableAnimal;

import java.util.ArrayList;
import java.util.List;

public class Stable {

    private final int MAX_ANIMALS = 5;
    List<StableAnimal> animalList = new ArrayList<StableAnimal>();
    private int currentAnimal = 0;

    public String addStableAnimal(StableAnimal animal){
        if(currentAnimal == MAX_ANIMALS){
            return "The stable is full. You can't introduce more StableAnimals.";
        }else{
            animalList.add(animal);
            currentAnimal++;
            return animal + " has been introduced.";
        }
    }
}
