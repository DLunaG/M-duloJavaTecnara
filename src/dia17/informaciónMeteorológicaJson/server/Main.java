package dia17.informaciónMeteorológicaJson.server;

public class Main {
    public static void main(String[] args) {
        Server server = new Server();
        String openweatherInfo = server.getInfoOfOpenweathermap(server.recieveCoordinates());
        server.sendOpenweathermapInfo(openweatherInfo);
        server.close();
    }
}
