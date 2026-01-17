package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class MediaTurma {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Float> notas = new ArrayList<>();
        String continuar;
        float soma = 0;
        int cont = 0;
        do {
            float nota = leitor.nextFloat();
            notas.add(nota);
            cont++;
            leitor.nextLine();
            System.out.println("continuar [s/n]");
            continuar = leitor.nextLine();
        } while (!continuar.equals("n"));
        for (float nota : notas) {
            soma += nota;
        }
        System.out.println(soma / cont);
        if (soma / cont >= 7) {
            System.out.println("aprovado");
        } else if (soma / cont >= 5) {
            System.out.println("recuperação");
        } else if (soma / cont < 5) {
            System.out.println("reprovado");
        }
    }
}
