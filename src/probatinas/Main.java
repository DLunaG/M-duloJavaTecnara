package probatinas;

public class Main {
    public static void main(String[] args) {

        Clase clase = new Clase();

        final String cadena = "Hola";
        clase.metodo(cadena);

        System.out.println(cadena);

        String conductor = "B";//10
        String vehiculo = "C";//11

        System.out.println(conductor.compareTo(vehiculo));

        int[][] matrix = new int[2][3];
        int x = 1;
        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j]= x;
                System.out.print(x);
                x++;
            }
        }






    }
}
