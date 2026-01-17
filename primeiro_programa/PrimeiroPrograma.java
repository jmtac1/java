import java.util.Scanner;
import primeiro_programa.Visibilidade;

public class PrimeiroPrograma{

    public static void main(String[] args) {
        // função de imprimir na tela com java:
        System.out.println("Olá Mundo!");

        // input em java:
        Scanner leitor = new Scanner(System.in);
        String nome = leitor.nextLine();

        // Principais tipos primitivos em java:
        int numero = 1;
        double numero_fracionado = 10.5;
        boolean falso_verdadeiro = true;
        byte b = 'a'; // armazena dados até 1 byte
        char c = 'ç'; // representa qualquer caracter do teclado
        short s = 222; // igual o int só que usa menos espaço na memória
        long l = 412312123123131321L; // igual ao int só que usa mais espaço na memória
        float f = 2.2f; // igual ao double só que usa menos espaço na memória

        // Também posso declarar uma variável e só depois atribuir valor a ela:
        String sobrenome; // string não é um tipo primitivo é um objeto
        sobrenome = "manoel";

        // Versões mais novas do java não é preciso declarar o tipo da variável:
        var qualquer_tipo = "qualquer tipo de dado";

        // para declarar uma variável imutável é preciso usar a palavra privada "final":
        final Double Pi = 3.141;

        System.out.println(nome);
        System.out.println(sobrenome);
        System.out.println(numero);
        System.out.println(numero_fracionado);
        System.out.println(falso_verdadeiro);
        System.out.println(qualquer_tipo);
    }
}