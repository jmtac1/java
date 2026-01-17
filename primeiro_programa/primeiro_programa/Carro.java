package primeiro_programa;

import java.util.Objects;// A classe é um molde onde definimos atributos (propriedades) e comportamentos (métodos) para um objeto
public class Carro {

    // Propriedades:
    // as propriedades de um objeto quase sempre são privadas
    private String marca;
    private int ano;
    private String cor;
    private int cavalos;

    // o objeto carro tambem pode ser composto por outros objetos, como por exemplo "motor",
    // e esses objetos agem como propriedades:
    public Motor motor;

    // variavel Static:
    // a variavel static pertence a classe e não ao objeto
    private static int carrosProduzidos = 0;

    // metodo Static:
    // o metodo static pertence a classe e não é preciso instanciar um objeto para usalo:
    public static int getCarrosProduzidos() {
        return carrosProduzidos;
    }

    // Metodo construtor:
    // funções construtoras servem para que no momento em que se instancia um objeto,
    // ja atribuir valor as propriedades dele
    // também é uma função que é executada no momento em que se instancia um objeto
    public Carro(String marca, String cor) {
        this.marca = marca;
        this.cor = cor;
        carrosProduzidos ++;
    }
    // também existe a função construtora padrão. Pode ser usado caso você não queira atribuir valor as propriedades
    public Carro() {
        carrosProduzidos ++;
    }

    // Sobrecarga de metodos:
    // eu posso também criar dois ou mais metodos com nome igual, desde que usem parametros diferentes.
    // é usado caso os metodos tenham funções parecidas:
    public void ficha() {
        System.out.println(marca);
        System.out.println(cor);
    }
    public void ficha(boolean isCompleto) {
        if (isCompleto) {
            ficha();
        }
        else {
            System.out.println(cor);
        }
    }

    // Funções SETTERS:
    // é uma boa pratica definir uma função (setter) para alterar uma propriedade de um objeto:
    public void setMarca(String marca) {
        // o metodo (this) serve para acessar uma propriedade fora do escopo
        this.marca = marca;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setCavalos(int cavalos) {
        this.cavalos = cavalos;
    }

    // Funções GETTERS:
    // e para acessar a propriedade definimos uma função (getter):
    public String getMarca() {
        return marca;
    }
    public int getAno() {
        return ano;
    }
    public String getCor() {
        return cor;
    }

    public int getCavalos() {
        return cavalos;
    }

    // você pode reescrever o metodo "toString()" para mudar sua funcionalidade:
    @Override
    public String toString() {
        return "marca: " + marca + "," + " cor: " + cor;
    }
    // você pode fazer a mesma coisa com os metodos "hashCode()" e "equals()" para poder comparar objetos
    // pelos seus atributos e não pelo hashcode:
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Objects.equals(marca, carro.marca) && Objects.equals(cor, carro.cor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, cor);
    }
}

