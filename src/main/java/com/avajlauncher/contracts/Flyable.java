package com.avajlauncher.contracts;

import com.avajlauncher.domain.WeatherTower;

public interface Flyable {

    public abstract void updateConditions();
    public abstract String getName();
    public void registerTower(WeatherTower p_tower);
}
