package main.java.com.avajlauncher.domain;

import main.java.com.avajlauncher.contracts.Flyable;

public class Aircraft implements Flyable {
    protected Long id;
    protected String name;
    protected Coordinates coordinates;

    protected Aircraft(Long id, String name, Coordinates coordinate) {
        this.id = id;
        this.name = name;
        this.coordinates = coordinate;
    }

    @Override
    public void updateConditions() {

    }

    @Override
    public void registerTower(WeatherTower p_tower) {

    }
}