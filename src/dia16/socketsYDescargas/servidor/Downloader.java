package dia16.socketsYDescargas.servidor;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.WriteAbortedException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.HashMap;

public class Downloader {

    private HashMap<String, String> webs;

    public Downloader(){
        webs = new HashMap<>();
        webs.put("kernel", "http://mirrors.kernel.org/ubuntu/pool/main/m/mysql-5.7/mysql-server-5.7_5.7.31-0ubuntu0.16.04.1_amd64.deb");
        webs.put("osuosl", "http://ftp.osuosl.org/pub/ubuntu/pool/main/m/mysql-5.7/mysql-server-5.7_5.7.31-0ubuntu0.16.04.1_amd64.deb");
        webs.put("za", "http://za.archive.ubuntu.com/ubuntu/pool/main/m/mysql-5.7/mysql-server-5.7_5.7.31-0ubuntu0.16.04.1_amd64.deb");
    }

    public void performDownload(DataOutputStream dos, String webKey){
        ReadableByteChannel readableByteChannel;
        {
            try {
                readableByteChannel = Channels.newChannel(new URL(webs.get(webKey)).openStream());
                FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\tecnara\\IdeaProjects\\ModuloJavaTecnara\\src\\dia16\\socketsYDescargas\\servidor\\" + webKey + ".deb");
                FileChannel fileChannel = fileOutputStream.getChannel();
                fileChannel.transferFrom(readableByteChannel, 0, Long.MAX_VALUE);
                System.out.println("Archivo descargado en el servidor.");

                WritableByteChannel writableByteChannel = Channels.newChannel(dos);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    public HashMap<String, String> getWebs() {
        return webs;
    }
}
