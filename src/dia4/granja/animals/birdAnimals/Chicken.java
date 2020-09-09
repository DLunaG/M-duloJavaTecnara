package dia4.granja.animals.birdAnimals;

import dia4.granja.interfaces.IFoldable;

public class Chicken extends Bird implements IFoldable {

    private boolean isInFold;

    public Chicken(String name){
        super(name, "Chicken");
        isInFold = false;
    }

    @Override
    public String pasture(){
        if(!isInFold){
            return "This chicken is not in Fold...";
        }else{
            StringBuilder sb = new StringBuilder("Hi! I'm a ");
            sb.append(getClass().getSimpleName());
            sb.append(", my name is ");
            sb.append(getName());
            sb.append(" and I'm being pastured :D");
            return sb.toString();
        }
    }

    public boolean isInFold() {
        return isInFold;
    }

    @Override
    public void setIsInFold(boolean isInFold) {
        this.isInFold = isInFold;
    }
}
