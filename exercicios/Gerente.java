package exercicios;

public class Gerente extends Funcionario {

    private final double bonus;

    public Gerente(String nome, double salario, double bonus) {
        this.nome = nome;
        this.salario = salario;
        this.bonus = bonus;
    }

    @Override
    public double getSalario() {
        return salario + bonus;
    }
}
