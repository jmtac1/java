package exercicios;

public class Vendedor extends Funcionario{

    private final double comissao;

    public Vendedor(String nome, double salario, double comissao) {
        this.nome = nome;
        this.salario = salario;
        this.comissao = comissao;
    }

    @Override
    public double getSalario() {
        return salario + comissao;
    }
}

