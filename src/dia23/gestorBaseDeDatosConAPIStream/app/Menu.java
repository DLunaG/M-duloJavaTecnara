package dia23.gestorBaseDeDatosConAPIStream.app;

import dia23.gestorBaseDeDatosConAPIStream.domain.Usuario;
import dia23.gestorBaseDeDatosConAPIStream.services.UserService;

import java.util.Scanner;

public class Menu {

    private UserService us;
    private Scanner sc;
    private final String INVALID_ANSWER = "Opción errónea. Escriba la opción a la que desea acceder:";


    public Menu(){
        this.us = new UserService();
        this.sc = new Scanner(System.in);
    }

    public int ejecutarMenu(){
        System.out.println("Bienvenid@ al gestor de la base de datos.\nEscriba la opción a la que desea acceder:");

        int opcionElegida = -1;
        do {
            System.out.println(submenuPrincipal());
            try {
                opcionElegida = sc.nextInt();
                if(opcionElegida < 1 || opcionElegida > 6)
                    throw new Exception();
            }catch(Exception e){
                System.out.println(INVALID_ANSWER);
                sc.next();
            }
        }while(opcionElegida < 1 || opcionElegida > 6);

        return opcionElegida;
    }

    private String submenuPrincipal(){
        StringBuilder sb = new StringBuilder();
        sb.append("1.Añadir usuario.\n2.Eliminar usuario.\n3.Actualizar usuario.\n4.Filtrar usuarios.\n5.Mostrar todos los usuarios.\n6.Salir.");
        return sb.toString();
    }

    public int ejecutarSubmenuFiltroDeUsuarios(){
        StringBuilder sb = new StringBuilder();
        System.out.println("-Filtrar usuarios- Escriba la opción a la que desea acceder: ");

        int opcionElegida = -1;
        do {
            System.out.println(submenuFiltrarUsuario());
            try {
                opcionElegida = sc.nextInt();
                if(opcionElegida < 1 || opcionElegida > 7)
                    throw new Exception();
            }catch(Exception e){
                System.out.println(INVALID_ANSWER);
                sc.next();
            }
        }while(opcionElegida < 1 || opcionElegida > 7);

        return opcionElegida;
    }

    private String submenuFiltrarUsuario(){
        StringBuilder sb = new StringBuilder();
        sb.append("1.Filtrar por nombre.\n2.Filtrar por edad.\n3.Filtrar por salario.\n4.Mostrar el usuario con más salario.\n" +
                "5.Mostrar el usuario con más edad.\n6.Filtrar por rango de edad.\n7.Filtrar por rango de salario.");
        return sb.toString();
    }

    public static Usuario crearUsuario(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba el nombre del nuevo usuario: ");
        String nombre = sc.nextLine();

        System.out.println("Escriba su edad: ");
        int edad = sc.nextInt();

        System.out.println("Escriba su salario anual: ");
        double salario = sc.nextDouble();

        return new Usuario(nombre, edad, salario);
    }

    public static int pedirIdUsuario(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el nº id del usuario:");
        return sc.nextInt();
    }

    public static String pedirNombreUsuario(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el nombre del usuario: ");
        return sc.nextLine();
    }

    public static int pedirEdadUsuario(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba la edad del usuario: ");
        return sc.nextInt();
    }
    public static int pedirRangoEdadMinimo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el rango de edad mínimo de los usuarios: ");
        return sc.nextInt();
    }

    public static int pedirRangoEdadMaximo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el rango de edad máximo de los usuarios: ");
        return sc.nextInt();
    }

    public static double pedirSalarioUsuario(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el salario anual del usuario: ");
        return sc.nextDouble();
    }

    public static double pedirRangoSalarioMinimo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el rango mínimo del salario anual de los usuarios: ");
        return sc.nextDouble();
    }

    public static double pedirRangoSalarioMaximo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el rango máximo del salario anual de los usuarios: ");
        return sc.nextDouble();
    }


    public void cerrarMenu(){
        System.out.println("Gracias por utilizar el gestor de la base de datos.\nHasta pronto.");
    }

    public UserService getUs() {
        return us;
    }
}
