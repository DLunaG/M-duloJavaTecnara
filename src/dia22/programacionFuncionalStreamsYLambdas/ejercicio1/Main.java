package dia22.programacionFuncionalStreamsYLambdas.ejercicio1;

//Dada una lista de varias cadenas, crea una expresión lambda que devuelve la cadena con mayor nº de "y".

//Ejercicio: Implementar, mediante programación funcional,
//un código que devuelva la cadena que más 'y' tenga, dentro de una lista de cadenas.

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class Main {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("Arroyo");
        stringList.add("Samaruco");
        stringList.add("Yayo");
        stringList.add("Iaia");
        stringList.add("Programación");
        stringList.add("Yeísta");


        Optional<String> stringConMasGriegas = stringList.stream().max((cad1, cad2) ->{
            char[] cad1arr = cad1.toCharArray();
            char[] cad2arr = cad2.toCharArray();
            int cad1Count = 0;
            int cad2Count = 0;
            for (char c : cad1arr){
                if(c == 'y' || c == 'Y'){
                    cad1Count++;
                }
            }
            for (char c : cad2arr){
                if(c == 'y' || c == 'Y'){
                    cad2Count++;
                }
            }
            if (cad1Count > cad2Count) {
                return 1;
            }
            if (cad1Count < cad2Count) {
                return -1;
            }
            return 0;
        });

        System.out.println(stringConMasGriegas.get());
    }
}



