package main.java.com.avajlauncher.factory;

import main.java.com.avajlauncher.contracts.Flyable;
import main.java.com.avajlauncher.domain.Aircraft;
import main.java.com.avajlauncher.domain.Coordinates;

public class AircraftFactory {

    public Flyable newAircraft(String p_type, String p_name, Coordinates p_coordinates) {
        return new Aircraft();
    }
}