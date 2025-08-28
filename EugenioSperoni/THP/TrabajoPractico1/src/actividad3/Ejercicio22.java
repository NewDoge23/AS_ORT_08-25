package actividad3;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Números del 1 al 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("Números del 5 al 1:");
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
