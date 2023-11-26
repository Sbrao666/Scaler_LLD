package LLD1.Concurrency.Callables.Problem3_MergeSort;

import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public class MergeSort implements Callable<int[]> {

    int[] A;
    ExecutorService executorService;

    public MergeSort(int[] A, ExecutorService executorService) {
        this.A = A;
        this.executorService = executorService;
    }

    @Override
    public int[] call() throws Exception {
        int n = A.length;
        if (n == 1) return this.A;
        int mid = n / 2;
        int[] leftArray = Arrays.copyOfRange(A, 0, mid);
        int[] rightArray = Arrays.copyOfRange(A, mid, n);

//        int[] sortedLeft = new MergeSort(leftArray).call();
//        int[] sortedRight = new MergeSort(rightArray).call();

        int[] sortedLeft = executorService.submit(new MergeSort(leftArray, executorService)).get();
        int[] sortedRight = executorService.submit(new MergeSort(rightArray, executorService)).get();

        int[] sortedArray = new int[sortedRight.length + sortedLeft.length];
        int j = 0;
        int i = 0;
        int k = 0;

        while (i < sortedLeft.length && j < sortedRight.length) {
            if (sortedLeft[i] <= sortedRight[j]) {
                sortedArray[k++] = sortedLeft[i++];
            } else {
                sortedArray[k++] = sortedRight[j++];
            }
        }

        while (i < sortedLeft.length) {
            sortedArray[k++] = sortedLeft[i++];
        }

        while (j < sortedRight.length) {
            sortedArray[k++] = sortedRight[j++];
        }

        return sortedArray;
    }
}
