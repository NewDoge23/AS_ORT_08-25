package actividad2;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int edad;
        char genero;
        boolean puedeJubilarse;

        System.out.print("Ingrese la edad (1 a 120): ");
        edad = Integer.parseInt(input.nextLine());

        System.out.print("Ingrese el género ('F' para mujer, 'M' para hombre): ");
        genero = input.next().strip().toUpperCase().charAt(0);

        if (edad < 1 || edad > 120 || (genero != 'F' && genero != 'M')) {
            System.out.println("Datos inválidos. El programa terminará.");
        } else {
            puedeJubilarse = false;

            if (genero == 'F' && edad >= 60) {
                puedeJubilarse = true;
            } else if (genero == 'M' && edad >= 65) {
                puedeJubilarse = true;
            }

            if (puedeJubilarse) {
                System.out.println("Está en edad de jubilarse.");
            } else {
                System.out.println("No está en edad de jubilarse.");
            }
        }
        input.close();
    }
}

