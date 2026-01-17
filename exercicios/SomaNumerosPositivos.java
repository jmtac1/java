package exercicios;

import java.util.Scanner;

public class SomaNumerosPositivos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int soma = 0;

        while (true) {
            int numero = leitor.nextInt();
            if (numero < 0) {
                break;
            }
            else {
                soma += numero;
            }
        }
        System.out.println(soma);
    }
}
