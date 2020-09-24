package dia16.socketsYDescargas.servidor;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.WriteAbortedException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.HashMap;

public class Downloader {

    private HashMap<String, String> webs;

    public Downloader(){
        webs = new HashMap<>();
        webs.put("kernel", "https://www.learningcontainer.com/wp-content/uploads/2020/05/sample-mp4-file.mp4");
        webs.put("osuosl", "http://ftp.osuosl.org/pub/ubuntu/pool/main/m/mysql-5.7/mysql-server-5.7_5.7.31-0ubuntu0.16.04.1_amd64.deb");
        webs.put("za", "http://za.archive.ubuntu.com/ubuntu/pool/main/m/mysql-5.7/mysql-server-5.7_5.7.31-0ubuntu0.16.04.1_amd64.deb");
    }

    public void performDownload(DataOutputStream dos, String webKey){
        ReadableByteChannel readableByteChannel;
        {
            try {
               /* readableByteChannel = Channels.newChannel(new URL(webs.get(webKey)).openStream());
                FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\tecnara\\IdeaProjects\\ModuloJavaTecnara\\src\\dia16\\socketsYDescargas\\servidor\\" + webKey + ".deb");
                FileChannel fileChannel = fileOutputStream.getChannel();
                fileChannel.transferFrom(readableByteChannel, 0, Long.MAX_VALUE);
                System.out.println("Archivo descargado en el servidor.");*/

                URLConnection conn = new URL("https://www.learningcontainer.com/wp-content/uploads/2020/05/sample-mp4-file.mp4").openConnection();
                conn.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/25.0");

                readableByteChannel = Channels.newChannel(conn.getInputStream());
                WritableByteChannel writableByteChannel = Channels.newChannel(dos); //Mis 2 canales
                ByteBuffer byteBuffer = ByteBuffer.allocate(1024); //Mi cubo de agua (.allocate indica la capacidad del cubo)

                while(readableByteChannel.read(byteBuffer) > -1){
                    byteBuffer.flip(); //pila lifo del tipo saco, hay que darle la vuelta con .flip()
                    writableByteChannel.write(byteBuffer);
                    byteBuffer.clear(); //Hay que limpiar el buffer para la siguiente tacada, q no se limpia solo.
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public HashMap<String, String> getWebs() {
        return webs;
    }
}
