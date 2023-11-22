package Concurrency.Semaphores.PrintInOrder;

import java.util.concurrent.Semaphore;

public class Foo {

    Semaphore first;
    Semaphore second;
    Semaphore third;
    public Foo() {

        this.first = new Semaphore(1);
        this.second = new Semaphore(0);
        this.third = new Semaphore(0);
    }

    public void first(Runnable printFirst) throws InterruptedException {
        first.acquire();
        printFirst.run();
        second.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        second.acquire();
        printSecond.run();
        third.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        third.acquire();
        printThird.run();
        first.release();
    }
}