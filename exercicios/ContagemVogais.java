package exercicios;

import java.util.Scanner;

public class ContagemVogais {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String frase = leitor.nextLine();
        String letra;
        int cont = 0;
        for (int i = 0; i < frase.length(); i++) {
            letra = String.valueOf(frase.charAt(i));
            if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
                cont ++;
            }
        }
        System.out.println(cont);
    }
}
