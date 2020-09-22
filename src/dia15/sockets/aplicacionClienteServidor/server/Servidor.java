package dia15.sockets.aplicacionClienteServidor.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

    public static void main(String[] args) throws IOException {
        Checker checker = new Checker();

        ServerSocket ss = new ServerSocket(3333);
        System.out.println("Escuchando peticiones...");
        Socket s = ss.accept();
        System.out.println("Petición escuchada.");
        DataInputStream din = new DataInputStream(s.getInputStream());
        String cadenaRecibida = din.readUTF();
        String resultado = checker.checkear(cadenaRecibida);
        Servidor.enviarResultadoACliente(s, resultado);
        din.close();


    }

    private static void enviarResultadoACliente(Socket s, String resultado) throws IOException {
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        dout.writeUTF(resultado);
        System.out.println("Resultado enviado.");
        dout.close();
    }
}
