package exercicios;

public class Livro {
    private String nome;
    private int ano;

    public Livro(String nome, int ano) {
        this.nome = nome;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public int getAno() {
        return ano;
    }
}
