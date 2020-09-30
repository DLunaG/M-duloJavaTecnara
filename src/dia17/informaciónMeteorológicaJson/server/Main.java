package dia17.informaciónMeteorológicaJson.server;

public class Main {


    public static void main(String[] args) {
        Server server = new Server();

        while (true) {
            String openweatherInfo = server.getInfoOfOpenweathermapWithCoordinates(server.recieveCoordinates());
            server.sendOpenweathermapInfoToClient(openweatherInfo);
        }

        //server.close();
    }
}
