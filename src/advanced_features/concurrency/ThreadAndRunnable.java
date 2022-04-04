package advanced_features.concurrency;

public class ThreadAndRunnable {
    public static void main(String[] args) {
        Runnable runnable = new Connection();
        Thread connectionThread = new Thread(runnable);
        connectionThread.start();
    }
}

class Connection implements Runnable {
    @Override
    public void run() {
        System.out.println("Connecting...");
        try {
            Thread.sleep(3_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("You are now connected.");
    }
}