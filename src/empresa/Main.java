package empresa;

public class Main {

    public static void main(String[] args) {

        Empleado picador = new Picador(21);
        picador.mostrarVacaciones();
        picador.trabajar();
        picador.cobrarNomina();

        System.out.println();
        Empleado paco = new Aguador();
        paco.mostrarVacaciones();
        paco.trabajar();

        System.out.println();
        Empleado jorge = new SacaArena(8);
        jorge.trabajar();
        jorge.mostrarVacaciones();

    }
}
