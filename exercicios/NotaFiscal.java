package exercicios;

public class NotaFiscal implements Imprimivel{

    private int numero;
    private double valor;

    public NotaFiscal(int numero, double valor) {
        this.numero = numero;
        this.valor = valor;
    }

    @Override
    public void imprimir() {
        System.out.println("=== NOTA FISCAL ===");
        System.out.println("Número: " + numero);
        System.out.println("Valor Total: R$ " + valor);
        System.out.println();
    }
}
