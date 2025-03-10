package dia4.granja.scenes;

import dia4.granja.animals.birdAnimals.Chicken;
import dia4.granja.animals.stableAnimals.Cow;
import dia4.granja.interfaces.IFoldable;
import java.util.ArrayList;
import java.util.List;

public class Fold {

    protected List<IFoldable> foldList = new ArrayList<IFoldable>();

    public String addFoldableAnimal(IFoldable animal){
        foldList.add(animal);
        animal.setIsInFold(true);
        return animal.getName() + " has arrived to Fold.";
    }

    public void removeFoldableAnimal(IFoldable animal){
        foldList.remove(animal);
        animal.setIsInFold(false);
    }

    public String automaticPasture(){
        for (IFoldable animal : foldList){
            System.out.println(animal.pasture());
        }
        return "All animals have been pastured.";
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
}