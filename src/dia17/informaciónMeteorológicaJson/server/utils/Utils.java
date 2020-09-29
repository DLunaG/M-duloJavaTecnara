package dia17.informaciónMeteorológicaJson.server.utils;

import com.google.gson.Gson;
import dia17.informaciónMeteorológicaJson.server.domain.Coordinates;
import dia17.informaciónMeteorológicaJson.server.domain.openweathermapInfo.OpenweathermapResponse;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
    public static Coordinates parseCoordinates(String coordinates){
        Gson gson = new Gson();
        Coordinates coor = gson.fromJson(coordinates, Coordinates.class);

    return coor;
    }

    public static boolean checkFormat(String coordinates) {
        String regExp = "\\{\"lon\":-?\\d{1,3}.\\d{0,6}, \"lat\":-?\\d{1,2}.\\d{0,6}}";
        Matcher matcher = Pattern.compile(regExp).matcher(coordinates);
        return matcher.matches();
    }
}
