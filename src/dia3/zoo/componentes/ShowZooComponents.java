package dia3.zoo.componentes;

import dia3.zoo.animales.Animal;

public class ShowZooComponents {

    public void doAShow(Animal animal){
        System.out.println(animal.show());
    }

    public void doADualShow(Animal animal1, Animal animal2){
        System.out.println(animal1.show());
        System.out.println(animal2.show());
    }
}
