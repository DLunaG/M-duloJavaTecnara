package dia23.gestorBaseDeDatosConAPIStream.app.menu;

import dia23.gestorBaseDeDatosConAPIStream.DAO.DAO;

public class MenuExecuter {

    private MenuView menuView;
    private DAO dao;
    private boolean power;

    public MenuExecuter(){
        this.menuView = new MenuView();
        this.dao = new DAO();
        power = true;

    }

    public void ejecutarAplicacion(){
        System.out.println("Bienvenid@ al gestor de usuarios de la base de datos.");
        while(power) {
            int opcionElegida = menuView.ejecutarMenu();
            switch (opcionElegida) {
                case 1:
                    dao.annadirUsuario(menuView.crearUsuario());
                    System.out.println("Usuario añadido.");
                    break;
                case 2:
                    dao.eliminarUsuario(menuView.pedirIdUsuario());
                    System.out.println("Usuario eliminado.");
                    break;
                case 3:
                    dao.actualizarUsuario(menuView.pedirIdUsuario(), menuView.pedirNombreUsuario(), menuView.pedirEdadUsuario(), menuView.pedirSalarioUsuario());
                    System.out.println("Usuario actualizado.");
                    break;
                case 4:
                    int opcionFiltrarElegida = menuView.ejecutarSubmenuFiltroDeUsuarios();
                    abanicoDeFiltrarUsuario(opcionFiltrarElegida);
                    break;
                case 5:
                    dao.seleccionarTodosLosUsuarios().stream().forEach(System.out::println);
                    break;
                case 6:
                    menuView.cerrarMenu();
                    power = false;
            }
        }
    }

    private void abanicoDeFiltrarUsuario(int opcionElegida){
        switch (opcionElegida){
            case 1:
                menuView.getUfs().filtrarPorNombre(menuView.pedirNombreUsuario()).stream().forEach(System.out::println);
                break;
            case 2:
                menuView.getUfs().filtrarPorEdad(menuView.pedirEdadUsuario()).stream().forEach(System.out::println);
                break;
            case 3:
                menuView.getUfs().filtrarPorSalario(menuView.pedirSalarioUsuario()).stream().forEach(System.out::println);
                break;
            case 4:
                System.out.println(menuView.getUfs().filtrarPorMayorSalario());
                break;
            case 5:
                System.out.println(menuView.getUfs().filtrarPorMayorEdad());
                break;
            case 6:
                menuView.getUfs().filtrarPorRangoEdad(menuView.pedirRangoEdadMinimo(), menuView.pedirRangoEdadMaximo()).stream().forEach(System.out::println);
                break;
            case 7:
                menuView.getUfs().filtrarPorRangoSalario(menuView.pedirRangoSalarioMinimo(), menuView.pedirRangoSalarioMaximo()).stream().forEach(System.out::println);
                break;
            default:
        }
    }
}
