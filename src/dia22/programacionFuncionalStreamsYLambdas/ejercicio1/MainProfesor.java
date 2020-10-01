package dia22.programacionFuncionalStreamsYLambdas.ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MainProfesor {

    public static void main(String[] args) {
        List<String> cadenas = new ArrayList<>();
        cadenas.add("el yoyas le pega al moya");
        cadenas.add("yo no juego al yoyo con moya");
        cadenas.add("holaaaaa");
        Optional<String> maxNumY = cadenas.stream().max((cadena1, cadena2) -> {
            ArrayList<Character> cadena1Arr = new ArrayList<Character>();
            for (char c : cadena1.toCharArray()) {
                cadena1Arr.add(c);
            }
            long yEnCadena1 = cadena1Arr.stream().filter(character -> character.equals('y')).count();
            System.out.println("cadena 1: " + yEnCadena1 + " - " + cadena1);
            ArrayList<Character> cadena2Arr = new ArrayList<Character>();
            for (char c : cadena2.toCharArray()) {
                cadena2Arr.add(c);
            }
            long yEnCadena2 = cadena2Arr.stream().filter(character -> character.equals('y')).count();
            System.out.println("cadena 2: " + yEnCadena2 + " - " + cadena2);
            if (yEnCadena1 > yEnCadena2) {
                return 1;
            }
            if (yEnCadena1 < yEnCadena2) {
                return -1;
            }
            return 0;
        });
        if (maxNumY.isPresent()) {
            System.out.println("max num de Y: " + maxNumY.get());
        }
    }

}
