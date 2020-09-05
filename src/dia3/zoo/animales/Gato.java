package dia3.zoo.animales;


import dia3.zoo.componentes.RandomComponents;

public class Gato extends Animal{

    public Gato(){
        super("Gato", false);
    }


    @Override
    public String show() {
        StringBuilder sb = new StringBuilder();
        sb.append("¡Vean a Fluffy, el gato malabarista!");

        switch(RandomComponents.randomResultShow()){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                sb.append("\nFluffy ejecuta el número de malabares con 4 pelotas. ¿!Cómo puede ser que un gato haga eso!?");
                break;
            default:
                sb.append("\nFluffy se acomoda y decide mirar al público con cara de desprecio.");
                break;
        }
        return sb.toString();
    }
}
