package dia14.flujoDeDatos;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

public class Descarga {
    private String url;
    private String archivo;
    private String nombrePortal;
    private long tiempoDeDescarga;
    private boolean tiempoExcedido;

    public Descarga(String url, String archivo, String nombrePortal) {
        this.url = url;
        this.archivo = archivo;
        this.nombrePortal = nombrePortal;
        this.tiempoExcedido = false;
        descargarArchivo();
        comprobarTiempoDeDescarga();
    }

    private void descargarArchivo() {

        ReadableByteChannel readableByteChannel;
        long tiempoInicial = System.currentTimeMillis();
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
        long tiempoFinalizacion = System.currentTimeMillis();
        this.tiempoDeDescarga = tiempoFinalizacion - tiempoInicial;
    }

    private void comprobarTiempoDeDescarga(){
        if (tiempoDeDescarga > 5000) {
            tiempoExcedido = true;
        }
    }


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
