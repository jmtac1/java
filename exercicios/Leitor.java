package exercicios;

import java.util.ArrayList;
import java.util.List;

public class Leitor {
    public static List<Livro> usuario;

    public Leitor() {
        usuario = new ArrayList<>();
    }

    public void devolverLivro(Livro livro) {
        if (usuario.contains(livro)) {
            usuario.remove(livro);
        }
    }

    public void listarLivros() {
        for (Livro livro : usuario) {
            System.out.println(livro.getNome() + " - " + livro.getAno());
        }
    }
}
