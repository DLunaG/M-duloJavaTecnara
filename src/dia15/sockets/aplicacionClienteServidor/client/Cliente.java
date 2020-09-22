package dia15.sockets.aplicacionClienteServidor.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Cliente {

    public static void main(String[] args) throws IOException {

        Socket s = new Socket("localhost",3333);
        enviarMensaje(s, "{farolaNumero:1.2, valor:10}");
        System.out.println(recibirResultado(s));
        s.close();



    }

    private static void enviarMensaje(Socket s, String mensajeAEnviar) throws IOException {

        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        dout.writeUTF(mensajeAEnviar);
        System.out.println("Mensaje enviado.");

    }

    private static String recibirResultado(Socket s) throws IOException {
        DataInputStream din = new DataInputStream(s.getInputStream());
        String resultadoRecibido = din.readUTF();
        System.out.println("Resultado recibido.");
        din.close();

        return resultadoRecibido;
    }
}
