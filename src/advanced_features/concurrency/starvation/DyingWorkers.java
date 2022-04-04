package advanced_features.concurrency.starvation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DyingWorkers {
    public static void main(String[] args) {
        Worker worker = new Worker();

        for(int i = 0; i < 10; i++) {
            new Thread(worker::work).start();
        }
    }
}

class Worker {
    public synchronized void work() {
        Path path = Paths.get("workers.txt");
        String threadName = Thread.currentThread().getName();

        try {
            Files.writeString(path, threadName + " wrote to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (true) {
            System.out.println(threadName + " is working");
        }
    }
}