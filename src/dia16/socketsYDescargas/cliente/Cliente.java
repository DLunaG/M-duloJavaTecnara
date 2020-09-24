package dia16.socketsYDescargas.cliente;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
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
        FileOutputStream fos = new FileOutputStream("C:\\Users\\tecnara\\IdeaProjects\\ModuloJavaTecnara\\src\\dia16\\socketsYDescargas\\cliente\\" + fraseCliente + ".mp4");
        //fos.write(dis.read());

        try {
            ReadableByteChannel readableByteChannel = Channels.newChannel(dis);
            WritableByteChannel writableByteChannel = Channels.newChannel(fos);
            ByteBuffer bb = ByteBuffer.allocate(1024);

            while(readableByteChannel.read(bb) > -1){
                bb.flip();
                writableByteChannel.write(bb);
                bb.clear();
            }

        }catch(IOException e){

        }
        dout.close();
        s.close();

    }
}
