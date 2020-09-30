package dia17.informaciónMeteorológicaJson.server.domain.openweathermapInfo;

////El servidor va a estar escuchando coordenadas y cuando le llegue un par de coordenadas válido
//// ( si no, responderá con un mensaje de error), devolverá la información de fecha/hora,
//// temperatura, si es de día o no y la velocidad del viento.

import dia17.informaciónMeteorológicaJson.client.utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class OpenweathermapResponse {

    private String name;
    private List<Weather> weather;
    private Wind wind;
    private Main main;
    private Sys sys;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeatherList(List<Weather> weatherList) {
        this.weather = weatherList;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    @Override
    public String toString() {
        return "OpenweathermapResponse{" +
                "name='" + name + '\'' +
                ", weather=" + weather +
                ", wind=" + wind +
                ", main=" + main +
                '}';
    }

    public String toMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append("Location: ");
        sb.append(this.getName()).append("\",\n\"Country:\":\"").append(this.getSys().getCountry());
        sb.append("\nMain weather: ").append((this.getWeather().get(0).getMain()));
        sb.append(", ").append(this.getWeather().get(0).getDescription());
        sb.append("\nTemperature: ").append(Utils.parseKelvinToCelsius(this.getMain().getTemp()-273.15f));
        sb.append("\nHumidity: ").append(this.getMain().getHumidity());
        sb.append("\nWind speed: ").append(this.getWind().getSpeed());
        return sb.toString();
    }

    public String toMessageInJson() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n\"Location\":\"");
        sb.append(this.getName()).append("\",\n\"Country:\":\"").append(this.getSys().getCountry());
        sb.append("\",\n\"Main weather\":\"").append((this.getWeather().get(0).getMain()));
        sb.append(", ").append(this.getWeather().get(0).getDescription());
        sb.append("\",\n\"Temperature\":").append(Utils.parseKelvinToCelsius(this.getMain().getTemp()));
        sb.append(",\n\"Humidity\":").append(this.getMain().getHumidity());
        sb.append(",\n\"Wind speed\":").append(this.getWind().getSpeed()).append("\n}");
        return sb.toString();
    }


}

