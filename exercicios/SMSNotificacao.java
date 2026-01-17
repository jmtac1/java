package exercicios;

public class SMSNotificacao implements Notificavel{
    private String numero;

    public SMSNotificacao(String numero) {
        this.numero = numero;
    }


    @Override
    public void enviar(String mensagem) {
        System.out.println("📱 Enviando SMS para: " + numero);
        System.out.println("Mensagem: " + mensagem);
        System.out.println();
    }
}
