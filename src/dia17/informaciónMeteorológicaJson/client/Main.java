package dia17.informaciónMeteorológicaJson.client;

public class Main {

    public static void main(String[] args) {

        Client client = new Client();
        client.sendCoordinates(client.inputCoordinates());
        System.out.println(client.recieveResponse());
        client.closeConection();
    }
}
