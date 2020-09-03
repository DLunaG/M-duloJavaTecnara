package dia2.ejercicioCoches.coches;

public class Renault4CV extends Coche{

    public Renault4CV(int cv, String color){
        super("Renault","4CV", cv, color);
    }

    @Override
    public void arrancar() {
        System.out.println("Girando manivela...");
        encendido = true;
        System.out.println("Coche arrancado.");
    }

    @Override
    public void apagar(){
        if(velocidad == 0) {
            encendido = false;
            System.out.println("Coche apagado. Echa el ancla.");
        }else{
            System.out.println("No puedes apagar el coche en marcha.");
        }
    }
}
