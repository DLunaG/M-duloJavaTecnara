package dia22.programacionFuncionalStreamsYLambdas.ejercicio2;
//Ejercicios API funcional:
//Se pide, teniendo una lista de alumnos:
//Filtrar los que tengan menos de 10 letras y mostrarlos por pantalla.
//Mapearlos a una lista que muestre el número de vocales de cada uno y mostrarlos por pantalla
//Mapearlos a una lista que tenga el número de vocales de cada uno y mostrar por pantalla el que más tenga.
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> alumnos = new ArrayList<>();
        alumnos.add("Alejandro Antonio");
        alumnos.add("Mercedes");
        alumnos.add("Io");
        alumnos.add("María de los Ángeles");
        alumnos.add("Fernando");
        alumnos.add("Jéssica");

        alumnos.stream()
                .filter(amount -> amount.length() <= 10)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("=================================");

        List<Long> numDeVocales = alumnos.stream().map(alumno -> {
           List<Character> characters = Utils.convertirCadenaAMatriz(alumno);
           return Utils.contarVocales(characters);
        }).collect(Collectors.toList());

        numDeVocales.stream().forEach(alumno -> System.out.println(alumno));

        System.out.println("==================================");

        long mayorNumDeVocales = numDeVocales.stream().max((num1, num2) -> {
           if(num1 > num2){
               return 1;
           }
           if(num1 < num2){
               return -1;
           }
           return 0;
        }).get();

        System.out.println(mayorNumDeVocales);
    }
}
