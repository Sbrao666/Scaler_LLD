package LLD1.Concurrency.Concurrency1.AdditionUsingThread;

public class Adder implements Runnable{

    int firstNumber;
    int secondNumber;

    public Adder(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    @Override
    public void run() {
        System.out.println(this.firstNumber + this.secondNumber);
    }
}
