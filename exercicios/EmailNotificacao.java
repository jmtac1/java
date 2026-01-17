package exercicios;

public class EmailNotificacao implements Notificavel{
    private String email;

    public EmailNotificacao(String email) {
        this.email = email;
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("📧 Enviando EMAIL para: " + email);
        System.out.println("Mensagem: " + mensagem);
        System.out.println();
    }
}
