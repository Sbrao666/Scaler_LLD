package Concurrency1.NormalThreadQuestion;

public class Subtractor implements Runnable{

    @Override
    public void run() {
        System.out.println("I am the Subtractor class");
    }
}
