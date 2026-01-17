package primeiro_programa;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysExercicio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        // Arrays tem tamanho fixo determinado pelo usuario:
//        Carro[] carros = new Carro[3];

//        for (int i = 0; i < carros.length; i++) {
//            Carro atual = new Carro();
//            System.out.println("marca: ");
//            atual.setMarca(leitor.nextLine());
//            carros[i] = atual;
//        }
//        for (int i = 0; i < carros.length; i++) {
//            System.out.println(carros[i].getMarca());
//        }

        // se quiser pode colocar os elementos direto no array:
        Carro[] modelos = new Carro[] {
                new Carro("corola", "preto"),
                new Carro("civic", "cinza"),
                new Carro("uno", "vermelho")
        };
        for (int i = 0; i < modelos.length; i++) {
            System.out.println(modelos[i].getMarca());
            System.out.println(modelos[i].getCor());
        }

        // função para ordenar arrays:
        int[] numeros = new int[] {4, 2, 9, 5, 1, 6};
        java.util.Arrays.sort(numeros);

        // se tentar imprimir o array direto só retornara o hashcode (indentificador do objeto na memoria):
        System.out.println(numeros);

        // função para imprimir o conteudo do array:
        System.out.println(Arrays.toString(numeros));

        //Comparndo arrays:
        int[] num1 = new int[] {1, 2, 3, 4, 5};
        int[] num2 = new int[] {1, 2, 3, 4, 5};

        // se fizer assim vai dar false por que ele só vai comparar os hashcode:
        System.out.println(num1 == num2);
        System.out.println(num1.equals(num2));

        // para comparar o conteudo deve se fazer assim:
        System.out.println(Arrays.equals(num1, num2));

        // uma forma de preecher um array com valores padrão é essa:
        String[] nomes = new String[5];
        Arrays.fill(nomes, "João");
        System.out.println(Arrays.toString(nomes));
    }
}
