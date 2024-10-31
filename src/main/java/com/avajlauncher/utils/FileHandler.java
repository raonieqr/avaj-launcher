package main.java.com.avajlauncher.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public abstract class FileHandler {

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
        List<String> allLines =  new ArrayList<>();
        while((currentLine = bufferedReader.readLine()) != null) {
            allLines.add(currentLine);
        }

        return allLines;
    }

//    void validateFile(List<String> fileContent) {
//        fileContent.forEach(it -> it.split(" "));
//        if (obj.size() < 5 && index != 0)
//            throw new InputMismatchException("Error: invalid param");
//    }
}
