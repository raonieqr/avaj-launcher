package com.avajlauncher;

import com.avajlauncher.domain.Baloon;
import com.avajlauncher.domain.Coordinates;
import com.avajlauncher.domain.Helicopter;
import com.avajlauncher.factory.AircraftFactory;
import main.java.com.avajlauncher.utils.FileHandler;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try {
            //TODO: improve of text validations and create class for handle file
            if (args.length == 0) {
                System.err.println("Error: file path not provided.");
                return;
            }

            System.out.println(FileHandler.readFile(args[0]));
        }
        catch (FileNotFoundException e) {
            System.err.println("Error: file not found.");
        }
        catch (IOException e) {
            System.err.println("Error: when reading the file." );
        }
        catch (Exception e) {
            System.err.println("error");
        }

        AircraftFactory aircraftFactory = new AircraftFactory();
        Baloon baloon = (Baloon) aircraftFactory.newAircraft("baloon", "b1",
                new Coordinates(1, 2, 3));
        Helicopter helicopter = (Helicopter) aircraftFactory.newAircraft("helicopter", "h1",
                new Coordinates(1, 2, 3));
        Baloon baloon2 = (Baloon) aircraftFactory.newAircraft("baloon", "b2",
                new Coordinates(1, 2, 3));
    }
}
