package dia7.repartoCamiones;

import java.util.ArrayList;

public class Parada {

    private ArrayList<Paquete> paquetesEnParada;
    private ArrayList<Paquete> paquetesNoEntregados;

    public Parada(ArrayList<Paquete> paquetesEnParada){
        this.paquetesEnParada = paquetesEnParada;
        this.paquetesNoEntregados = new ArrayList<Paquete>();
    }

    public void entregarPaquetesEnParada(ArrayList<Paquete> listaPaquetesCamion){
        for (Paquete paquete : paquetesEnParada) {
            if (comprobarPaqueteEnVehiculo(paquete, listaPaquetesCamion)) {
                System.out.println("Paquete " + paquete.getNombre()  + " entregado.");
                listaPaquetesCamion.remove(paquete);
            } else {
                System.out.println("El paquete " + paquete.getNombre() + " no está en el vehículo!");
                paquetesNoEntregados.add(paquete);
            }
        }
    }

    public boolean comprobarPaqueteEnVehiculo(Paquete paqueteEnRuta, ArrayList<Paquete> listaPaquetesCamion) {
        if (listaPaquetesCamion.contains(paqueteEnRuta)) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Paquete> getPaquetesEnParada() {
        return paquetesEnParada;
    }

    public ArrayList<Paquete> getPaquetesNoEntregados() {
        return paquetesNoEntregados;
    }
}
