package Concurrency1.AdditionUsingThread;

import Concurrency1.ScalerThread;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        ScalerThread scalerThread = new ScalerThread(new Adder(firstNumber, secondNumber));
        scalerThread.start();
    }
}
