package Concurrency.Callables;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Power power = new Power(10, 3);
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future<Integer> powerOfNumner = executorService.submit(power);
        System.out.println("Getting power from power class");
        System.out.println(powerOfNumner.get());
        System.out.println("I am printed after power has been calculated");
    }
}
