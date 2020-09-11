package dia8.flores;

public class Main {

    public static void main(String[] args) {

        Jardin jardin = new Jardin();
        Gardenia gardenia1 = new Gardenia();
        Gardenia gardenia2 = new Gardenia();
        Gardenia gardenia3 = new Gardenia();
        Geranio geranio1 = new Geranio();
        Geranio geranio2 = new Geranio();
        Violeta violeta1 = new Violeta();
        Violeta violeta2 = new Violeta();
        Violeta violeta3 = new Violeta();

        jardin.añadirFlor(gardenia1);
        jardin.añadirFlor(gardenia2);
        jardin.añadirFlor(gardenia3);
        jardin.añadirFlor(geranio1);
        jardin.añadirFlor(geranio2);
        jardin.añadirFlor(violeta1);
        jardin.añadirFlor(violeta2);
        jardin.añadirFlor(violeta3);

        jardin.regarFlor(gardenia1);
        jardin.regarFlores();
        jardin.verFlorecer();
        jardin.verGardeniasSoltarPolen();
        jardin.verVioletasSoltarAbejas();
        jardin.eliminarFlor(violeta1);
        jardin.verVioletasSoltarAbejas();
        System.out.println("Número de gardenias: " + jardin.getNumDeGardenias() + ".");
    }
}
