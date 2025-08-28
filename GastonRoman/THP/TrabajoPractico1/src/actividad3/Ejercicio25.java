package actividad3;

import java.util.Scanner;

public class Ejercicio25 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int ancho, alto;

        System.out.println("Ingrese el ANCHO de la matriz: ");
        ancho = Integer.parseInt(input.nextLine());

        System.out.println("Ingrese el ALTO de la matriz: ");
        alto = Integer.parseInt(input.nextLine());



        for (int i = 0; i <= alto; i++) {
            for (int j = 0; j <= ancho; j++) {
                System.out.print("X ");
            }
            System.out.println();
        }
    }
}
