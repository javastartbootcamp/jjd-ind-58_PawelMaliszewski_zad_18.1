package pl.javastart.euler2;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class Euler2 {

    public long returnFibSumForEvenNumbers(long maxFibValue) {
        boolean stop = false;
        long sum = 0;
        long count = 1;
        do {
            long number = fibNumberByQueue(count);
            if (number % 2 == 0) {
                if (number <= maxFibValue) {
                    sum += number;
                } else {
                    stop = true;
                }
            }
            count++;
        } while (!stop);
        return sum;
    }

    private long fibNumberByQueue(long fibNumber) { // co sądzicie o takiej metodzie do obliczenia fib ????
        Queue<Long> fibQueue = new LinkedList<>();
        fibQueue.add(0L);
        fibQueue.add(1L);
        for (long i = 0; i < fibNumber; i++) {
            fibQueue.add(Objects.requireNonNull(fibQueue.poll()) + Objects.requireNonNull(fibQueue.peek()));
        }
        return Objects.requireNonNull(fibQueue.peek());
    }

//    public long fibRecursion(long number) {
//        if (number == 0) {
//            return 0;
//        } else if (number == 1) {
//            return 1;
//        } else {
//            return fibRecursion(number - 1) + fibRecursion(number - 2);
//        }
//    }
}
