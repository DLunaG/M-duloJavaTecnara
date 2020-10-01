package dia21.instanciasDeNegocios.negocios;

public class Negocio {

    String nombre;
    double facturacion;
    int numEmpleados;

    public Negocio(String nombre, double facturacion, int numEmpleados){
        this.nombre = nombre;
        this.facturacion = facturacion;
        this.numEmpleados = numEmpleados;
    }

    public void abrir(){
        StringBuilder sb = new StringBuilder();
        sb.append("He abierto, soy ");
        sb.append(nombre);
        sb.append(".");
        System.out.println(sb.toString());
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getFacturacion() {
        return facturacion;
    }

    public void setFacturacion(double facturacion) {
        this.facturacion = facturacion;
    }

    public int getNumEmpleados() {
        return numEmpleados;
    }

    public void setNumEmpleados(int numEmpleados) {
        this.numEmpleados = numEmpleados;
    }
}
