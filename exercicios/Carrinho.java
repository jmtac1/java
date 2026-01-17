package exercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Carrinho {
    private Map<String, Produto> carrinho;
    private static double total;

    public Carrinho() {
        carrinho = new HashMap<>();
    }

    public void adicionarProduto(String nome, Produto produto) {
        carrinho.put(nome, produto);
    }

    public void removerProduto(String nome) {
        carrinho.remove(nome);
    }

    public double calcularTotal() {
        for (Produto produto : carrinho.values()) {
            total += produto.getPreco();
        }
        return total;
    }

    public void listarProdutos() {
        for (Map.Entry<String, Produto> entry : carrinho.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getPreco());

        }
    }
}
