package dia3.zoo.componentes;

import java.util.Random;

public class RandomComponents {

    //Método para aplicar a los show() de cada animal. Devuelve un número del 1 al 10.
    public static int randomResultShow(){
        Random rndm = new Random();
        return rndm.nextInt(10) + 1;
    }
}
