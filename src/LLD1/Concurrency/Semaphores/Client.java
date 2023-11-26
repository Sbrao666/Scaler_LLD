package LLD1.Concurrency.Semaphores;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        int n = new Scanner(System.in).nextInt();
        FooBar fooBar = new FooBar(n);
 
        fooBar.bar(new PrintBar());
        fooBar.foo(new PrintFoo());


    }
}
