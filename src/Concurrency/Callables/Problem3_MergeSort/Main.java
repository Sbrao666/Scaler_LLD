package Concurrency.Callables.Problem3_MergeSort;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws Exception {
        int[] A = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9};

//        int[] sortedA = new MergeSort(A).call(); // without executors


//        ExecutorService executorService = Executors.newFixedThreadPool(4);  // program get blocked in middle because of fixed sized thread pool
        ExecutorService executorService = Executors.newCachedThreadPool();  // so we fixed this by replacing with the cachedThreadPool
        int[] sortedA = executorService.submit(new MergeSort(A, executorService)).get();

        System.out.println(Arrays.toString(sortedA));

        executorService.shutdown();

    }
}


/*
Note :
1. In case fixedThreadPool the problems like recursion won't work,
    since it blocks all the threads
2. It is always better to use cachedThreadPool and it also gives the
    better performance in terms of execution
 */