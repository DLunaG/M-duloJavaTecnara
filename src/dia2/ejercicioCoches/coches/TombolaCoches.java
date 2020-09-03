package dia2.ejercicioCoches.coches;

import java.util.Random;

public class TombolaCoches {

    public Coche sortearCoche(){
        int numRandom = new Random().nextInt(3)+1;
        if(numRandom == 1){
            return new CitroenXsara(69, "rojo");
        }else if(numRandom == 2){
            return new Renault4CV(27, "verde");
        }else{
            return new RenaultClio(110, "negro");
        }
    }
}
