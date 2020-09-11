package dia7.repartoCamiones;

import java.util.ArrayList;

public class Ruta {

    private ArrayList<Parada> listaDeparadas;

    public Ruta(ArrayList<Parada> listaDeparadas){
        this.listaDeparadas = listaDeparadas;
    }

    public ArrayList<Parada> getParada(){
        return listaDeparadas;
    }
}
