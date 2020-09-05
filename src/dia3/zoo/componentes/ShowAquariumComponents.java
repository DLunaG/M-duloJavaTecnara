package dia3.zoo.componentes;

import dia3.zoo.animales.Acuatico;


public class ShowAquariumComponents {
    public static void doAShow(Acuatico animalAcuatico){
        System.out.println(animalAcuatico.show());
        System.out.println();
    }

    public static void doAShow(Acuatico animalAcuatico1, Acuatico animalAcuatico2){
        doAShow(animalAcuatico1);
        doAShow(animalAcuatico2);
    }
}
