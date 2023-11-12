package Callables.Problem2_ArrayCreator;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int n = new Scanner(System.in).nextInt();
        ArrayCreator arrayCreator = new ArrayCreator(n);
        ExecutorService executorService = Executors.newCachedThreadPool();
        ArrayList<Integer> list = executorService.submit(arrayCreator).get();
        System.out.println(list);
        executorService.shutdown();
    }
}
