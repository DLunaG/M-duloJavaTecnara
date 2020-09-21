package dia14.flujoDeDatos;


import java.util.List;

public class OrdenDescargas {

    List<Descarga> listaDescargas;

    public OrdenDescargas(List<Descarga> listaDescargas){
        this.listaDescargas = listaDescargas;
    }

    public String resultadosOrdenacionTiempoDeDescarga(){
        ComparadorTiempoDescarga ctd = new ComparadorTiempoDescarga();
        listaDescargas.sort(ctd);
        StringBuilder sb = new StringBuilder("\033[0;1m>Lista de portales ordenado por tiempo de descarga<\n\033[0;0m");
        int posicion = 1;
        for(Descarga descarga: listaDescargas){
            if(descarga.isTiempoExcedido()){
                sb.append("\u001B[31m-TIEMPO RECOMENDADO EXCEDIDO- \u001B[30m ");
            }
            sb.append("Posición ").append(posicion).append(": portal ").append(descarga.getNombrePortal()).append(" con ")
                    .append(descarga.getTiempoDeDescarga()).append(" milisegungos de descarga.\n");
            posicion++;
        }
        return sb.toString();
    }
}
