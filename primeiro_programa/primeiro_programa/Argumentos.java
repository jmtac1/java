package primeiro_programa;

public class Argumentos {
    public static void main(String[] args) {
        // argumentos podem ser informados em linha de comando pelo terminal:
        // primeiro compile o seu arquivo .java na pasta onde esta localizado usando o comando "javac"
        // depois rode o arquivo .class gerado pela compilação usando o comando "java"
        System.out.println("Olá, " + args[0] + " " + args[1]);

    }
}