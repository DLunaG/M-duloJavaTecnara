package dia16.socketsYDescargas.cliente;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce por pantalla el portal del que desea descargar el archivo. (kernel, osuosl, za):");
        String fraseCliente = sc.nextLine();

        Socket s = new Socket("localhost", 3333);
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        dout.writeUTF(fraseCliente);

        DataInputStream dis = new DataInputStream(s.getInputStream());
        FileOutputStream fos = new FileOutputStream("C:\\Users\\tecnara\\IdeaProjects\\ModuloJavaTecnara\\src\\dia16\\socketsYDescargas\\cliente\\" + fraseCliente + ".deb");
        fos.write(dis.read());


        dout.close();
        s.close();

    }
}
