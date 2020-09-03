package dia2.ejercicioCoches;

import dia2.ejercicioCoches.coches.CitroenXsara;
import dia2.ejercicioCoches.coches.Coche;
import dia2.ejercicioCoches.coches.Renault4CV;
import dia2.ejercicioCoches.coches.RenaultClio;

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
    }
}
