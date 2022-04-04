package exercises.certificates;

import java.nio.file.Path;
import java.nio.file.Paths;

//Can we normalize a path? If yes, what's the output?
public class Ex2 {
    public static void main(String[] args) {
        Path path1 = Paths.get("D:\\sales\\.\\quarterly\\..\\report");
        System.out.println(path1.normalize());
    }
}
//Timi: D:\sales\report
//Rafa: X
//Razvan: D:\sales\report
//Gabriel: D:\sales\report
//Valentin: D:\sales\report