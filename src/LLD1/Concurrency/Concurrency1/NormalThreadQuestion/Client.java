package LLD1.Concurrency.Concurrency1.NormalThreadQuestion;

import LLD1.Concurrency.Concurrency1.ScalerThread;

public class Client {
    public static void main(String[] args) {
        System.out.println("I am the main class");
        ScalerThread scalerThread = new ScalerThread(new Adder());
        scalerThread.start();
        ScalerThread scalerThread1 = new ScalerThread(new Subtractor());
        scalerThread1.start();

    }
}
