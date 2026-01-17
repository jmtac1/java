package primeiro_programa;

// import java.util.Scanner;
// import java.util.concurrent.Callable;

public class Poo {
    public static void main(String[] args) {
        // primeiro cria-se uma instancia do objeto e depois podemos manipula-lo
//        Carro modelo0 = new Carro();

//        modelo0.ficha();
//        modelo0.ficha(false);
//        System.out.println(modelo0.toString());

        Carro modelo1 = new Carro("Tesla", "verde");
        Carro modelo2 = new Carro("Tesla", "verde");

        System.out.println(modelo1);
        System.out.println(modelo1.hashCode());
        System.out.println(modelo2);
        System.out.println(modelo2.hashCode());
        System.out.println(modelo1.equals(modelo2));

        System.out.println(Carro.getCarrosProduzidos());


    }
}
