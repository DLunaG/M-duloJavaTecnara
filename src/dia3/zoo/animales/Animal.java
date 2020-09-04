package dia3.zoo.animales;

public abstract class Animal {

    private String tipoAnimal;

    public Animal(String animal){
        this.tipoAnimal = animal;
    }

    public abstract String show();

}
