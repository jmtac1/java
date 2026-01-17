package exercicios;

public class Contrato implements Imprimivel{
    private String nome;
    private double valor;

    public Contrato(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }
    @Override
    public void imprimir() {
        System.out.println("=== CONTRATO ===");
        System.out.println("Cliente: " + nome);
        System.out.println("Valor: R$ " + valor);
        System.out.println();
    }
}
