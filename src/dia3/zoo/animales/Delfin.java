package dia3.zoo.animales;


import dia3.zoo.componentes.RandomComponents;

public class Delfin extends Acuatico {

    public Delfin(){
        super("Delfín");
    }

    @Override
    public String show() {
        StringBuilder sb = new StringBuilder();
        sb.append("¡Vean a nuestro delfín!");

        switch(RandomComponents.randomResultShow()){
            case 1:
            case 2:
            case 3:
            case 4:
                sb.append("\n!Vamos a escoger a dos personas del público!" +
                        "\nLos dos elegidos se lo pasan en grande dándole sardinas al delfín.");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                sb.append("\nEl delfín realiza el número de las piruetas con gran elegancia.");
                break;
            case 10:
                sb.append("\nVaya, parece que el delfín ha decidido echarse una siesta.");
                break;
        }

        return sb.toString();
    }
}
