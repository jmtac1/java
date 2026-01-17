package exercicios;

public class Produto {
    private static int estoqueTotal;
    private int estoque;
    private double preco;
    private String nome;

    public Produto(String nome, double preco, int estoque) {
        adicionarEstoque(estoque);
        this.preco = preco;
        this.nome = nome;
    }

    public void adicionarEstoque(int qtd) {
        this.estoque = qtd;
        estoqueTotal += qtd;
    }
    public void removerEstoque(int qtd) {
        if (estoque - qtd < 0) {
            System.out.println("não é possivel tirar essa quantidade do estoque");
        } else {
            estoque -= qtd;
        }
    }

    public int getEstoque() {
        return estoque;
    }

    public static int getEstoqueTotal() {
        return estoqueTotal;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }
}
