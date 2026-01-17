package exercicios;

public class Quadrado extends FormaGeometrica {

    private final double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
