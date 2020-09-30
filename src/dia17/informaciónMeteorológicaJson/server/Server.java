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

public class Server {
    private ServerSocket ss;
    private Socket s;
    private DataInputStream din;
    private DataOutputStream dos;

    public Server() {
        try {
            this.ss = new ServerSocket(3333);

        } catch (IOException e) {
            System.out.println("IOException: " + e.toString());
        }
    }

    public String recieveCoordinates(){
        try {
            System.out.println("Listening to requests...");
            this.s = ss.accept();
            this.din = new DataInputStream(this.s.getInputStream());
            String coordinates = this.din.readUTF();
            System.out.println("Request heard.");
            return coordinates;
        }catch(IOException e){
            System.out.println(e.toString());
        }
        return null;
    }

    public String getInfoOfOpenweathermapWithCoordinates(String coordinates) {
        if (Utils.checkFormat(coordinates)) {
            Coordinates coor = Utils.parseCoordinates(coordinates);
            OpenweathermapService oc = new OpenweathermapService();
            oc.start();
            try {
                oc.join();
            }catch(InterruptedException ie){
                System.out.println(ie.getMessage());
            }
            OpenweathermapResponse openInfo = oc.getCurrentMeteo(coor);
            return openInfo.toMessageInJson();
        } else {
            return "El formato de coordenadas es incorrecto.";
        }
    }

    public void sendOpenweathermapInfoToClient(String info) {
        try {
            this.dos = new DataOutputStream(this.s.getOutputStream());
            this.dos.writeUTF(info);
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    public void close() {
        try {
            if (ss != null) {
                ss.close();
            }
            if (s != null) {
                Socket s;
            }
            if (din != null) {
                din.close();
            }
            if (dos != null) {
                dos.close();
            }
            System.out.println("Server has been shut down.");
        }catch(IOException e){
            System.out.println(e.toString());
        }

    }
}
