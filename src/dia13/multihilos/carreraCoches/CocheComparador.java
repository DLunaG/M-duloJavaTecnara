package dia13.multihilos.carreraCoches;

import java.util.Comparator;

public class CocheComparador implements Comparator<Coche> {

    @Override
    public int compare(Coche c1, Coche c2) {
        if (c1.getTiempoMedidoDeCarrera() < c2.getTiempoMedidoDeCarrera()) {
            return -1;
        }
        if (c1.getTiempoMedidoDeCarrera() > c2.getTiempoMedidoDeCarrera()) {
            return 1;
        }
        return 0;
    }

}
