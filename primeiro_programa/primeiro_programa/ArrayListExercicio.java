package primeiro_programa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayListExercicio {
    public static void main(String[] args) {

        // essa é a sintax para se criar um arraylist:
        List<Carro> carros = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);
        String parar = "";

        // essa é uma forma de preencher um arraylist:
        while (true) {
            Carro atual = new Carro();
            System.out.println("marca: ");
            atual.setMarca(leitor.nextLine());
            carros.add(atual);
            System.out.println("continuar [s/n]: ");
            parar = leitor.nextLine();
            if (parar.equals("n")) {
                break;
            }
        }
        // essa é uma forma de mostrar os elementos de um arraylist:
        for (int i = 0; i < carros.size(); i++) {
            System.out.println(carros.get(i).getMarca());
        }

        List<String> nomes = new ArrayList<>();
        nomes.add("João");
        nomes.add("Carlos");
        nomes.add("Luis");

        // essa é uma forma de acessar o index de um elemento especifico dentro do arraylist:
        int index = nomes.indexOf("João");
        System.out.println(index);

        // essa é uma forma de verificar se um arraylist é vazio ou não:
        System.out.println(nomes.isEmpty());

        // essa é uma forma de verificar se um arraylist contem um elemento:
        System.out.println(nomes.contains("Carlos"));

        // essa é uma forma de ordenar um arraylist:
        Collections.sort(nomes);

        // essa é uma forma de acessar os elementos do arraylist (for each):
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
