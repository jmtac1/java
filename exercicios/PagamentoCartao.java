package exercicios;

public class PagamentoCartao extends Pagamento {
    @Override
    public void pagar(double valor) {
        double taxa = 5 * valor / 100;
        System.out.println(valor + taxa);
        System.out.println(taxa);
    }
}
