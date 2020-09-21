package dia13.multihilos.carreraCoches;

public class Coche extends Thread {
    private float velocidad;
    private String name;
    private Circuito circuito;
    private long tiempoMedidoDeCarrera;

    public Coche(float velocidad, String name){
        this.velocidad = velocidad;
        this.name = name;
        circuito = null;
    }

    @Override
    public void run() {
        if(circuito != null) {
            long tiempoInicial = System.currentTimeMillis();
            float tiempoRecorrido = calculoTiempoRecorrido();
            try {
                this.join((int) tiempoRecorrido);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(name + " cruzó la meta.");
            long tiempoFinal = System.currentTimeMillis();
            tiempoMedidoDeCarrera = tiempoFinal - tiempoInicial;
            circuito.posicionCruzandoMeta(this);

        }else{
            System.out.println("Este coche no está en ningún circuito.");
        }
    }

    public float calculoTiempoRecorrido(){
        return circuito.getLongitud() / velocidad * 60 * 1000;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public String getNameCar() {
        return name;
    }

    public Circuito getCircuito() {
        return circuito;
    }

    public long getTiempoMedidoDeCarrera() {
        return tiempoMedidoDeCarrera;
    }

    public void setCircuito(Circuito circuito) {
        this.circuito = circuito;
    }
}