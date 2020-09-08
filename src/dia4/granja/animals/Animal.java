package dia4.granja.animals;

public class Animal {

    private String name;
    private String animalType;
    private boolean isAlive;

    public Animal(String name, String animalType){
        this.name = name;
        this.animalType = animalType;
        isAlive = true;

    }

    public String getName() {
        return name;
    }

    public String getAnimalType() {
        return animalType;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void hasBeenSacrificed(boolean hasBeenSacrifaced) {
        isAlive = !hasBeenSacrifaced;
    }
}
