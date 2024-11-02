package main.java.com.avajlauncher.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.stream.IntStream;

public final class FileHandler {

    private FileHandler() {}

    public static List<String> readFile(String filePath) throws Exception {
        if (filePath == null || filePath.isEmpty()) {
            throw new IllegalArgumentException();
        }

        File file = new File(filePath);
        if (!file.exists()) {
            throw new FileNotFoundException();
        }

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        String currentLine = "";
        List<String> allLines = new ArrayList<>();
        while ((currentLine = bufferedReader.readLine()) != null) {
            allLines.add(currentLine);
        }

        return allLines;
    }

    public static List<String[]> validateFile(List<String> fileContent) {
    List<String[]> allLinesSplited = new ArrayList<>();

    IntStream.range(0, fileContent.size()).forEach(idx -> {
        String[] splitLine = fileContent.get(idx).split(" ");
        
        
        if ((splitLine.length != 5 && idx != 0) || (idx == 0 && splitLine.length > 1)) {
            throw new InputMismatchException();
        }

        allLinesSplited.add(splitLine);
    });

    return allLinesSplited;

}


}
