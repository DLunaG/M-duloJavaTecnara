package sobrecargaDeMetodosYHerencia;

public class Suma extends Logger{

    public static int suma(int numero){

        int resultado = numero + numero;
        log(String.valueOf(resultado));
        return resultado;
    }

    public static int suma(int numero1, int numero2){

        int resultado = numero1 + numero2;
        log(String.valueOf(resultado));
        return resultado;
    }

    public static int suma(int numero1, int numero2, int numero3){

        int resultado = numero1 + numero2 + numero3;
        log(String.valueOf(resultado));
        return resultado;
    }

}
