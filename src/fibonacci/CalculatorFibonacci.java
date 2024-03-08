package fibonacci;

import java.util.ArrayList;

public class CalculatorFibonacci {

    public static ArrayList<Integer> calcularFibonacci(int n) {
        ArrayList<Integer> fibonacciSequence = new ArrayList<>();
        fibonacciSequence.add(0);
        fibonacciSequence.add(1);

        while (fibonacciSequence.get(fibonacciSequence.size() - 1) <= n) {
            int nextValue = fibonacciSequence.get(fibonacciSequence.size() - 1) +
                            fibonacciSequence.get(fibonacciSequence.size() - 2);
            fibonacciSequence.add(nextValue);
        }
        return fibonacciSequence;
    }
}
