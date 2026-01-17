package exercicios;

public class Relatorio implements Imprimivel{
    private String titulo;
    private int paginas;

    public Relatorio(String titulo, int paginas) {
        this.titulo = titulo;
        this.paginas = paginas;
    }


    @Override
    public void imprimir() {
        System.out.println("=== RELATÓRIO ===");
        System.out.println("Título: " + titulo);
        System.out.println("Páginas: " + paginas);
        System.out.println();
    }
}
