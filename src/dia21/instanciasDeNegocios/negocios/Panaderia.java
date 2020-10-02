package dia21.instanciasDeNegocios.negocios;

public class Panaderia extends Negocio{

    public Panaderia(String nombre, double facturacion, int numEmpleados) {
        super(nombre, facturacion, numEmpleados);
    }

    public void hornearPan(){
        System.out.println("Estamos horneando pan.");
    }

}
