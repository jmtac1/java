package exercicios;

public class Administrador implements Autenticavel{

    String senhaAdmin;

    public Administrador(String senha) {
        this.senhaAdmin = senha;
    }

    @Override
    public boolean login(String senha) {
        return this.senhaAdmin.equals(senha);
    }
}
