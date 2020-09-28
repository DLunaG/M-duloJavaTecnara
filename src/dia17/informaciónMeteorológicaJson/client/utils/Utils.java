package dia17.informaciónMeteorológicaJson.client.utils;

public class Utils {

    public static boolean coordinateChecker(float coordinate, int range) {
        if (coordinate >= -range && coordinate <= range) {
            return true;
        } else {
            System.out.println("Coordenada no válida.");
            return false;
        }
    }

    public static String parseJsonToBeauty(String json){

        return "";
    }
}
