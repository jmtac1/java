package exercicios;

import java.util.HashMap;
import java.util.Map;

public class Biblioteca {
    private Map<String, Livro> estoque;

    public Biblioteca() {
        estoque = new HashMap<>();
    }

    public void adicionarLivro(Livro livro) {
        estoque.put(livro.getNome(), livro);
    }

    public void emprestarLivro(String nome) {
        Leitor.usuario.add(estoque.get(nome));
    }

    public void listarLivros() {
        for (Map.Entry<String, Livro> entry : estoque.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getAno());
        }
    }

}
