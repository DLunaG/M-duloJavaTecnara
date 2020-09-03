package dia2.ejercicioCoches.coches;

import dia2.ejercicioCoches.IMusicable;

//al apagar, comprobar que está parado
public abstract class Coche implements IMusicable {

    private String marca;
    private String modelo;
    private int caballos;
    private String color;
    protected float velocidad;
    protected boolean encendido;
    protected boolean conduciendo;

    public Coche(String marca, String modelo, int cv, String color){
        this.marca = marca;
        this.modelo = modelo;
        this.caballos = cv;
        this.color = color;
        this.velocidad = 0;
    }

    public abstract void arrancar();
    public abstract void apagar();

    public void conducir() {
        if (encendido && velocidad == 0) {
            System.out.println("**Conduciendo**");
            conduciendo = true;
        }else{
            System.out.println("El coche no acelera... El coche está apagado.");
            conduciendo = false;
        }
    }

    public void acelerar(){
        if(conduciendo){
            this.velocidad++;
            System.out.println("El coche va a " + velocidad + "km/h.");
        }else{
            System.out.println("El coche está apagado, no puedes acelerar.");
        }
    }

    public void frenar(){
        if(velocidad <= 0){
            //No pasa nada.
        }else{
            this.velocidad--;
            System.out.println("El coche va a " + velocidad + "km/h.");
        }
    }

    @Override
    public void iniciarReproduccion() {
        System.out.println("Sonando música ♫♫");
    }

    @Override
    public void detenerReproduccion() {
        System.out.println("Música apagada.");
    }


    //Métodos getter
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getPotencia(){
        return caballos;
    }
    public float getVelocidad(){
        return velocidad;
    }
    public String getColor(){
        return color;
    }
}
