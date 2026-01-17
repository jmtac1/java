package exercicios;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero = leitor.nextInt();
        if (numero <= 1) {
            System.out.println(numero + " não é um numero primo");
        } else {
            boolean isPrime = true;
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(numero + " é um numero primo");
            } else {
                System.out.println(numero + " não é um numero primo");
            }
        }
    }
}