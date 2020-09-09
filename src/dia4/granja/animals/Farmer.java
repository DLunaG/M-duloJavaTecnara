package dia4.granja.animals;

import dia4.granja.animals.birdAnimals.Bird;
import dia4.granja.animals.stableAnimals.StableAnimal;
import dia4.granja.interfaces.IFoldable;
import dia4.granja.scenes.ChickenCoop;
import dia4.granja.scenes.Fold;
import dia4.granja.scenes.Stable;

public class Farmer {

    public String carryStableAnimalToFold(Stable stable, IFoldable animal, Fold fold) {
        if (stable.isInStable((StableAnimal) animal)) {
            stable.getOutFromStable((StableAnimal) animal);
            System.out.println("C'mooooon " + animal.getName() + ".");
            return fold.addFoldableAnimal(animal);
        } else {
            return "This animal is not in the Stable.";
        }
    }

    public String carryBirdToFold(ChickenCoop chickenCoop, IFoldable animal, Fold fold) {
        if (chickenCoop.isInChickenCoop((Bird) animal)) {
            chickenCoop.getOutFromChickenCoop((Bird) animal);
            System.out.println("Pitas pitas pitas " + animal.getName() + ".");
            return fold.addFoldableAnimal(animal);
        } else {
            return "This animal is not in the Stable.";
        }
    }

    public String carryBirdFromFoldToChickenCoop(ChickenCoop chickenCoop, IFoldable animal, Fold fold){
        if(!(animal instanceof Bird)){
            return "This is not a Bird!.";
        }else {
            System.out.println("C'mon " + animal.getName() + ". Pitas pitas pitas.");
            chickenCoop.addBird((Bird) animal);
            fold.removeFoldableAnimal(animal);
            return animal.getName() + " carried to ChickenCoop.";
        }
    }

    public String carryStableAnimalFromFoldToStable(Stable stable, IFoldable animal, Fold fold){
        if(!(animal instanceof StableAnimal)){
            return "This is not a stable animal!";
        }else{
            if (stable.stableIsFull()) {
                return "This stable is full!";
            } else {
                System.out.println("C'mon Mr./Ms." + animal.getName() + ".");
                stable.addStableAnimal((StableAnimal) animal);
                fold.removeFoldableAnimal(animal);
                return animal.getName() + " carried to stable.";
            }
        }
    }

    public String pastureAnimal(IFoldable animal){
        return animal.pasture();
    }
}
