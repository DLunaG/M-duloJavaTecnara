package dia2.ejercicioCoches.coches;

public class RenaultClio extends Coche {

    public RenaultClio(int cv, String color){
        super("Renault","Clio", cv, color);
    }

    @Override
    public void arrancar() {
        System.out.println("Introduciendo tarjeta.");
        System.out.println("Apretando botón.");
        encendido = true;
        System.out.println("Coche encendido");
    }

    @Override
    public void apagar() {
        if(velocidad == 0) {
            encendido = false;
            System.out.println("Coche apagado. Recoge la tarjeta.");
        }else{
            System.out.println("No puedes apagar el coche en marcha.");
        }
    }
}
