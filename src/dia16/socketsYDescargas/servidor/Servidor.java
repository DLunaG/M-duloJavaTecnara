package dia16.socketsYDescargas.servidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

    public static void main(String args[]) throws Exception {
        ServerSocket ss = new ServerSocket(3333);
        System.out.println("Escuchando peticiones...");
        Socket s = ss.accept();
        System.out.println("Petición escuchada.");
        DataInputStream din = new DataInputStream(s.getInputStream());
        String str = din.readUTF();
        System.out.println("client says: " + str);

        DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        Downloader downloader = new Downloader();
        downloader.performDownload(dos, str);



        //FileInputStream fis=new FileInputStream("C:\\Users\\tecnara\\IdeaProjects\\ModuloJavaTecnara\\src\\dia16\\socketsYDescargas\\servidor\\" + str + ".deb");

       // dos.write(fis.read());
        //System.out.println("Archivo enviado a cliente.");


        din.close();
        s.close();
        ss.close();
    }

    public void init(){

    }
}
