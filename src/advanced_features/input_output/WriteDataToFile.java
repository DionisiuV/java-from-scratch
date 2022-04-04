package advanced_features.input_output;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class WriteDataToFile {
    static Path path = Paths.get("src/advanced_features/input_output/planets.txt");
    static List<String> planets = Arrays.asList("Moon", "Mars", "Jupiter");
    static List<String> newPlanets = Arrays.asList("Pluto", "Saturn");

    public static void main(String[] args) {
        //writePlanetsToFile();
        //readPlanetsToFile();
        writeNewPlanetsToFile();
        readPlanetsToFile();
    }

    //There is no need to explicitly create a new file.
    //When it called the first time, it creates a new and adds the data.
    //When it's called the second time, it overrides the existing data. Be careful!!!!!
    private static void writePlanetsToFile() {
        try {
            Files.write(path, planets);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    //The file should exist in order to append data.
    //Each time is called, it appends the data to the existing data in the file.
    private static void writeNewPlanetsToFile() {
        try {
            Files.write(path, newPlanets, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void readPlanetsToFile() {
        try {
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}