package dia21.instanciasDeNegocios;

import dia21.instanciasDeNegocios.negocios.Panaderia;
import dia21.instanciasDeNegocios.negocios.Supermercado;
import dia21.instanciasDeNegocios.negocios.Taller;

public class Main {

    public static void main(String[] args) {

        Supermercado eroski = new Supermercado("Eroski", 250000, 15);
        Taller talleresPeña = new Taller("Talleres Peña", 40000, 3);
        Panaderia petra = new Panaderia("Panadería Petra", 25000, 2);

        eroski.abrir();
        eroski.reponerEstante();


        talleresPeña.abrir();
        talleresPeña.hacerPropaganda();

        petra.abrir();
        petra.hornearPan();

    }

}
