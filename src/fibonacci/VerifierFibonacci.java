package fibonacci;

import java.util.ArrayList;

public class VerifierFibonacci {

    public static boolean verificaPertenceFibonacci(int numero, ArrayList<Integer> fibonacciSequence) {
        return fibonacciSequence.contains(numero);
    }
}
