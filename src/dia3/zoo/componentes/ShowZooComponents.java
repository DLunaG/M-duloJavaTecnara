package dia3.zoo.componentes;

import dia3.zoo.animales.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ShowZooComponents {

    public static void doAShow(Animal animal){
        if(animal.getIsAquatic()){
            System.out.println("El/La " + animal.getEspecie() + " no puede realizar un show en el Zoo.");
            System.out.println();
        }else {
            System.out.println(animal.show());
            System.out.println();
        }
    }

    public static void doAShow(Animal animal1, Animal animal2){
        doAShow(animal1);
        doAShow(animal2);
    }

    public static void prepareAndPerformanceAShow(){
        boolean power = true;
        List<Animal> lista = new ArrayList<Animal>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Esto es el preparador de shows del Zoo:");
        while (power){
            System.out.println("¿Desea añadir un animal al show? 1.Sí 2.No\n");
            int respuesta = sc.nextInt();
            if (respuesta == 1){
                System.out.println("¿Qué animal desea añadir al show? \n1.Águila 2.Gato 3.Leon 4.Papagayo 5.Tortuga");
                switch(sc.nextInt()){
                    case 1:
                        lista.add(new Aguila());
                        break;
                    case 2:
                        lista.add(new Gato());
                        break;
                    case 3:
                        lista.add(new Leon());
                        break;
                    case 4:
                        lista.add(new Papagayo());
                        break;
                    case 5:
                        lista.add(new Tortuga());
                        break;
                }

            }else if (respuesta == 2){
                System.out.println("Lista cerrada. Que comience el espectáculo!\n");
                power = false;
            }else{
                System.out.println("Invalid number.");
            }
        }
        for (Animal animal : lista){
            doAShow(animal);
        }
    }
}
