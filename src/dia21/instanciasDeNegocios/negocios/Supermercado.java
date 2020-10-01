package dia21.instanciasDeNegocios.negocios;

public class Supermercado extends Negocio{

    public Supermercado(String nombre, double facturacion, int numEmpleados) {
        super(nombre, facturacion, numEmpleados);
    }

    public void reponerEstante(){
        System.out.println("Se han repuesto los estantes.");
    }
}
