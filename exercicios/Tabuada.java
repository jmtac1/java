package exercicios;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero = leitor.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(numero * i);
        }
    }
}
