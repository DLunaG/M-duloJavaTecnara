package dia22.programacionFuncionalStreamsYLambdas.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static String vocalsRegex = "[AEIOUaeiouÁÉÍÓÚáéíóú]";

    public static List<Character> convertirCadenaAMatriz(String cadena){
        List<Character> matrizDeChars = new ArrayList<>();
        for(char c: cadena.toCharArray()){
            matrizDeChars.add(c);
        }
        return matrizDeChars;
    }

    public static long contarVocales(List<Character> caracteres){
        return caracteres.stream().filter(item -> Character.toString(item).matches(vocalsRegex)).count();
    }
}
