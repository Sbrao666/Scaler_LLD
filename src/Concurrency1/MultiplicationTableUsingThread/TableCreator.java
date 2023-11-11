package Concurrency1.MultiplicationTableUsingThread;

public class TableCreator implements Runnable {
    int n;
    int i;

    public TableCreator(int n, int i) {
        this.n = n;
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(n + " times " + i + " is " + n * i);
    }
}
