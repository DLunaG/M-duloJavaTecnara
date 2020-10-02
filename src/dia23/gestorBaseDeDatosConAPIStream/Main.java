package dia23.gestorBaseDeDatosConAPIStream;

import dia23.gestorBaseDeDatosConAPIStream.DAO.DAO;
import dia23.gestorBaseDeDatosConAPIStream.domain.Usuario;

import java.sql.SQLException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        DAO dao = new DAO();

        Usuario pepe = new Usuario("Pepe", 54, 16500);

        System.out.println(dao.annadirUsuario(pepe));
        System.out.println(dao.eliminarUsuario(1));
        System.out.println(dao.actualizarUsuario(2, "Pepa", 55, 16700));

        dao.seleccionarTodosLosUsuarios().stream().forEach(usuario -> System.out.println(usuario.toString()));


    }
}
