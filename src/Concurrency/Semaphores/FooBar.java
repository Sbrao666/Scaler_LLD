package Concurrency.Semaphores;

import java.util.concurrent.Semaphore;

public class FooBar {
    private Semaphore semaphoreFoo = new Semaphore(1);
    private Semaphore semaphoreBar = new Semaphore(0);
    private int n;

    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            semaphoreFoo.acquire();
            printFoo.run();
            semaphoreBar.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            semaphoreBar.acquire();
            printBar.run();
            semaphoreFoo.release();
        }
    }


}