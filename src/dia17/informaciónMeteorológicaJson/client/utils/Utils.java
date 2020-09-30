package dia17.informaciónMeteorológicaJson.client.utils;

import java.util.Scanner;

public class Utils {

    public static String getInputCoordinates(){
        System.out.println("Bienvenido, escribe las coordenadas de un punto y le daremos el parte meteorológico.");
        float coordX = Utils.askingCoordinates(Utils.Coordinate.LONGITUDE);
        float coordY = Utils.askingCoordinates(Utils.Coordinate.LATITUDE);
        return "{\"lon\":" + coordX + ", \"lat\":" + coordY + "}";
    }

    private enum Coordinate{
        LONGITUDE, LATITUDE
    }

    public static float askingCoordinates(Coordinate coordinateType){
        Scanner sc = new Scanner(System.in);

        float coord = -1f;
        int coordinateRank = -1;
        String coordinateName = "error";
        if(coordinateType == Coordinate.LONGITUDE) {
            coordinateRank = 180;
            coordinateName = "longitud";
        }
        if(coordinateType == Coordinate.LATITUDE){
                coordinateRank = 90;
                coordinateName = "latitud";
        }
        do {
            System.out.println("Introduzca la " + coordinateName + " (De -" + coordinateRank +" a " + coordinateRank + ")");
            coord = sc.nextFloat();
        }while(!Utils.coordinateChecker(coord, coordinateRank));
        return coord;
    }

    private static boolean coordinateChecker(float coordinate, int range) {
        if (coordinate >= -range && coordinate <= range) {
            return true;
        } else {
            System.out.println("Coordenada no válida.");
            return false;
        }
    }

    public static float parseKelvinToCelsius(float kelvinDegrees){
        float celsius = kelvinDegrees - 273.15f;
        int celsiusInteger = (int)(celsius * 100);
        return (float)celsiusInteger/100;
    }
}
