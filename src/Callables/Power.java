package Callables;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class Power implements Callable<Integer> {

    int number;
    int power;

    public Power(int number, int power) {
        this.number = number;
        this.power = power;
    }

    @Override
    public Integer call() throws Exception {
        return powerOfNumber();
    }

    private Integer powerOfNumber() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        return (int) Math.pow(number, power);
    }
}
