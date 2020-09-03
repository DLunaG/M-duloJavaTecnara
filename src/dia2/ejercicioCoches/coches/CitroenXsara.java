package dia2.ejercicioCoches.coches;

public class CitroenXsara extends Coche{

    public CitroenXsara(int cv, String color){
        super("Citröen", "Xsara", cv, color);
    }

    @Override
    public void arrancar() {
        System.out.println("Girando llave...");
        encendido = true;
        System.out.println("Coche arrancado.");
    }

    @Override
    public void apagar(){
        if(velocidad == 0) {
            encendido = false;
            System.out.println("Coche apagado. Recoge la llave.");
        }else{
            System.out.println("No puedes apagar el coche en marcha.");
        }
    }
}
