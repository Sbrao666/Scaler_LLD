package LLD1.Concurrency.Concurrency1.MultiplicationTableUsingThread;

import LLD1.Concurrency.Concurrency1.ScalerThread;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        for (int i = 1; i <= 10; i++) {
            ScalerThread scalerThread = new ScalerThread(new TableCreator(n, i));
            scalerThread.start();
        }
    }
}
