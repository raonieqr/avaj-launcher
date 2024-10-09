package main.java.com.avajlauncher.contracts;

import main.java.com.avajlauncher.domain.WeatherTower;

public interface Flyable {

    public abstract void updateConditions();

    public void registerTower(WeatherTower p_tower);
}