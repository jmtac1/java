package exercicios;

import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        while (true) {
            System.out.println("digite sua senha: ");
            String senha = leitor.nextLine();
            if ((senha.length() < 8) || (!isMaiusculo(senha)) || (!isNumero(senha))) {
                System.out.println("senha inválida");
            } else {
                System.out.println("senha válida");
                break;
            }
        }
    }

    static boolean isMaiusculo(String palavra) {
        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            if (Character.isUpperCase(letra)) {
                return true;
                }
            }
        return false;
    }
    static boolean isNumero(String palavra) {
        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            if (Character.isDigit(letra)) {
                return true;
            }
        }
        return false;
    }
}