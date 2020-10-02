package dia21.instanciasDeNegocios.negocios;

public class Taller extends Negocio{

    public Taller(String nombre, double facturacion, int numEmpleados){
        super(nombre,facturacion,numEmpleados);
    }

    public void hacerPropaganda(){
        System.out.println("Venga a visitar " + nombre + ", es un estupendo negocio.");
    }
}
