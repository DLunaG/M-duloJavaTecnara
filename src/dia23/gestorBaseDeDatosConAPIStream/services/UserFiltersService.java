package dia23.gestorBaseDeDatosConAPIStream.services;

import dia23.gestorBaseDeDatosConAPIStream.DAO.DAO;
import dia23.gestorBaseDeDatosConAPIStream.domain.Usuario;

import java.util.List;
import java.util.stream.Collectors;

public class UserFiltersService {

    private DAO dao;

    public UserFiltersService(){
        this.dao = new DAO();
    }

    public List<Usuario> filtrarPorNombre(String nombre){
        return dao.seleccionarTodosLosUsuarios()
                .stream()
                .filter(usuario -> usuario.getNombre().equalsIgnoreCase(nombre))
                .collect(Collectors.toList());
    }

    public List<Usuario> filtrarPorEdad(int edad){
        return dao.seleccionarTodosLosUsuarios()
                .stream()
                .filter(usuario -> usuario.getEdad() == edad)
                .collect(Collectors.toList());
    }

    public List<Usuario> filtrarPorSalario(double salario){
        return dao.seleccionarTodosLosUsuarios()
                .stream()
                .filter(usuario -> usuario.getSalario() == salario)
                .collect(Collectors.toList());
    }

    public Usuario filtrarPorMayorSalario(){
        return dao.seleccionarTodosLosUsuarios()
                .stream()
                .max((usuario1, usuario2) -> {
                    if(usuario1.getSalario() > usuario2.getSalario())
                        return 1;
                    if(usuario1.getSalario() < usuario2.getSalario())
                        return -1;
                    return 0;
                }).orElse(null);
    }

    public Usuario filtrarPorMayorEdad(){
        return dao.seleccionarTodosLosUsuarios()
                .stream().max((usuario1, usuario2) -> {
                   if(usuario1.getEdad() > usuario2.getEdad())
                       return 1;
                   if(usuario1.getEdad() < usuario2.getEdad())
                       return -1;
                   return 0;
                }).orElse(null);

    }

    public List<Usuario> filtrarPorRangoEdad(int edadMin, int edadMax){
        return dao.seleccionarTodosLosUsuarios()
                .stream()
                .filter(usuario -> usuario.getEdad() >= edadMin && usuario.getEdad() <= edadMax)
                .collect(Collectors.toList());
    }

    public List<Usuario> filtrarPorRangoSalario(double salarioMin, double salarioMax){
        return dao.seleccionarTodosLosUsuarios()
                .stream()
                .filter(usuario -> usuario.getSalario() >= salarioMin && usuario.getSalario() <= salarioMax)
                .collect(Collectors.toList());

    }

    public DAO getDao() {
        return dao;
    }
}
