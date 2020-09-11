package dia7.repartoCamiones.vehiculos;

import dia7.repartoCamiones.Conductor;
import dia7.repartoCamiones.Paquete;
import dia7.repartoCamiones.Parada;
import dia7.repartoCamiones.Ruta;
import dia7.repartoCamiones.constantes.Constantes.Licencia;

import java.util.ArrayList;

public class VehiculoReparto {

    private int maxPaquetes;
    private Conductor conductor;
    private ArrayList<Paquete> cargamento;
    private Ruta ruta;
    private Licencia licenciaNecesaria;
    private ArrayList<Paquete> listaDePaquetesNoEntregados;

    public VehiculoReparto(Conductor conductor, Ruta ruta, ArrayList<Paquete> listaDePaquetes, Licencia licenciaNecesaria, int maxPaquetes){
        this.conductor = conductor;
        this.ruta = ruta;
        this.cargamento = listaDePaquetes;
        this.licenciaNecesaria = licenciaNecesaria;
        this.maxPaquetes = maxPaquetes;
        this.listaDePaquetesNoEntregados = new ArrayList<Paquete>();
    }

    public void realizarRuta(){
        if(!comprobarLicencia()) {
            System.out.println("Este conductor no puede conducir este vehículo debido a su licencia.");
        }else{
            for (Parada parada : this.ruta.getParada()){
                parada.entregarPaquetesEnParada(cargamento);
            }
        }
        System.out.println();
        System.out.println(parteDePaquetesDeVehiculoNoEntregadosEnRuta());
        System.out.println(parteDePaquetesNoEntregadosEnRuta());
    }

    public String parteDePaquetesDeVehiculoNoEntregadosEnRuta(){
        StringBuilder sb = new StringBuilder("Lista de paquetes dentro del vehículo que no eran de la ruta:\n");
        for(Paquete p : getCargamento()){
            sb.append("-");
            sb.append(p.getNombre());
            sb.append("\n");
        }
        return sb.toString();
    }

    public String parteDePaquetesNoEntregadosEnRuta(){
        for (Parada parada :this.ruta.getParada()){
            this.listaDePaquetesNoEntregados.addAll(parada.getPaquetesNoEntregados());
        }
        StringBuilder sb = new StringBuilder("Lista de paquetes no entregados en ruta:\n");
        for(Paquete p : this.listaDePaquetesNoEntregados){
            sb.append("-");
            sb.append(p.getNombre());
            sb.append("\n");
        }
        return sb.toString();
    }

    public void agregarPaquete(Paquete paquete){
        if (comprobarCapacidadPaquetes()){
            this.cargamento.add(paquete);
        }
    }

    public boolean comprobarCapacidadPaquetes(){
        if(this.cargamento.size() > this.maxPaquetes){
            return false;
        }else{
            return true;
        }
    }

    public boolean comprobarLicencia(){
        if(this.conductor.getLicencia().compareTo(this.licenciaNecesaria) < 0){
            return false;
        }else{
            return true;
        }
    }


    //GETTERS
    public int getMaxPaquetes() {
        return maxPaquetes;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public ArrayList<Paquete> getCargamento() {
        return cargamento;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public Licencia getLicenciaNecesaria() {
        return licenciaNecesaria;
    }

    //SETTERS

    public void setCargamento(ArrayList<Paquete> cargamento) {
        this.cargamento = cargamento;
    }
}
