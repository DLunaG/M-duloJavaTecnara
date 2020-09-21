package dia13.multihilos.carreraCoches;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        //Instancia de coches
        Coche coche1 = new Coche(20, "coche1");
        Coche coche2 = new Coche(50, "coche2");
        Coche coche3 = new Coche(90, "coche3");
        Coche coche4 = new Coche(30, "coche4");

        //Instancia de circuito
        Circuito montemelon = new Circuito(5);

        //Add de coches a circuito
        montemelon.addCoche(coche1);
        montemelon.addCoche(coche2);
        montemelon.addCoche(coche3);
        montemelon.addCoche(coche4);

        //Realización de carrera
        montemelon.realizarCarrera();

        //Espera de finalización de cada coche
        coche1.join();
        coche2.join();
        coche3.join();
        coche4.join();

        //Resultados (1er método en tiempo real (se añade coche a una lista nada más llega
        //2º método en tiempo real (se ve el tiempo que le ha costado con System.CurrentTimeMillis
        System.out.println(montemelon.resultadoCarrera());
        System.out.println(montemelon.posicionesCarrera2());

    }
}
