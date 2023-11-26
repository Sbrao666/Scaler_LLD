package LLD1.Concurrency.Concurrency3_MutexAndSynchronized;

public class Client {
    public static void main(String[] args) {
        Counter counter = new Counter(10);

        counter.getValue();

        counter.incValue(100);
        counter.getValue();
        counter.incValue(150);
        counter.getValue();
        counter.decValue(250);


    }
}
