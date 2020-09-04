package dia3.recursosHumanos.usuarios;

public abstract class Usuario {

    protected String nombre;
    protected String apellido;
    protected String telefono;
    protected String email;
    protected String tipoUsuario;

    public Usuario(String nombre, String apellido, String telefono, String email, String tipoUsuario){
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.tipoUsuario = tipoUsuario;
    }

    public String welcomeMessage(){
        StringBuilder sb = new StringBuilder("Bienvenid@ ");
        sb.append(nombre);
        sb.append(" ");
        sb.append(apellido);
        sb.append(", eres ");
        sb.append(tipoUsuario);
        sb.append(".");
        return sb.toString();
    }
}
