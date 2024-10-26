package com.avajlauncher;

import com.avajlauncher.domain.Baloon;
import com.avajlauncher.domain.Coordinates;
import com.avajlauncher.domain.Helicopter;
import com.avajlauncher.factory.AircraftFactory;

public class Main {
    public static void main(String[] args) {
        AircraftFactory aircraftFactory = new AircraftFactory();
        Baloon baloon = (Baloon) aircraftFactory.newAircraft("baloon", "b1",
                new Coordinates(1, 2, 3));
        Helicopter helicopter = (Helicopter) aircraftFactory.newAircraft("helicopter", "h1",
                new Coordinates(1, 2, 3));
        Baloon baloon2 = (Baloon) aircraftFactory.newAircraft("baloon", "b2",
                new Coordinates(1, 2, 3));
        System.out.println(baloon.toString());
        System.out.println(helicopter.toString());
        System.out.println(baloon2.toString());
    }
}
