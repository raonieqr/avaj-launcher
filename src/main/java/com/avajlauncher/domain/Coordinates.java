package main.java.com.avajlauncher.domain;

import main.java.com.avajlauncher.exceptions.InvalidHeightException;
import main.java.com.avajlauncher.exceptions.NegativeCoordinateException;

public class Coordinates {
    private int longitude;
    private int latitude;
    private int height;

    public Coordinates(int longitude, int latitude, int height) {
        if (longitude < 0 || latitude < 0)
            throw new NegativeCoordinateException("Coordinates cannot be negative");

        if (height < 0 || height > 100)
            throw new InvalidHeightException("The height must be in the 0-100 range");

        this.longitude = longitude;
        this.latitude = latitude;
        this.height = height;
    }

    public int getLongitude() {
        return longitude;
    }

    public int getLatitude() {
        return latitude;
    }

    public int getHeight() {
        return height;
    }

}