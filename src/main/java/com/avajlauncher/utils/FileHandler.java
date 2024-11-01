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

    public static void validateFile(List<String> fileContent) {
        IntStream.range(0, fileContent.size()).forEach(idx -> {
            List<String> splitLine = List.of(fileContent.get(idx).split(" "));

            if ((splitLine.size() != 5) && idx != 0 || idx == 0 && splitLine.size() > 1) {
                throw new InputMismatchException();
            }
        });
    }

}
