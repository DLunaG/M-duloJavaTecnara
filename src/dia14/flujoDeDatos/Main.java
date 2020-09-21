package dia14.flujoDeDatos;

import java.util.ArrayList;
import java.util.List;

public class Main {

    //mysql-server-5.7_5.7.31-0ubuntu0.16.04.1_amd64.deb

    //http://mirrors.kernel.org/ubuntu/pool/main/m/mysql-5.7/mysql-server-5.7_5.7.31-0ubuntu0.16.04.1_amd64.deb
    //http://ftp.osuosl.org/pub/ubuntu/pool/main/m/mysql-5.7/mysql-server-5.7_5.7.31-0ubuntu0.16.04.1_amd64.deb
    //http://za.archive.ubuntu.com/ubuntu/pool/main/m/mysql-5.7/mysql-server-5.7_5.7.31-0ubuntu0.16.04.1_amd64.deb

    //ordenar de menor a mayor tiempo de descarga

    //y si alguna, pasa un umbral establecido, mostraremos un aviso de tiempo recomendado excedido

    //ReadableByteChannel readableByteChannel = Channels.newChannel(new URL(this.fileUrl).openStream());

    //FileOutputStream fileOutputStream = new FileOutputStream(this.fileName);

    //FileChannel fileChannel = fileOutputStream.getChannel();
    //fileChannel.transferFrom(readableByteChannel, 0, Long.MAX_VALUE);

    public static void main(String[] args) {

        Descarga descargaKernel = new Descarga("http://mirrors.kernel.org/ubuntu/pool/main/m/mysql-5.7/mysql-server-5.7_5.7.31-0ubuntu0.16.04.1_amd64.deb", "pruebaDescargaKernel.deb", "Kernel");
        Descarga descargaOsuosl = new Descarga("http://ftp.osuosl.org/pub/ubuntu/pool/main/m/mysql-5.7/mysql-server-5.7_5.7.31-0ubuntu0.16.04.1_amd64.deb", "pruebaDescargaOsuosl.deb", "Osuosl");
        Descarga descargaZa = new Descarga("http://za.archive.ubuntu.com/ubuntu/pool/main/m/mysql-5.7/mysql-server-5.7_5.7.31-0ubuntu0.16.04.1_amd64.deb", "pruebaDescargaZa.deb", "Za.archive");

        List<Descarga> listaDescargas = new ArrayList<>();
        listaDescargas.add(descargaKernel);
        listaDescargas.add(descargaOsuosl);
        listaDescargas.add(descargaZa);

        OrdenDescargas ordenDescargas = new OrdenDescargas(listaDescargas);
        System.out.println(ordenDescargas.resultadosOrdenacionTiempoDeDescarga());
    }

}
