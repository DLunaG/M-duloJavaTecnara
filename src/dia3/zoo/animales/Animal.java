package dia3.zoo.animales;

public abstract class Animal {

    private String especie;
    private boolean isAquatic;

    public Animal(String animal, boolean aquatic){
        this.especie = animal;
        this.isAquatic = aquatic;
    }

    public abstract String show();

    public String getEspecie(){
        return especie;
    }

    public boolean getIsAquatic(){
        return isAquatic;
    }
}
