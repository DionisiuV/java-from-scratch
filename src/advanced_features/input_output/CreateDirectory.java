package advanced_features.input_output;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateDirectory {
    public static void main(String[] args) {
        //Relative Path.
        //Path lib = Paths.get("lib"); //Don't delete it as we'll need it later.
        Path exercises = Paths.get("src/advanced_features/input_output/exercises"); //Don't delete it as we'll need it later.
        try {
            Files.createDirectory(exercises);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}