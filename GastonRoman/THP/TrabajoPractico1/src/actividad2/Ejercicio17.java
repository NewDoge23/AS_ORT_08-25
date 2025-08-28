package actividad2;

import java.util.Scanner;

public class Ejercicio17 {

    static Scanner input = new Scanner(System.in);

    static final char MUJER = 'F';
    static final char HOMBRE = 'M';
    static final int EDAD_MINIMA = 1;
    static final int EDAD_MAXIMA = 120;
    static final int EDAD_JUB_M = 65;
    static final int EDAD_JUB_F = 60;

    public static void main(String[] args) {

        int edad;
        char genero;

        System.out.println("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());

        System.out.println("Ingrese su género (M / F): ");
        genero = input.nextLine().charAt(0);

        if ((edad < EDAD_MINIMA || edad > EDAD_MAXIMA) || (genero != HOMBRE && genero != MUJER)) {
            System.out.println("Edad o género inválidos.");

        } else if (edad > EDAD_JUB_F && genero == MUJER || edad > EDAD_JUB_M) {
            System.out.println("Está en edad jubilatoria.");

        } else {
            System.out.println("Aún no puede jubilarse");
        }
        input.close();
    }
}
