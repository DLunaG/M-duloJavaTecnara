package dia22.programacionFuncionalStreamsYLambdas.ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> coches = new ArrayList<>();
        coches.add("Renault");
        coches.add("Mercedes");
        coches.add("Ford");
        coches.add("Citröen");
        coches.add("BMW");

        List<Integer> cochesPorNumDeLetras = coches.stream().map(coche -> coche.length()).filter(amount -> amount > 5).collect(Collectors.toList());
        cochesPorNumDeLetras.stream().forEach(coche -> System.out.println(coche));

        List<String> cochesConMasDeCincoLetras = coches.stream().filter(amount -> amount.length() > 5).collect(Collectors.toList());
        cochesConMasDeCincoLetras.stream().forEach(coche -> System.out.println(coche));

    }
}
