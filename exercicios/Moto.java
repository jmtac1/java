package exercicios;

public class Moto extends Veiculo{
    private final int cilindradas;

    public Moto(String marca, String modelo, int velocidadeeMaxima, int cilindradas) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeeMaxima;
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirInformacoes() {
        System.out.printf("marca: %s, modelo: %s, velocidade máxima: %s km/h, %s cilindradas", marca, modelo, velocidadeMaxima, cilindradas);
    }
}

