package com.avajlauncher.domain;

public class WeatherProvider {
  private String[] weather = { "RAIN", "FOG", "SUN", "SNOW" };
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
    int longitude = p_coordinates.getLongitude();
    int latitude = p_coordinates.getLatitude();
    int height = p_coordinates.getHeight();

    int idx = Math.abs((longitude * 31 + latitude * 17 + height * 13) % 14);

    switch (idx) {
      case 0:
        return weather[2];
      case 1:
        return weather[0];
      case 2:
        return weather[1];
      case 3:
        return weather[3];
      default:
        return weather[2];
    }
  }

}
