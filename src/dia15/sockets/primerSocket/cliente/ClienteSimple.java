package dia15.sockets.primerSocket.cliente;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

class ClienteSimple {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce por pantalla lo que se te venga:");
        String fraseCliente = sc.nextLine();

        Socket s = new Socket("localhost", 3333);
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        dout.writeUTF(fraseCliente);
        dout.close();
        s.close();
    }
}

