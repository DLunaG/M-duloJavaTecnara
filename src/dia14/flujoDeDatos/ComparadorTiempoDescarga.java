package dia14.flujoDeDatos;

import java.util.Comparator;

public class ComparadorTiempoDescarga implements Comparator<Descarga> {

    public int compare(Descarga d1, Descarga d2){
        if(d1.getTiempoDeDescarga() > d2.getTiempoDeDescarga()){
            return 1;
        }
        if(d1.getTiempoDeDescarga() < d2.getTiempoDeDescarga()){
            return -1;
        }
        return 0;
    }
}
