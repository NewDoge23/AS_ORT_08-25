package actividad3;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {

        final Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el ancho de la matriz: ");
        int ancho = input.nextInt();

        System.out.print("Ingrese el alto de la matriz: ");
        int alto = input.nextInt();

        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print("X");
            }
            System.out.println();
        }
        input.close();
    }
}
