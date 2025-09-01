package actividad2;

/*
    Realizá un programa que permita ingresar una edad (entre 1 y 120 años) y un género ('F'
    para mujeres, 'M' para hombres). En caso de haber ingresado valores erróneos (edad fuera
    de rango o género inválido), informar tal situación y terminar el programa. Si los datos están
    bien ingresados el programa debe indicar, sabiendo que las mujeres se jubilan con 60 años o
    más y los hombres con 65 años o más, si la persona está en edad de jubilarse.
 */

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
