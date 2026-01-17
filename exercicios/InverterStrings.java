package exercicios;

import java.util.Scanner;

public class InverterStrings {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String palavra = leitor.nextLine();
        String invertido = "";

        for (int i = palavra.length() - 1; i >= 0; i--) {
            invertido += palavra.charAt(i);
        }
        System.out.println(invertido);
    }
}
