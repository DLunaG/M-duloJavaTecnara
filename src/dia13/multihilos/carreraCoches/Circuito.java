package dia13.multihilos.carreraCoches;

import java.util.ArrayList;
import java.util.List;

public class Circuito {
    private List<Coche> listaCoches;
    private List<Coche> listaPosicionCarrera;
    private int longitud;

    public Circuito(int longitud){
        this.longitud = longitud;
        listaCoches = new ArrayList<>();
        listaPosicionCarrera = new ArrayList<>();
    }

    public void addCoche(Coche coche){
        listaCoches.add(coche);
        coche.setCircuito(this);
    }

    public void realizarCarrera(){
        for(Coche coche : listaCoches){
            coche.start();
        }
    }
    public void posicionCruzandoMeta(Coche coche) {
        listaPosicionCarrera.add(coche);
    }


    //método creado por clase.
    public String posicionesCarrera2() {
        CocheComparador cc = new CocheComparador();
        listaCoches.sort(cc);

        StringBuilder sb = new StringBuilder();
        int posicion = 1;
        for (Coche coche : listaCoches) {
            sb.append(coche.getNameCar() + " posición " + posicion + ". Costándole " + coche.getTiempoMedidoDeCarrera() + "s en recorrer el circuito.\n");
            posicion++;
        }
        return sb.toString();

    }

    public String resultadoCarrera(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < listaPosicionCarrera.size(); i++) {
            sb.append("Posición ").append(i+1).append(": ").append(listaPosicionCarrera.get(i).getNameCar()).append(".\n");
        }
        return sb.toString();
    }



    public int getLongitud() {
        return longitud;
    }

}
