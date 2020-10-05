package dia23.gestorBaseDeDatosConAPIStream.DAO;

import dia23.gestorBaseDeDatosConAPIStream.domain.Usuario;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DAO {

    private Connection cn;

    public DAO(){
        try {
            Class.forName("org.postgresql.Driver");
            //System.out.println("Clase encontrada.");
            this.cn = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost/empresastream", "postgres", "1234");
        } catch (
                ClassNotFoundException e) {
            System.out.println("Clase no encontrada.");
        } catch (
                SQLException e) {
            System.out.println("SQL Error: " + e.toString());
        }
    }

    public void annadirUsuario(Usuario usuario){
        try {
            Statement st = cn.createStatement();
            StringBuilder sb = new StringBuilder("INSERT INTO usuario (nombre, edad, salario) VALUES ('");
            sb.append(usuario.getNombre()).append("', '")
                    .append(usuario.getEdad()).append("', '")
                    .append(usuario.getSalario()).append("');");
            st.executeUpdate(sb.toString());
            st.close();
        }catch(SQLException e){
                System.out.println("Añadir usuario SQLError: " + e.getMessage());
            }
    }

    public void eliminarUsuario(int id){
        try {
            Statement st = cn.createStatement();
            StringBuilder sb = new StringBuilder("DELETE FROM usuario WHERE id = '").append(id).append("';");
            st.executeUpdate(sb.toString());
            st.close();
        }catch(SQLException e){
            System.out.println("Eliminar Usuario SQLError: " + e.getMessage());
        }
    }

    public void actualizarUsuario(int id, String nombre, int edad, double salario){
        try{
            Statement st = cn.createStatement();
            StringBuilder sb = new StringBuilder("UPDATE usuario set nombre = '").append(nombre).append("', edad = ")
                    .append(edad).append(", salario = ").append(salario).append(" WHERE id = ").append(id).append(";");
            st.executeUpdate(sb.toString());
            st.close();
        }catch(SQLException e){
            System.out.println("Actualizar Usuario SQLError: " + e.getMessage());
        }
    }

    public List<Usuario> seleccionarTodosLosUsuarios(){
        List<Usuario> usuarios = new ArrayList<>();
        try {
            Statement st = cn.createStatement();
            StringBuilder sb = new StringBuilder("SELECT * FROM usuario;");
            ResultSet rs = st.executeQuery(sb.toString());
            while(rs.next()){
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                int edad = rs.getInt("edad");
                double salario = rs.getDouble("salario");
                Usuario usuario = new Usuario(id, nombre, edad, salario);
                usuarios.add(usuario);
            }
            st.close();
        }catch(SQLException e){
            System.out.println("FiltrarPorNombre SQLError: " + e.getMessage());
        }
        return usuarios;
    }
}
