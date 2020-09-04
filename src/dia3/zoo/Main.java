package dia3.zoo;

import dia3.zoo.animales.Aguila;
import dia3.zoo.animales.Leon;
import dia3.zoo.animales.Tortuga;
import dia3.zoo.componentes.ShowZooComponents;

public class Main {

    public static void main(String[] args) {

        Leon leon = new Leon();
        Aguila aguila = new Aguila();
        Tortuga tortuga = new Tortuga();

        ShowZooComponents show = new ShowZooComponents();

        show.doAShow(leon);
        show.doADualShow(tortuga, aguila);

    }







}
