package exercicios;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Aluno {
    private String nome;
    private ArrayList<Float> notas = new ArrayList<>();
    private float soma;
    private int cont;

    public void addNotas() {
        Scanner leitor = new Scanner(System.in);
        String continuar;
        do {
            float nota = leitor.nextFloat();
            notas.add(nota);
            cont++;
            leitor.nextLine();
            System.out.println("continuar [s/n]");
            continuar = leitor.nextLine();
        } while (!continuar.equals("n"));
    }

    public void Situacao () {
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
