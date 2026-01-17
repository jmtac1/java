package exercicios;

import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] numeros = new int[10];
        int min = 1;
        int max = 1;

        for (int i = 0; i < numeros.length; i++) {
            int numero = leitor.nextInt();
            if (numero <= min) {
                min = numero;
            }
            if (numero >= max) {
                max = numero;
            }
            numeros[i] = numero;
        }
        System.out.println(min);
        System.out.println(max);
    }
}
