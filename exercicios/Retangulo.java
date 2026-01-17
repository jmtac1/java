package exercicios;

public class Retangulo extends FormaGeometrica{

    private final double largura;
    private final double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }

    public void perimetro() {
        System.out.println((altura * 2) + (largura * 2));
    }
}
