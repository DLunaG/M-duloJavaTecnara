package dia3.zoo.animales;

import dia3.zoo.componentes.RandomComponents;


public class Papagayo extends Animal{

    public Papagayo(){
        super("Papagayo", false);
    }


    @Override
    public String show() {
        StringBuilder sb = new StringBuilder();
        sb.append("¡El papagayo se prepara en mitad de la pista!");

        switch(RandomComponents.randomResultShow()){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                sb.append("\nSuena la música y encandila al público con sus piruetas y movimientos de cabeza.");
                break;
            case 8:
            case 9:
                sb.append("\nSuena la música, pero se ha colado una pista de reggaeton y el papagayo huye indignado.");
                break;
            case 10:
                sb.append("¡Dios mío, ha aparecido el león y ha engullido al papagayo de un solo bocado!");
        }
        return sb.toString();
    }
}