package empresa;
//empleado 3: trabajo/método echar agua (mostrar por consola un mensaje)

public class Aguador extends Empleado {

    public Aguador(){
    }

    @Override
    public void trabajar(){
        System.out.println("Echando agua...");
        System.out.println("Agua echada.");
    }

    @Override
    public void mostrarVacaciones(){
        System.out.println("Los empleados aguadores no disfrutan de vacaciones.");
    }
}
