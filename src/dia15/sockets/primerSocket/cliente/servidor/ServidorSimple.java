package dia15.sockets.primerSocket.cliente.servidor;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorSimple {
    public static void main(String args[]) throws Exception {
        ServerSocket ss = new ServerSocket(3333);
        System.out.println("Escuchando peticiones...");
        Socket s = ss.accept();
        System.out.println("Petición escuchada.");
        DataInputStream din = new DataInputStream(s.getInputStream());
        String str = din.readUTF();
        System.out.println("client says: " + str);
        din.close();
        s.close();
        ss.close();
    }
}
