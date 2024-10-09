package main.java.com.avajlauncher.domain;

public class WeatherProvider {
    private String[] weather;
    private static WeatherProvider instance;

    private WeatherProvider() {
    }

    public static WeatherProvider getInstance() {
        if (instance == null) {
            instance = new WeatherProvider();
        }
        return instance;
    }

    public String getCurrentWeather(Coordinates p_coordinates) {
        return "";
    }

}