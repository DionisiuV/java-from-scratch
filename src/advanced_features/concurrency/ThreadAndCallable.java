package advanced_features.concurrency;

import java.util.concurrent.*;

public class ThreadAndCallable {
    public static void main(String[] args) {
        Callable<String> authentication = new Auth();
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> future = executor.submit(authentication);
        try {
            String message = future.get();
            System.out.println(message);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        executor.shutdown();
    }
}

class Auth implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("Authenticating...");
        try {
            Thread.sleep(3_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "You are now authenticated.";
    }
}