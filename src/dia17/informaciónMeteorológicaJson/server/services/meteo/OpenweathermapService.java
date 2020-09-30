package dia17.informaciónMeteorológicaJson.server.services.meteo;

//El servidor va a estar escuchando coordenadas y cuando le llegue un par de coordenadas válido
// ( si no, responderá con un mensaje de error), devolverá la información de fecha/hora,
// temperatura, si es de día o no y la velocidad del viento.


import com.google.gson.Gson;
import dia17.informaciónMeteorológicaJson.server.domain.Coordinates;
import dia17.informaciónMeteorológicaJson.server.domain.openweathermapInfo.OpenweathermapResponse;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class OpenweathermapService extends Thread {


    @Override
    public void start(){
        try {
            Thread.sleep(10000);
        }catch (InterruptedException ie){
            System.out.println(ie.getMessage());
        }
    }

    public OpenweathermapResponse getCurrentMeteo(Coordinates coor) {

        String urlApi = "http://api.openweathermap.org/data/2.5/weather?lat=" + coor.getLat() + "&lon=" + coor.getLon() + "&appid=3e2d658a45d141292b9ac778c8b2dc32";

        try {
            URL url = new URL(urlApi);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            //BufferedReader = lector de buffers
            BufferedReader bufferReader = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            //StringBuffer funciona igual que el StringBuilder (pero hay un no sé que de incompatibilidades
            //con según que métodos de uso. Posiblemente en temas de .net y .io sea mejor utilizar
            //StringBuffers
            StringBuffer content = new StringBuffer();
            while ((inputLine = bufferReader.readLine()) != null) {
                content.append(inputLine);
            }
            bufferReader.close();
            String jsonContent = content.toString();
            Gson gson = new Gson();
            OpenweathermapResponse openInfo = gson.fromJson(jsonContent, OpenweathermapResponse.class);
            return openInfo;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }
}
