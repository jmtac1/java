package exercicios;

public class Carro extends Veiculo{
    private final int Portas;

    public Carro(String marca, String modelo, int velocidadeeMaxima, int portas) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeeMaxima;
        this.Portas = portas;
    }

    @Override
    public void exibirInformacoes() {
        System.out.printf("marca: %s, modelo: %s, velocidade máxima: %s km/h, %s portas", marca, modelo, velocidadeMaxima, Portas);
    }
}
