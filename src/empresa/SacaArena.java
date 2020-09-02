package empresa;
//empleado 2: trabajo/método sacar arena (mostrar por consola un mensaje)

public class SacaArena extends Empleado{

    public SacaArena(int vacaciones){
        super(vacaciones);
    }

    @Override
    public void trabajar(){
        System.out.println("Sacando arena...");
        System.out.println("Arena sacada.");
    }

}
