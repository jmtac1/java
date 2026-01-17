package primeiro_programa;

import java.util.Scanner;

public class Casting {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // como converter tipos primitivos (casting):
        double x = 25.550;
        short y = 25;
        float op1 = (float) (x / y);
        int op2 = (int) (x / y);
        int op3 = (int) leitor.nextDouble();

        System.out.println(op1);
        System.out.println(op2);
        System.out.println(op3);
    }
}
