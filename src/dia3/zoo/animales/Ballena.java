package dia3.zoo.animales;


import dia3.zoo.componentes.RandomComponents;

public class Ballena extends Acuatico{

    public Ballena(){
        super("Ballena");
    }

    @Override
    public String show(){
        StringBuilder sb = new StringBuilder();
        sb.append("¡¡La ballena hace acto de presencia!!");

        switch(RandomComponents.randomResultShow()){
            case 1:
            case 2:
            case 3:
            case 4:
                sb.append("\nEl público se queda asombrado de semejante animal.");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                sb.append("\n¡La ballena realiza un salto y deja completamente mojado a todo el público!.");
                break;
            case 10:
                sb.append("\nLa ballena choca contra la cristalera y se queda resquebrajada." +
                        "\nLa gente huye despavorida ante el miedo de la rotura total del estanque.");
                break;
        }

        return sb.toString();
    }
}
