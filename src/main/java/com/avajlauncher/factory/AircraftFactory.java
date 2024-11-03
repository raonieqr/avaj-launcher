package com.avajlauncher.factory;

import java.util.ArrayList;
import java.util.List;

import com.avajlauncher.contracts.Flyable;
import com.avajlauncher.domain.*;

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

  public List<Flyable> buildAircraftFleet(List<String[]> aircraftData) {
    List<Flyable> aircraftList = new ArrayList<>();

    aircraftData.forEach(line -> {
      for (String type : line) {

        Flyable aircraft = AircraftFactory.newAircraft();

        aircraftList.add(aircraft);
      }
    });

    return aircraftList;
  }
}
