package dia4.granja.animals.stableAnimals;

import dia4.granja.animals.Animal;
import dia4.granja.interfaces.IFoldable;
import dia4.granja.scenes.Fold;

public class Cow extends StableAnimal implements IFoldable {

    private boolean isInFold;

    public Cow(String name){
        super(name, "Cow");
        isInFold = false;
    }


    @Override
    public String pasture() {
        if(!isInFold){
            return "This cow is not in Fold...";
        }else{
            StringBuilder sb = new StringBuilder("Hi! I'm a ");
            sb.append(getClass().getSimpleName());
            sb.append(", my name is ");
            sb.append(getName());
            sb.append(" and I'm being pastured :D");
            return sb.toString();
        }
    }

    @Override
    public void setIsInFold(boolean isInFold) {
        this.isInFold = isInFold;
    }

    public boolean isInFold() {
        return isInFold;
    }

    public void setInFold(boolean inFold) {
        isInFold = inFold;
    }
}
