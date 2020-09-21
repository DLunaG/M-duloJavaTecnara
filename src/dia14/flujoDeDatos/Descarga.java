package dia14.flujoDeDatos;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

public class Descarga extends Thread {
    private String url;
    private String archivo;
    private String nombrePortal;
    private long tiempoDeDescarga;
    private boolean tiempoExcedido;

    public Descarga(String url, String archivo, String nombrePortal) {
        this.url = url;
        this.archivo = archivo;
        this.nombrePortal = nombrePortal;
    }

    @Override
    public void run() {
        long tiempoInicial = System.currentTimeMillis();
        descargarArchivo();
        this.tiempoDeDescarga = System.currentTimeMillis() - tiempoInicial;
        comprobarExcesoTiempoDeDescarga();
    }

    private void descargarArchivo() {
        ReadableByteChannel readableByteChannel;
        {
            try {
                readableByteChannel = Channels.newChannel(new URL(this.url).openStream());
                FileOutputStream fileOutputStream = new FileOutputStream(this.archivo);
                FileChannel fileChannel = fileOutputStream.getChannel();
                fileChannel.transferFrom(readableByteChannel, 0, Long.MAX_VALUE);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void comprobarExcesoTiempoDeDescarga(){
        if (tiempoDeDescarga > 5000) {
            tiempoExcedido = true;
        }
    }


    //GETTERS
    public String getNombrePortal() {
        return nombrePortal;
    }
    public long getTiempoDeDescarga() {
        return tiempoDeDescarga;
    }
    public boolean isTiempoExcedido() {
        return tiempoExcedido;
    }
}
