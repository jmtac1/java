package exercicios;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero = leitor.nextInt();
        int total = 1;
        for (int i = 1; i < numero + 1; i++) {
            total *= i;
        }
        System.out.println(total);
    }
}
