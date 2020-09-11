package dia7.repartoCamiones;

import dia7.repartoCamiones.constantes.Constantes.Licencia;
import dia7.repartoCamiones.vehiculos.Trailer;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Conductor pepe = new Conductor("Pepe", "1234", Licencia.D);

        Paquete p1 = new Paquete("Ordenador");
        Paquete p2 = new Paquete("Teclado");
        Paquete p3 = new Paquete("Altavoces");
        Paquete p4 = new Paquete("Minipímer");
        Paquete p5 = new Paquete("Libro");
        Paquete p6 = new Paquete("Chaqueta");

        ArrayList<Paquete> listaDePaquetesParada1 = new ArrayList<Paquete>();
        listaDePaquetesParada1.add(p1);
        listaDePaquetesParada1.add(p2);
        ArrayList<Paquete> listaDePaquetesParada2 = new ArrayList<Paquete>();
        listaDePaquetesParada2.add(p3);
        listaDePaquetesParada2.add(p4);
        listaDePaquetesParada2.add(p6);

        ArrayList<Paquete> listaDePaquetesEnVehiculo = new ArrayList<Paquete>();
        listaDePaquetesEnVehiculo.add(p1);
        listaDePaquetesEnVehiculo.add(p2);
        listaDePaquetesEnVehiculo.add(p3);
        listaDePaquetesEnVehiculo.add(p4);
        listaDePaquetesEnVehiculo.add(p5);

        Parada parada1 = new Parada(listaDePaquetesParada1);
        Parada parada2 = new Parada(listaDePaquetesParada2);

        ArrayList<Parada> listaDeParadas = new ArrayList<Parada>();
        listaDeParadas.add(parada1);
        listaDeParadas.add(parada2);

        Ruta ruta = new Ruta(listaDeParadas);

        Trailer pegaso = new Trailer(pepe, ruta, listaDePaquetesEnVehiculo);
        pegaso.realizarRuta();



    }
}
