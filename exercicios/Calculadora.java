import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("digite a operação: 1, 2, 3 ou 4");
        int operacao = leitor.nextInt();
        while ((operacao != 1) && (operacao != 2) && (operacao != 3) && (operacao != 4)){
            System.out.println("opção ínvalida");
            System.out.println("digite a operação: 1, 2, 3 ou 4");
            operacao = leitor.nextInt();
        }
        System.out.println("digite o primeiro numero:");
        double x = leitor.nextDouble();
        System.out.println("digite o segundo numero:");
        double y = leitor.nextDouble();

        if (operacao == 1) {
            somar(x, y);
        }
        else if (operacao == 2) {
            subtrair(x, y);
        }
        else if (operacao == 3) {
            dividir(x, y);
        }
        else if (operacao == 4){
            multiplicar(x, y);
        }

    }
    static void somar(double n1, double n2) {
        System.out.println(n1 + n2);
    }
    static void subtrair(double n1, double n2) {
        System.out.println(n1 - n2);
    }
    static void dividir(double n1, double n2) {
        System.out.println(n1 / n2);
    }
    static void multiplicar(double n1, double n2) {
        System.out.println(n1 * n2);
    }
}