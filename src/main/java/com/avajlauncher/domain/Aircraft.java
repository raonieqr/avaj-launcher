package com.avajlauncher.domain;

import com.avajlauncher.contracts.Flyable;

public class Aircraft implements Flyable {
    protected Long id;
    protected String name;
    protected Coordinates coordinates;
    protected String type;

    protected Aircraft(Long id, String name, Coordinates coordinate) {
        this.id = id;
        this.name = name;
        this.coordinates = coordinate;
        this.type = "Aircraft";
    }

    public String getName() {
      return type + "#" + name + "(" + id + ")";
    }

    @Override
    public void updateConditions() {

    }

    @Override
    public void registerTower(WeatherTower p_tower) {

    }
}
