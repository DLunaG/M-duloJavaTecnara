package dia23.gestorBaseDeDatosConAPIStream.app;

import java.util.Scanner;

public class Aplicacion {

    private Menu menu;
    private Scanner sc;
    private boolean power;

    public Aplicacion(){
        this.menu = new Menu();
        this.sc = new Scanner(System.in);
        power = true;

    }

    public void ejecutarAplicacion(){
        while(power) {
            int opcionElegida = menu.ejecutarMenu();
            switch (opcionElegida) {
                case 1:
                    menu.getUs().getDao().annadirUsuario(menu.crearUsuario());
                    System.out.println("Usuario añadido.");
                    break;
                case 2:
                    menu.getUs().getDao().eliminarUsuario(menu.pedirIdUsuario());
                    System.out.println("Usuario eliminado.");
                    break;
                case 3:
                    menu.getUs().getDao().actualizarUsuario(menu.pedirIdUsuario(), menu.pedirNombreUsuario(), menu.pedirEdadUsuario(), menu.pedirSalarioUsuario());
                    System.out.println("Usuario actualizado.");
                    break;
                case 4:
                    int opcionFiltrarElegida = menu.ejecutarSubmenuFiltroDeUsuarios();
                    abanicoDeFiltrarUsuario(opcionFiltrarElegida);
                    break;
                case 5:
                    menu.getUs().getDao().seleccionarTodosLosUsuarios().stream().forEach(System.out::println);
                    break;
                case 6:
                    menu.cerrarMenu();
                    power = false;
            }
        }
    }

    private void abanicoDeFiltrarUsuario(int opcionElegida){
        switch (opcionElegida){
            case 1:
                menu.getUs().filtrarPorNombre(menu.pedirNombreUsuario()).stream().forEach(System.out::println);
                break;
            case 2:
                menu.getUs().filtrarPorEdad(menu.pedirEdadUsuario()).stream().forEach(System.out::println);
                break;
            case 3:
                menu.getUs().filtrarPorSalario(menu.pedirSalarioUsuario()).stream().forEach(System.out::println);
                break;
            case 4:
                System.out.println(menu.getUs().filtrarPorMayorSalario());
                break;
            case 5:
                System.out.println(menu.getUs().filtrarPorMayorEdad());
                break;
            case 6:
                menu.getUs().filtrarPorRangoEdad(menu.pedirRangoEdadMinimo(), menu.pedirRangoEdadMaximo()).stream().forEach(System.out::println);
                break;
            case 7:
                menu.getUs().filtrarPorRangoSalario(menu.pedirRangoSalarioMinimo(), menu.pedirRangoSalarioMaximo()).stream().forEach(System.out::println);
                break;
        }
    }
}
