package dia7.repartoCamiones;

import dia7.repartoCamiones.constantes.Constantes.Licencia;
import dia7.repartoCamiones.vehiculos.VehiculoReparto;

public class Conductor {

    private String name;
    private String iDTrabajador;
    private Licencia licencia;
    private VehiculoReparto vehiculoAsignado;

    public Conductor(String name, String iDTrabajador, Licencia licencia){
        this.name = name;
        this.iDTrabajador = iDTrabajador;
        this.licencia = licencia;
    }

    public String getName() {
        return name;
    }

    public String getiDTrabajador() {
        return iDTrabajador;
    }

    public Licencia getLicencia() {
        return licencia;
    }

    public VehiculoReparto getVehiculoAsignado() {
        return vehiculoAsignado;
    }
}
