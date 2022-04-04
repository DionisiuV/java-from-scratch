package advanced_features.concurrency;

public class Concurrency {
    public static void main(String[] args) throws InterruptedException {
        //System.out.println("Let's pause the main thread for three seconds.");
        //Thread.sleep(3_000);
        //System.out.println("We're back.");

        //There is no guarantee which one stars first.
        CountdownTimer timerOne = new CountdownTimer("timerOne");
        CountdownTimer timerTwo = new CountdownTimer("timerTwo");

        timerOne.start();
        timerTwo.start();
    }
}

class CountdownTimer extends Thread {
    String threadName;

    public CountdownTimer(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 5; i >= 0; i--) {
            try {
                Thread.sleep(1_000);
                System.out.println(threadName + ": " + i);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}