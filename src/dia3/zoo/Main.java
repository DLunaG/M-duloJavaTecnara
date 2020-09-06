package dia3.zoo;

import dia3.zoo.animales.*;

import dia3.zoo.componentes.ShowAquariumComponents;
import dia3.zoo.componentes.ShowZooComponents;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        Leon leon = new Leon();
        Aguila aguila = new Aguila();
        Tortuga tortuga = new Tortuga();
        Ballena ballena = new Ballena();
        Delfin delfin = new Delfin();
        Gato gato = new Gato();
        Papagayo papagayo = new Papagayo();

        ShowZooComponents show = new ShowZooComponents();

        show.doAShow(leon);
        show.doAShow(tortuga, aguila);
        show.doAShow(ballena, delfin);
        show.doAShow(gato, papagayo);


        show.prepareAndPerformanceAShow();


        ShowAquariumComponents aquariumShow = new ShowAquariumComponents();

        aquariumShow.doAShow(delfin);
        aquariumShow.doAShow(ballena);


    }







}
