package dk.kea;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileHandler {

    public static String readFile(String str) {
        File file = new File(str);
        StringBuilder result = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            int i = 0;
            while ((i = bufferedReader.read()) != -1) {
                result.append((char) i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result.toString();
    }
}

