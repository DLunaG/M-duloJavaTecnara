package dia17.informaciónMeteorológicaJson.server.utils;

import com.google.gson.Gson;
import dia17.informaciónMeteorológicaJson.server.domain.Coordinates;
import dia17.informaciónMeteorológicaJson.server.domain.openweathermapInfo.OpenweathermapResponse;

public class Utils {
    public static Coordinates parseCoordinates(String coordinates){
        Gson gson = new Gson();
        Coordinates coor = gson.fromJson(coordinates, Coordinates.class);

    return coor;
    }

}
