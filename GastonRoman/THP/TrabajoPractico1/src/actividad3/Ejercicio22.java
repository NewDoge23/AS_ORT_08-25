package actividad3;

/*
    Realizá un programa que muestre todos los números enteros del 1 al 5, y luego los mismos
    números pero en orden inverso.
 */

public class Ejercicio22 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("===========================================");

        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }

    }
}
