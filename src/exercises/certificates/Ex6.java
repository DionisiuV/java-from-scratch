package exercises.certificates;

import java.io.Closeable;
import java.io.IOException;

//1. Is it possible to create a new object of type PDFReader inside the try-with-resources? If yes, why?
//2. Does the code compile? If yes, why?
public class Ex6 {
    public static void main(String[] args) {
        //try (PDFReader pdf = new PDFReader()) {}
    }
}

class PDFReader implements Closeable {
    public void readLine() {}

    @Override
    public void close() throws IOException {
        throw new IOException();
    }
}
//Timi: Yes. No.
//Rafa: Yes. Yes.
//Razvan: Yes. Yes.
//Gabriel: Yes. Yes.
//Valentin: Yes. Yes.