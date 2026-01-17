package exercicios;

public class PagamentoPix extends Pagamento {
    @Override
    public void pagar(double valor) {
        double desconto = 5 * valor / 100;
        System.out.println(valor - desconto);
        System.out.println(desconto);
    }
}
