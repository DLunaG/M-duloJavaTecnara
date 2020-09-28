package dia17.informaciónMeteorológicaJson.client;

import dia17.informaciónMeteorológicaJson.client.utils.Utils;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float coordX;
        float coordY;
        System.out.println("Bienvenido, escribe las coordenadas de un punto y le daremos el parte meteorológico.");

        do {
            System.out.println("Introduzca la longitud (De -180 a 180): ");
            coordX = sc.nextFloat();
        }while(!Utils.coordinateChecker(coordX, 180));

        do {
            System.out.println("Introduzca la latitud (De -90 a 90): ");
            coordY = sc.nextFloat();
        }while(!Utils.coordinateChecker(coordY,90));

        String coordinates = "{\"lon\":" + coordX + ", \"lat\":" + coordY + "}";


        try{
            Socket s = new Socket("localhost", 3333);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF(coordinates);
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String result = dis.readUTF();
            System.out.println(result);

            dis.close();
            dout.close();
            s.close();

        }catch(IOException e){
            System.out.println("IOException: " + e.toString());
        }
    }

}
