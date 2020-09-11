package dia7.repartoCamiones.vehiculos;

import dia7.repartoCamiones.Conductor;
import dia7.repartoCamiones.Paquete;
import dia7.repartoCamiones.Ruta;
import dia7.repartoCamiones.constantes.Constantes.Licencia;

import java.util.ArrayList;

public class CamionArticulado extends VehiculoReparto{
    public CamionArticulado(Conductor conductor, Ruta ruta, ArrayList<Paquete> listaDePaquetes) {
        super(conductor, ruta, listaDePaquetes, Licencia.D, 100);
    }
}
