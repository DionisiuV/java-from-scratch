package advanced_features.input_output;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFile {
    public static void main(String[] args) {
        //Relative path.
        //Path path = Paths.get("planets.txt");
        Path path = Paths.get("src/advanced_features/input_output/planets.txt");
        //Absolute path.
        //Path path = Paths.get("D:\\Dropbox\\Projects\\Java\\MCA\\JavaFromScratch2\\src\\advanced_features\\input_output\\planets.txt");

        try {
            Files.createFile(path); //Creates an empty file.
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}