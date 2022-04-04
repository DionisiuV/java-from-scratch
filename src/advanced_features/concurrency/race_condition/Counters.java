package advanced_features.concurrency.race_condition;

public class Counters {
    public static void main(String[] args) {
        Math math = new Math();
        new Thread(math).start();
        new Thread(math).start();
        new Thread(math).start();
    }
}

class Math implements Runnable {
    int counter = 0;

    public void increment() {
        //Delay 10 millis
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        counter++;
    }

    public void decrement() {
        counter--;
    }

    @Override
    public synchronized void run() {
        String threadName = Thread.currentThread().getName();

        increment();
        System.out.println(threadName + " incremented the counter to: " + counter);

        decrement();
        System.out.println(threadName + " decremented the counter to: " + counter);
    }
}