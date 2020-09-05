package dia3.zoo.animales;

import dia3.zoo.componentes.RandomComponents;

public class Tortuga extends Animal {

    public Tortuga(){
        super("Tortuga", false);
    }

    @Override
    public String show(){
        StringBuilder sb = new StringBuilder();
        sb.append("¡¡La tortuga se dispone a correr contra la liebre!!");

        switch(RandomComponents.randomResultShow()){
            case 1:
            case 2:
            case 3:
                sb.append("\nLa liebre se tuerce el tobillo en el pistoletazo de salida." +
                        "\nTras dos horas de \"show\", la tortuga cruza la meta proclamándose campeona.");
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                sb.append("\nEvidentemente, la liebre ha ganado la carrera.");
                break;
            case 8:
            case 9:
            case 10:
                sb.append("\nPero saca una lechuga de su caparazón y decide mirar lo bien que corre la liebre.");
                break;
        }

        return sb.toString();
    }
}
