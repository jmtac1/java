package exercicios;

import java.util.HashMap;
import java.util.Map;

public class AgendaTelefonica {
    private Map<String, String> contatos;

    public AgendaTelefonica() {
        contatos = new HashMap<>();
    }

    public void adicionar(String nome, String numero) {
        contatos.put(nome, numero);
    }

    public boolean busca(String nome) {
        return contatos.containsKey(nome);
    }

    public void remover(String nome) {
        contatos.remove(nome);
    }

    public void listarContatos() {
        for (Map.Entry<String, String> entry : contatos.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
