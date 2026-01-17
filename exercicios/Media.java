package exercicios;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float n1 = leitor.nextFloat();
        float n2 = leitor.nextFloat();
        float n3 = leitor.nextFloat();
        float soma = n1 + n2 + n3;

        System.out.println(soma / 3);
        if (soma / 3 >= 7) {
            System.out.println("aprovado");
        } else if (soma / 3 >= 5) {
            System.out.println("recuperação");
        } else if (soma / 3 < 5) {
            System.out.println("reprovado");
        }
    }
}
