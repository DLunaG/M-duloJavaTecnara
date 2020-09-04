package dia3.recursosHumanos.usuarios;

import dia3.recursosHumanos.interfaces.IAutenticable;

import java.util.Base64;

public class Administrador extends Usuario implements IAutenticable {

    private String goldenKey;

    public Administrador(String nombre, String apellido, String telefono, String email, String goldenKey) {
        super(nombre, apellido, telefono, email, "Administrador");
        this.goldenKey = goldenKey;
    }

    @Override
    public String autenticarSuperusuario(){
        return Base64.getEncoder().encodeToString(("Bearer " + this.goldenKey).getBytes());
    }
}
