package dia17.informaciónMeteorológicaJson.client;

public class Main {

    public static void main(String[] args) {

        Client client = new Client();
        Client client2 = new Client();
        Client client3 = new Client();
        client.sendCoordinates(client.inputCoordinates());
        client2.sendCoordinates(client.inputCoordinates());
        client3.sendCoordinates(client.inputCoordinates());
        System.out.println("Esperando respuesta cliente 1:");
        System.out.println(client.recieveResponse());
        System.out.println("Esperando respuesta cliente 2:");
        System.out.println(client2.recieveResponse());
        System.out.println("Esperando respuesta cliente 3:");
        System.out.println(client3.recieveResponse());

        client.closeConection();
    }
}
