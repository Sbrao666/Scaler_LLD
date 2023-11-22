package Concurrency.Semaphores;

public class PrintBar implements Runnable{
    @Override
    public void run() {
        System.out.print("bar");
    }
}
