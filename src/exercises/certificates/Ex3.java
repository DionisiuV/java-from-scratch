package exercises.certificates;

import java.util.concurrent.*;

//What's the output?
public class Ex3 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService es = Executors.newFixedThreadPool(1);
        Future<Boolean> read = es.submit(new Read());
        Future<Boolean> write = es.submit(new Write());
        if (write.get()) {
            read.cancel(true);
        }
        System.out.println(read.isCancelled());
        System.out.println(read.isDone());
        es.shutdown();
    }
}

class Read implements Callable<Boolean> {
    @Override
    public Boolean call() throws Exception {
        return true;
    }
}

class Write implements Callable<Boolean> {
    @Override
    public Boolean call() throws Exception {
        return true;
    }
}
//Timi: false true
//Rafa: (false true) true true
//Razvan: true true
//Gabriel: true false
//Valentin: true false