package dia2.ejercicioCoches;

import dia2.ejercicioCoches.coches.*;

public class Main {

    public static void main(String[] args) {

        CitroenXsara xsara = new CitroenXsara(70, "plata");
        xsara.arrancar();
        xsara.conducir();
        xsara.acelerar();
        xsara.acelerar();
        xsara.apagar();
        xsara.frenar();
        xsara.frenar();
        xsara.frenar();
        xsara.frenar();
        System.out.println("Velocidad: " + xsara.getVelocidad());
        xsara.apagar();
        xsara.conducir();
        System.out.println("Potencia CXsara: " + xsara.getPotencia() + "cv.");
        System.out.println("Color: " + xsara.getColor());


        System.out.println();
        Renault4CV cuatroLatas = new Renault4CV(27, "amarillo");
        System.out.println(cuatroLatas.getMarca());
        System.out.println(cuatroLatas.getModelo());
        cuatroLatas.acelerar();
        cuatroLatas.arrancar();
        cuatroLatas.conducir();
        cuatroLatas.apagar();
        System.out.println("Potencia: " + cuatroLatas.getPotencia() + "cv.");


        System.out.println();
        Coche clio = new RenaultClio(90, "azul");
        System.out.println(clio.getModelo());
        clio.arrancar();
        clio.conducir();
        clio.apagar();

        System.out.println();
        TombolaCoches tombola = new TombolaCoches();
        Coche coche = tombola.sortearCoche();
        coche.iniciarReproduccion();
        coche.detenerReproduccion();
        System.out.println(coche.getModelo());
        coche.arrancar();

        System.out.println();
        IMusicable coche2 = tombola.sortearCoche();
        coche2.iniciarReproduccion();

    }
}
