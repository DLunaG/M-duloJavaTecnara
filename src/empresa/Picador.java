package empresa;
//empleado 1: trabajo/método picar piedra (mostrar por consola un mensaje)

public class Picador extends Empleado {

    public Picador(int vacaciones){
        super(vacaciones);
    }

    @Override
    public void trabajar() {
        System.out.println("Picando piedra...");
        System.out.println("Piedra picada.");
    }
}
