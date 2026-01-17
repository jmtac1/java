package exercicios;

public class ArquivoTexto implements Arquivo{

    private String nome;
    private double tamanho;

    public ArquivoTexto(String nome, double tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    @Override
    public void abrir() {
        System.out.printf("Abrindo arquivo de texto: %s...", nome);
        System.out.println();
    }

    @Override
    public void fechar() {
        System.out.printf("fechando arquivo de texto: %s...", nome);
        System.out.println();
    }

    @Override
    public double getTamanho() {
        System.out.printf("arquivo tem: %f Kb", tamanho);
        System.out.println();
        return tamanho;
    }
}
