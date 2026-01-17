package primeiro_programa;

import java.util.Scanner;

public class ComparandoStrings {
    public static void main(String[] args) {
        String senha = "1234";
        Scanner leitor = new Scanner(System.in);
        System.out.println("digite a senha: ");
        String usuario = leitor.nextLine();
        // usamos o metodo .equals() para comparar as strings:
        System.out.println(senha.equals(usuario)); // true

        // usar == não funciona pois este operador compara não o conteudo das variaveis e sim o espaço de memoria indicado por elas:
        System.out.println(senha == usuario); // false
    }
}
