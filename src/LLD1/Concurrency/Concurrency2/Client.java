package LLD1.Concurrency.Concurrency2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {

//        Fixed sized thread pool.  --> Fixed sized thread pool will be created
//        ExecutorService executorService = Executors.newFixedThreadPool(10);
//
//        for (int i = 0; i <= 100; i++) {
//            NumberPrinter np = new NumberPrinter(i);
//            executorService.submit(np);
//        }

//        Cached Thread pool. --> Executors service will create new thread if there is no thread is vacant for upcoming task.
//                                if thread is vacant then executors service use vacant threads

        ExecutorService executorService  =  Executors.newCachedThreadPool();
        for (int i = 0; i <= 100; i++) {
            NumberPrinter np = new NumberPrinter(i);
            executorService.submit(np);
        }

        executorService.shutdown();

    }
}
