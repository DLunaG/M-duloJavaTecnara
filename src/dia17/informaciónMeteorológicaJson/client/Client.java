package dia17.informaciónMeteorológicaJson.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido, escribe las coordenadas de un punto y le daremos el parte meteorológico.");
        System.out.println("Introduzca la coordenada X: ");
        float coordX = sc.nextFloat();
        System.out.println("Introduzca la coordenada Y: ");
        float coordY = sc.nextFloat();
        String coordinates = "{\"lon\":" + coordX + ", \"lat\":" + coordY + "}";


        try{
            Socket s = new Socket("localhost", 3333);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF(coordinates);
            DataInputStream dis = new DataInputStream(s.getInputStream());
            System.out.println(dis.readUTF());
        }catch(IOException e){
            System.out.println("IOException: " + e.toString());
        }
    }

}
