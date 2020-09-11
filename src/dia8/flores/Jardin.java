package dia8.flores;

import java.util.ArrayList;

public class Jardin {
    private int numDeGardenias = 0;
    private int numDeGeranios = 0;
    private int numDeVioletas = 0;
    private ArrayList<Flor> listaDeFlores = new ArrayList<>();

    public void añadirFlor(Flor flor){
        listaDeFlores.add(flor);
        System.out.println("Flor añadida.");
        if (flor instanceof Gardenia){
            numDeGardenias++;
        }
        if (flor instanceof  Geranio){
            numDeGeranios++;
        }
        if (flor instanceof Violeta){
            numDeVioletas++;
        }

    }

    public void eliminarFlor(Flor flor){
        if (listaDeFlores.contains(flor)) {
            listaDeFlores.remove(flor);
            System.out.println("Se ha eliminado la flor.");
        }else{
            System.out.println("No encuentro esta flor en el jardín.");
        }
    }

    public void regarFlores(){
        for (Flor flor : listaDeFlores){
            flor.regar();
        }
    }

    public void regarFlor(Flor flor){
        flor.regar();
    }

    public void verFlorecer(){
        for (Flor flor : listaDeFlores){
            flor.florecer();
        }

    }

    public void verGardeniasSoltarPolen(){
        for (Flor flor : listaDeFlores){
            if (flor instanceof Gardenia){
                ((Gardenia) flor).soltarPolen();
            }
        }
    }

    public void verVioletasSoltarAbejas(){
        for (Flor flor : listaDeFlores){
            if (flor instanceof  Violeta){
                ((Violeta) flor).soltarAbejas();
            }
        }
    }

    public int getNumDeGardenias() {
        return numDeGardenias;
    }

    public int getNumDeGeranios() {
        return numDeGeranios;
    }

    public int getNumDeVioletas() {
        return numDeVioletas;
    }

    public ArrayList<Flor> getListaDeFlores() {
        return listaDeFlores;
    }
}
