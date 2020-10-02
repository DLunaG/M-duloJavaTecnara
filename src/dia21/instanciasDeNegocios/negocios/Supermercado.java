package dia21.instanciasDeNegocios.negocios;

public class Supermercado extends Negocio{

    public Supermercado(String nombre, double facturacion, int numEmpleados) {
        super(nombre, facturacion, numEmpleados);
    }

    public void reponerEstante(){
        System.out.println("Se han repuesto los estantes.");
    }

    public void hornearPan(){
        System.out.println("Estamos horneando pan.");
    }

    public void hacerPropaganda(){
        System.out.println("Venga a visitar "+ nombre +", es un estupendo negocio.");
    }
}
