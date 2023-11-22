package Concurrency.Semaphores;

public class PrintFoo implements Runnable {

    @Override
    public void run() {
        System.out.print("foo");
    }
}
