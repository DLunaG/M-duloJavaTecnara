package dia23.gestorBaseDeDatosConAPIStream.app.menu;

import dia23.gestorBaseDeDatosConAPIStream.DAO.DAO;

public class MenuExecuter {

    private MenuProjector menuProjector;
    private DAO dao;
    private boolean power;

    public MenuExecuter(){
        this.menuProjector = new MenuProjector();
        this.dao = new DAO();
        power = true;

    }

    public void ejecutarAplicacion(){
        System.out.println("Bienvenid@ al gestor de usuarios de la base de datos.");
        while(power) {
            int opcionElegida = menuProjector.ejecutarMenu();
            switch (opcionElegida) {
                case 1:
                    dao.annadirUsuario(menuProjector.crearUsuario());
                    System.out.println("Usuario añadido.");
                    break;
                case 2:
                    dao.eliminarUsuario(menuProjector.pedirIdUsuario());
                    System.out.println("Usuario eliminado.");
                    break;
                case 3:
                    dao.actualizarUsuario(menuProjector.pedirIdUsuario(), menuProjector.pedirNombreUsuario(), menuProjector.pedirEdadUsuario(), menuProjector.pedirSalarioUsuario());
                    System.out.println("Usuario actualizado.");
                    break;
                case 4:
                    int opcionFiltrarElegida = menuProjector.ejecutarSubmenuFiltroDeUsuarios();
                    abanicoDeFiltrarUsuario(opcionFiltrarElegida);
                    break;
                case 5:
                    dao.seleccionarTodosLosUsuarios().stream().forEach(System.out::println);
                    break;
                case 6:
                    menuProjector.cerrarMenu();
                    power = false;
            }
        }
    }

    private void abanicoDeFiltrarUsuario(int opcionElegida){
        switch (opcionElegida){
            case 1:
                menuProjector.getUfs().filtrarPorNombre(menuProjector.pedirNombreUsuario()).stream().forEach(System.out::println);
                break;
            case 2:
                menuProjector.getUfs().filtrarPorEdad(menuProjector.pedirEdadUsuario()).stream().forEach(System.out::println);
                break;
            case 3:
                menuProjector.getUfs().filtrarPorSalario(menuProjector.pedirSalarioUsuario()).stream().forEach(System.out::println);
                break;
            case 4:
                System.out.println(menuProjector.getUfs().filtrarPorMayorSalario());
                break;
            case 5:
                System.out.println(menuProjector.getUfs().filtrarPorMayorEdad());
                break;
            case 6:
                menuProjector.getUfs().filtrarPorRangoEdad(menuProjector.pedirRangoEdadMinimo(), menuProjector.pedirRangoEdadMaximo()).stream().forEach(System.out::println);
                break;
            case 7:
                menuProjector.getUfs().filtrarPorRangoSalario(menuProjector.pedirRangoSalarioMinimo(), menuProjector.pedirRangoSalarioMaximo()).stream().forEach(System.out::println);
                break;
            default:
        }
    }
}
