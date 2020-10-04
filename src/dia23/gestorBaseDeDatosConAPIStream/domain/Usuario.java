package dia23.gestorBaseDeDatosConAPIStream.domain;

public class Usuario {

    private String nombre;
    private int edad;
    private double salario;
    private int id;

    public Usuario(String nombre, int edad, double salario){
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        id = -1;
    }

    public Usuario(int id, String nombre, int edad, double salario){
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("{\"nombre\": \"").append(nombre).append("\", \"edad\": ").append(edad)
                .append(", \"salario\": ").append(salario).append(", \"id\": ").append(id).append("}");
        return sb.toString();
    }

    public String toBeautyString(){
        StringBuilder sb = new StringBuilder();
        sb.append("{\n\"nombre\": \"").append(nombre).append("\", \n\"edad\": ").append(edad)
                .append(", \n\"salario\": ").append(salario).append(", \n\"id\": ").append(id).append("\n}");
        return sb.toString();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
