package dia23.gestorBaseDeDatosConAPIStream.services;

import dia23.gestorBaseDeDatosConAPIStream.DAO.DAO;
import dia23.gestorBaseDeDatosConAPIStream.domain.Usuario;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UserService{

    private DAO dao;

    public UserService(){
        this.dao = new DAO();
    }

    public List<Usuario> filtrarPorNombre(String nombre){
        List<Usuario> usuarios = dao.seleccionarTodosLosUsuarios()
                .stream()
                .filter(usuario -> usuario.getNombre().equalsIgnoreCase(nombre))
                .collect(Collectors.toList());

        return usuarios;
    }

    public List<Usuario> filtrarPorEdad(int edad){
        List<Usuario> usuarios = dao.seleccionarTodosLosUsuarios()
                .stream()
                .filter(usuario -> usuario.getEdad() == edad)
                .collect(Collectors.toList());

        return usuarios;
    }

    public List<Usuario> filtrarPorSalario(double salario){
        List<Usuario> usuarios = dao.seleccionarTodosLosUsuarios()
                .stream()
                .filter(usuario -> usuario.getSalario() == salario)
                .collect(Collectors.toList());

        return usuarios;
    }

    public Usuario filtrarPorMayorSalario(){
        Optional<Usuario> usuarioConMayorSalario = dao.seleccionarTodosLosUsuarios()
                .stream()
                .max((usuario1, usuario2) -> {
                    if(usuario1.getSalario() > usuario2.getSalario())
                        return 1;
                    if(usuario1.getSalario() < usuario2.getSalario())
                        return -1;
                    return 0;
                });

        return usuarioConMayorSalario.get();
    }

    public Usuario filtrarPorMayorEdad(){
        Optional<Usuario> usuarioConMasEdad = dao.seleccionarTodosLosUsuarios()
                .stream().max((usuario1, usuario2) -> {
                   if(usuario1.getEdad() > usuario2.getEdad())
                       return 1;
                   if(usuario1.getEdad() < usuario2.getEdad())
                       return -1;
                   return 0;
                });

        return usuarioConMasEdad.get();
    }

    public List<Usuario> filtrarPorRangoEdad(int edadMin, int edadMax){
        List<Usuario> usuarios = dao.seleccionarTodosLosUsuarios()
                .stream()
                .filter(usuario -> usuario.getEdad() >= edadMin && usuario.getEdad() <= edadMax)
                .collect(Collectors.toList());

        return usuarios;
    }

    public List<Usuario> filtrarPorRangoSalario(double salarioMin, double salarioMax){
        List<Usuario> usuarios = dao.seleccionarTodosLosUsuarios()
                .stream()
                .filter(usuario -> usuario.getSalario() >= salarioMin && usuario.getSalario() <= salarioMax)
                .collect(Collectors.toList());

        return usuarios;
    }

    public DAO getDao() {
        return dao;
    }
}
