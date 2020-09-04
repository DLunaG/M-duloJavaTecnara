package dia3.recursosHumanos.usuarios;


import dia3.recursosHumanos.interfaces.IAutenticable;

import java.util.Base64;

public class Sistema extends Usuario implements IAutenticable {

    private String goldenKey;

    public Sistema(String nombre, String apellido, String telefono, String email, String goldenKey) {
        super(nombre, apellido, telefono, email, "Sistema");
        this.goldenKey = goldenKey;
    }

    @Override
    public String autenticarSuperusuario(){
        return Base64.getEncoder().encodeToString(("Bearer " + this.goldenKey).getBytes());
    }

}
