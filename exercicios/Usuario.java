package exercicios;

public class Usuario implements Autenticavel{
    String senha;

    public Usuario(String senha) {
        this.senha = senha;
    }
    @Override
    public boolean login(String senha) {
        return this.senha.equals(senha);
    }
}
