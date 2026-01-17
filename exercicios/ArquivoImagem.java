package exercicios;

public class ArquivoImagem implements Arquivo{

    private String nome;
    private double tamanho;

    public ArquivoImagem(String nome, double tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    @Override
    public void abrir() {
        System.out.printf("Abrindo arquivo de imagem: %s...", nome);
        System.out.println();
    }

    @Override
    public void fechar() {
        System.out.printf("fechando arquivo de imagem: %s...", nome);
        System.out.println();
    }

    @Override
    public double getTamanho() {
        System.out.printf("arquivo tem: %f Mb", tamanho);
        System.out.println();
        return tamanho;
    }
}
