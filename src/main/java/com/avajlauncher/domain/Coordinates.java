package com.avajlauncher.domain;

import com.avajlauncher.exceptions.InvalidHeightException;
import com.avajlauncher.exceptions.NegativeCoordinateException;

public class Coordinates {
    private int longitude;
    private int latitude;
    private int height;

    public Coordinates(int longitude, int latitude, int height) {
        if (longitude < 0 || latitude < 0)
            throw new NegativeCoordinateException("Error: coordinates cannot be negative");

        if (height < 0) {
          throw new InvalidHeightException("Error: height cannot be negative");
        }

        this.longitude = longitude;
        this.latitude = latitude;
        this.height = adjustHeight(height);
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

    public int adjustHeight(int height) {
      if (height == 0)
        return 0;

      if (height > 100)
        return 100;

      return height;
    }

}
