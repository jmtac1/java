package banco.projeto;

import java.util.Scanner;

public class Conta {
    private String agencia;
    private int conta;
    private String usuario;
    private Double saldo = (double) 0;

    Scanner leitor = new Scanner(System.in);

    public Conta(String agencia, int conta, String usuario) {
        this.agencia = agencia;
        this.conta = conta;
        this.usuario = usuario;
    }
    public Conta() {
        System.out.println("usuario: ");
        String usuario = leitor.nextLine();
        setUsuario(usuario);
        configurarConta();
    }

    public void configurarConta() {
        System.out.println("agencia: ");
        String agencia = leitor.nextLine();
        setAgencia(agencia);
        System.out.println("conta: ");
        int conta = leitor.nextInt();
        setConta(conta);
    }
    public void depositar(Double quantia) {
        saldo += quantia;
    }
    public void sacar(Double saque) {
        saldo = saldo - saque;
    }
    public void verSaldo() {
        System.out.println(saldo);
    }
    public void verStatus() {
        System.out.println(agencia);
        System.out.println(conta);
        System.out.println(usuario);
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public void setConta(int conta) {
        this.conta = conta;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
