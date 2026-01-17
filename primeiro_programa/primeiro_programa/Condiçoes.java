package primeiro_programa;

import java.util.Random;

public class Condiçoes {
    public static void main(String[] args) {
        Random gerador = new Random();
        // gerando os numeros usando while:
//      int n = 0;
//      while (n < 6) {
//          int numero = gerador.nextInt(60);
//          System.out.println(numero);
//          n ++;
//      }
        // gerando os numeros usando for:
        for (int n = 0; n < 6; n++) {
            int numero = gerador.nextInt(60);
            System.out.println(numero);
        }
    }
}
