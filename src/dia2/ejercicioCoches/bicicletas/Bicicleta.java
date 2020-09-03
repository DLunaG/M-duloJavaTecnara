package dia2.ejercicioCoches.bicicletas;

import dia2.ejercicioCoches.IMusicable;

public class Bicicleta implements IMusicable {

    private String marca;
    private String modelo;
    private String color;

    public Bicicleta(String marca, String modelo, String color){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    @Override
    public void iniciarReproduccion() {
        System.out.println("Sonando música ♫♫");
    }

    @Override
    public void detenerReproduccion() {
        System.out.println("Música apagada.");
    }
}
