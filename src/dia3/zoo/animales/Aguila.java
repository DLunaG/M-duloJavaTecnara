package dia3.zoo.animales;


import dia3.zoo.componentes.RandomComponents;

public class Aguila extends Animal{

    public Aguila(){
        super("Águila", false);
    }

    @Override
    public String show(){
        StringBuilder sb = new StringBuilder();
        sb.append("¡Y ahora el águila volará por encima del público!");

        switch(RandomComponents.randomResultShow()){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                sb.append("\nEl público se ha quedado con la boca abierta al ver la majestuosidad del águila.");
                break;
            case 6:
            case 7:
            case 8:
                sb.append("\nPero el águila desaparece en el horizonte.");
                break;
            case 9:
            case 10:
                sb.append("\nLamentablemente, el águila ha decidido evacuar y el show ha sido eclipsado por gritos y risas.");
                break;
        }

        return sb.toString();
    }
}
