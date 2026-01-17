package exercicios;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero = leitor.nextInt();
        if (numero % 2 == 0) {
            System.out.println("numero par");
        } else {
            System.out.println("numero impar");
        }
    }
}
