package probatinas;

public class Main {
    public static void main(String[] args) {

        Clase clase = new Clase();

        final String cadena = "Hola";
        clase.metodo(cadena);

        System.out.println(cadena);

        String conductor = "B";//10
        String vehiculo = "C";//11

        System.out.println(conductor.compareTo(vehiculo));




    }
}
