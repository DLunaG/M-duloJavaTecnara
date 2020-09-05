package dia3.zoo.animales;

import dia3.zoo.componentes.RandomComponents;


public class Leon extends Animal {

    public Leon(){
        super("León", false);
    }

    @Override
    public String show(){
        StringBuilder sb = new StringBuilder();
        sb.append("¡¡¡El león se dispone a cruzar el aro de fuego!!!");

        switch(RandomComponents.randomResultShow()){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                sb.append("\nEl león ejecuta el salto con gran elegancia.");
                break;
            case 6:
            case 7:
            case 8:
                sb.append("\nPero el león decide lamerse las patas.");
                break;
            case 9:
            case 10:
                sb.append("\nEl león salta el aro, pero acto seguido decide atacar al domador.");
                break;
        }

        return sb.toString();
    }
}
