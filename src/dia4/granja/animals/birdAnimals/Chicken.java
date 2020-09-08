package dia4.granja.animals.birdAnimals;

import dia4.granja.animals.Animal;
import dia4.granja.interfaces.IFoldable;
import dia4.granja.scenes.Fold;

public class Chicken extends Bird implements IFoldable {

    public Chicken(String name){
        super(name, "Chicken");
    }

}
