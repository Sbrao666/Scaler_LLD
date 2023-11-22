package Concurrency.Semaphores.PrintZeroEvenOdd;

import java.util.concurrent.Semaphore;

public class ZeroEvenOdd {
    private int n;
    Semaphore zero;
    Semaphore even;
    Semaphore odd;

    public ZeroEvenOdd(int n) {
        this.n = n;
        zero = new Semaphore(1);
        even = new Semaphore(0);
        odd =  new Semaphore(0);
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        for(int i =1; i<=n; i++){
            zero.acquire();
            printNumber.accept(0);// 0 is to print 0 numbers after every even and odd numbers

            if(i%2 ==0){
                even.release();// if even number index will relase for even
            }
            else{
                odd.release(); //if odd number index will relase for odd
            }
        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        for(int i =2; i<=n ; i+=2){ // here we are doing +=2 because every 0 and odd number after will print even
            even.acquire();
            printNumber.accept(i);
            zero.release();
        }
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        for(int i =1; i<=n; i+=2){ // here we are doing +=2 because every 0 and even number after will print odd
            odd.acquire();
            printNumber.accept(i);
            zero.release();
        }
    }
}

class IntConsumer {
    void accept(int x) {
        System.out.println(x);
    }
}
