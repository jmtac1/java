package exercicios;

public class Veiculo {
    protected String marca;
    protected String modelo;
    protected int velocidadeMaxima;

    public void exibirInformacoes() {
        System.out.printf("marca: %s, modelo: %s, velocidade máxima: %d%n", marca, modelo, velocidadeMaxima);
    }
}