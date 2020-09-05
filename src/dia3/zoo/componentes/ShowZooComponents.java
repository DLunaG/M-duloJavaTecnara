package dia3.zoo.componentes;

import dia3.zoo.animales.Animal;


public class ShowZooComponents {

    public static void doAShow(Animal animal){
        if(animal.getIsAquatic()){
            System.out.println("El/La " + animal.getEspecie() + " no puede realizar un show en el Zoo.");
            System.out.println();
        }else {
            System.out.println(animal.show());
            System.out.println();
        }
    }

    public static void doAShow(Animal animal1, Animal animal2){
        doAShow(animal1);
        doAShow(animal2);
    }
}
