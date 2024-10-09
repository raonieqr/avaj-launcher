package main.java.com.avajlauncher.factory;

import main.java.com.avajlauncher.contracts.Flyable;
import main.java.com.avajlauncher.domain.*;

public class AircraftFactory {
    private Long id = 0L;


    private Long generateId() {
        return this.id++;
    }

    public Flyable newAircraft(String p_type, String p_name, Coordinates p_coordinates) {
        switch (p_type.toLowerCase()) {
            case "baloon":
                return new Baloon(generateId(), p_name, p_coordinates);
            case "helicopter":
                return new Helicopter(generateId(), p_name, p_coordinates);
            case "jetplane":
                return new JetPlane(generateId(), p_name, p_coordinates);
            default:
                throw new IllegalArgumentException("Unknown aircraft type: " + p_type);
        }
    }
}