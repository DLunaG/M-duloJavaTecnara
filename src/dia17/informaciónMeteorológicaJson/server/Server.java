package dia17.informaciónMeteorológicaJson.server;

import dia17.informaciónMeteorológicaJson.server.domain.Coordinates;
import dia17.informaciónMeteorológicaJson.server.domain.openweathermapInfo.OpenweathermapResponse;
import dia17.informaciónMeteorológicaJson.server.services.meteo.OpenweathermapService;
import dia17.informaciónMeteorológicaJson.server.utils.Utils;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(3333);
            System.out.println("Listening to requests...");
            Socket s = ss.accept();
            System.out.println("Request heard.");
            DataInputStream din = new DataInputStream(s.getInputStream());
            String coordinates = din.readUTF();
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());


            if(checkFormat(coordinates)){
                Coordinates coor = Utils.parseCoordinates(coordinates);
                OpenweathermapService oc = new OpenweathermapService();
                OpenweathermapResponse openInfo = oc.getCurrentMeteo(coor);
                dos.writeUTF(openInfo.toMessageInJson());

            }else{
                dos.writeUTF("El formato de coordenadas es incorrecto.");
            }


        }catch(IOException e){
            System.out.println("IOException: " + e.toString());
        }
    }

    public static boolean checkFormat(String coordinates) {
        String regExp = "\\{\"lon\":-?\\d{1,3}.\\d{0,2}, \"lat\":-?\\d{1,2}.\\d{0,2}}";
        Matcher matcher = Pattern.compile(regExp).matcher(coordinates);
        return matcher.matches();
    }

}
