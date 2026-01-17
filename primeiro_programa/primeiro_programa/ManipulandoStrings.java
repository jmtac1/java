package primeiro_programa;

public class ManipulandoStrings {
    public static void main(String[] args) {
        String palavra = "Ola mundo, bem vindo ao mundo";
        System.out.println(palavra.length()); // retorna o numero de caracteres de uma string
        System.out.println(palavra + " novo!"); // concatena uma string com outra
        System.out.println(palavra.contains("mundo")); // verifica se existe uma string dentro de outra
        System.out.println(palavra.indexOf("mundo")); // retorna o index que uma string aparece pela primeira vez dentro de outra
        System.out.println(palavra.lastIndexOf("mundo")); // retorna o index que uma string aparece pela ultima vez dentro de outra
        System.out.println(palavra.toUpperCase()); // transforma uma string para caixa alta
        System.out.println(palavra.toLowerCase()); // trasforma uma string para caixa baixa
        System.out.println(palavra.trim()); // remove os espaços do começo e do final de uma string
        System.out.println(palavra.substring(0, 9)); // retorna o fatiamento de uma string
        System.out.println(palavra.equals("ola")); // verifica se uma string é igual a outra

    }
}
