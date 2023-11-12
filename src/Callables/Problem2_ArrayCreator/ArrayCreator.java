package Callables.Problem2_ArrayCreator;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public class ArrayCreator implements Callable<ArrayList<Integer>> {

    int size;

    public ArrayCreator(int size) {
        this.size = size;
    }

    @Override
    public ArrayList<Integer> call() throws Exception {
        ArrayList<Integer> arrayList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) arrayList.add(i + 1);
        return arrayList;
    }
}
