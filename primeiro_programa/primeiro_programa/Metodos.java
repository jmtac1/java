package primeiro_programa;

public class Metodos {

    public static void main(String[] args) {
    // aqui a gente passa argumentos:
    calc(2, 2);
    }
    // static void é a declaração padrão de um metodo / função, mas existem outras.
    // aqui a gente passa parametros:
    static void calc(int x, int y) {
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x / y);
        System.out.println(x * y);
    }

}