package exercicios;

public class Pessoa {
    private int idade;
    private String nome;

    public Pessoa(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }
    public Pessoa() {
    }

    public boolean ismaior() {
        if (idade >= 18) {
            return true;
        } else {
            return false;
        }
    }

}
