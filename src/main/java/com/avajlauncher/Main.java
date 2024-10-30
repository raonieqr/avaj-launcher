package com.avajlauncher;

import com.avajlauncher.domain.Baloon;
import com.avajlauncher.domain.Coordinates;
import com.avajlauncher.domain.Helicopter;
import com.avajlauncher.factory.AircraftFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        try {
            //TODO: improve of text validations and create class for handle file
            if (args.length == 0) {
                System.err.println("Error: file path not provided.");
                return;
            }

            File file = new File(args[0]);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

            String line = "";
            int index = 0;
            while((line = bufferedReader.readLine()) != null) {
                List<String> obj = List.of(line.split(" "));
                if (obj.size() < 5 && index != 0)
                    throw new InputMismatchException("Error: invalid param");
                System.out.println(line);
                index++;
            }
        }
        catch (FileNotFoundException e) {
            System.err.println("Error: file not found.");
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
