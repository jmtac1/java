package banco.projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {
    static void main() {
        Scanner leitor = new Scanner(System.in);
        Double saldo = (double) 0;
        List<Conta> contas = new ArrayList<>();

        while (true) {
            System.out.println("""
                    escolha a opração:\s
                    1: criar conta
                    2: sair
                    """);
            int criar = leitor.nextInt();
            if (criar == 1) {
                Conta conta1 = new Conta();
                while (true) {
                    System.out.println("""
                    escolha a operação:\s
                    1: ver saldo
                    2: depositar
                    3: sacar
                    4: status da conta
                    5: sair""");
                    int operacao = leitor.nextInt();
                    if (operacao == 1) {
                        conta1.verSaldo();
                    }
                    else if (operacao == 2) {
                        System.out.println("faça seu deposito: ");
                        Double valor = leitor.nextDouble();
                        conta1.depositar(valor);
                        saldo = valor;
                    }
                    else if (operacao == 3) {
                        System.out.println("faça seu saque: ");
                        Double valor = leitor.nextDouble();
                        if (saldo - valor < 0) {
                            System.out.println("saldo insuficiente");
                        }
                        else {
                            System.out.println("saque efetuado");
                            conta1.sacar(valor);
                        }
                    }
                    else if (operacao == 4) {
                        conta1.verStatus();
                    }
                    else if (operacao == 5) {
                        break;
                    }
                    else {
                        System.out.println("operação invalida");
                    }
                }
                contas.add(conta1);
                conta1 = new Conta(null, 0, null);
            } else if (criar == 2) {
                break;
            }
            else {
                System.out.println("operação invalida");
            }

        }
        for (Conta conta : contas) {
            conta.verStatus();
            conta.verSaldo();
        }
        System.out.println(contas.toString());

    }
}
