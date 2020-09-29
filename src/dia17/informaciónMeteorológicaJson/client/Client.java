package dia17.informaciónMeteorológicaJson.client;

import dia17.informaciónMeteorológicaJson.client.utils.Utils;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;


public class Client {
    Socket s;
    DataOutputStream dout;
    DataInputStream dis;

    public Client() {
        try {
            s = new Socket("localhost", 3333);
            dout = new DataOutputStream(this.s.getOutputStream());
            dis = new DataInputStream(this.s.getInputStream());
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
        public String inputCoordinates(){
            return Utils.getInputCoordinates();
        }

        public void sendCoordinates(String inputCoordinates){
            try {
                System.out.println(inputCoordinates);
                dout.writeUTF(inputCoordinates);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public String recieveResponse() {
            try {
                String result = this.dis.readUTF();
                return result;
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

        public void closeConection() {
            try {
                if (dis != null) {
                    dis.close();
                }
                if (dout != null) {
                    dout.close();
                }
                if (s != null) {
                    s.close();
                }
            } catch (IOException e) {
                System.out.println(e.toString());
            }
        }








}
