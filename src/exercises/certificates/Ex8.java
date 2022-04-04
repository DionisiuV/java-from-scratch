package exercises.certificates;

//What is the output at L1 and L2?
public class Ex8 {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.execute();
    }
}

interface Readable {
    void read();

    static void close() {
        System.out.println("Close");
    }
}

interface Writable extends Readable {
    default void write() {
        read();
        System.out.println("Welcome");
    }
}

class Canvas implements Writable {
    @Override
    public void read() {
        System.out.println("Hello");
    }

    void execute() {
        Writable canvas = new Canvas();
        //canvas.write(); //L1
        //Writable.close(); //L2
    }
}
//Timi: L1 -> Hello Welcome L2 -> Compilation Error.
//Rafa: L1 -> Hello Welcome L2 -> close
//Razvan: L1 -> Hello Welcome L2 -> close
//Gabriel: L1 -> Hello Welcome L2 -> close
//Valentin: L1 -> Hello Welcome L2 -> close