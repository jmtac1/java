package exercicios;

public class ArquivoVideo implements Arquivo{

    private String nome;
    private double tamanho;

    public ArquivoVideo(String nome, double tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    @Override
    public void abrir() {
        System.out.printf("Abrindo arquivo de video: %s...", nome);
        System.out.println();
    }

    @Override
    public void fechar() {
        System.out.printf("fechando arquivo de video: %s...", nome);
        System.out.println();
    }

    @Override
    public double getTamanho() {
        System.out.printf("arquivo tem: %f Gb", tamanho);
        System.out.println();
        return tamanho;
    }
}
