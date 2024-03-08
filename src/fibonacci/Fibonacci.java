package fibonacci;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Número a ser verificado na sequência de Fibonacci
        System.out.print("Informe um número para verificar na sequência de Fibonacci: ");
        int numeroInformado = scanner.nextInt();

        // Calcula a sequência de Fibonacci até o número informado
        ArrayList<Integer> sequenciaFibonacci = CalculatorFibonacci.calcularFibonacci(numeroInformado);

        // Verifica se o número informado pertence à sequência de Fibonacci
        if (VerifierFibonacci.verificaPertenceFibonacci(numeroInformado, sequenciaFibonacci)) {
            System.out.println(numeroInformado + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numeroInformado + " não pertence à sequência de Fibonacci.");
        }
    }
}
