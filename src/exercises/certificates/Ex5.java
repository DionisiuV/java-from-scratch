package exercises.certificates;

import java.io.*;

//What kind of Exception can be created inside catch block?
public class Ex5 {
    public static void main(String[] args) throws IOException {
        try (
                InputStream fis = new FileInputStream("workers.txt");
                OutputStream fos = new FileOutputStream("employees.txt");
        ) {
            byte[] buf = new byte[8192];
            int i;

            while ((i = fis.read(buf)) != -1) {
                fos.write(buf, 0, i);
            }
        } catch (FileNotFoundException | IndexOutOfBoundsException e) {
            //e = new ???Exception();
        }
    }
}
//Timi: new FileNotFoundException().
//Rafa: new FileNotFoundException().
//Razvan: new FileNotFoundException(), new IndexOutOfBoundsException().
//Gabriel: new FileNotFoundException().
//Valentin: new FileNotFoundException().