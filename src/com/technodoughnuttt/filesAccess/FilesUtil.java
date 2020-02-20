package com.technodoughnuttt.filesAccess;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FilesUtil {

    public static List<String> ReadFileLineByLineUsingFiles(String filePath) {
        try {
            List<String> allLines = Files.readAllLines(Paths.get(filePath));
            return allLines;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<String> ReadFileLineByLineUsingBufferedReader(String filePath) {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line = reader.readLine();
            List<String> lines = new ArrayList<>();
            while (line != null) {
                line = reader.readLine();
                lines.add(line);
            }
            reader.close();
            return lines;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void writeToFile(String fileContent, String filepath) throws IOException
    {
        FileOutputStream outputStream = new FileOutputStream(filepath);
        byte[] strToBytes = fileContent.getBytes();
        outputStream.write(strToBytes);
        outputStream.close();
    }

    public static void appendToFile(String fileContent, String filepath) throws IOException
    {
        FileOutputStream outputStream = new FileOutputStream(filepath, true);
        byte[] strToBytes = fileContent.getBytes();
        outputStream.write(strToBytes);
        outputStream.close();
    }

}
