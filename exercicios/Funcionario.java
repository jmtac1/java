package exercicios;

public abstract class Funcionario {

    protected String nome;
    protected double salario;

    public void aumentarSalario(double percentual) {
        double aumento = (percentual * salario / 100);
        salario += aumento;
    }

    public abstract double getSalario();

    public String getNome() {
        return nome;
    }
}
