package dia8.flores;

import java.util.Random;

public class Violeta extends Flor {

    public void soltarAbejas(){
        Random rndm = new Random();
        int numAbejas = rndm.nextInt(5);
        System.out.println("Han salido " + numAbejas + " abejas de la violeta.");
    }
}
