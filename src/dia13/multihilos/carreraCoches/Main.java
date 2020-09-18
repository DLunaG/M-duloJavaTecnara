package dia13.multihilos.carreraCoches;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Coche coche1 = new Coche(20, "coche1");
        Coche coche2 = new Coche(50, "coche2");
        Coche coche3 = new Coche(90, "coche3");
        Coche coche4 = new Coche(30, "coche4");

        Circuito montemelon = new Circuito(5);

        montemelon.addCoche(coche1);
        montemelon.addCoche(coche2);
        montemelon.addCoche(coche3);
        montemelon.addCoche(coche4);

        montemelon.realizarCarrera();

        coche1.join();
        coche2.join();
        coche3.join();
        coche4.join();
        System.out.println(montemelon.resultadoCarrera());

    }
}
