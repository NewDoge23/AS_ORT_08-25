package actividad2;

import java.util.Scanner;

/*
 * Realizá un programa que permita ingresar una edad (entre 1 y 120 años) y un género ('F'
	para mujeres, 'M' para hombres). En caso de haber ingresado valores erróneos (edad fuera
	de rango o género inválido), informar tal situación y terminar el programa. Si los datos están
	bien ingresados el programa debe indicar, sabiendo que las mujeres se jubilan con 60 años o
	más y los hombres con 65 años o más, si la persona está en edad de jubilarse.

 */

public class Ejercicio17 {
    private static Scanner input = new Scanner(System.in);
    final static int EDAD_MINIMA = 1;
    final static int EDAD_MAXIMA = 120;
    final static char MASC = 'M';
    final static char FEME = 'F';
    final static int JUBIL_MASC = 65;
    final static int JUBIL_FEME = 60;

    public static void main(String[] args) {
        int edad;
        char genero;

        System.out.println("Por favor, ingrese su edad");
        edad = Integer.parseInt(input.nextLine());
        System.out.println("Ahora, ingrese su género, M para masculino o F para femenino");
        genero = input.nextLine().strip().toUpperCase().charAt(0);

        if ((edad < EDAD_MINIMA || edad > EDAD_MAXIMA) && (genero != MASC || genero != FEME)) {
            System.out.println("edad fuera de rango o genero invalido, intente nuevamente");
        } else {
            if (edad >= JUBIL_FEME && genero == FEME) {
                System.out.println("Usted se encuentra en edad de jubilarse");
            } else if (edad >= JUBIL_MASC && genero == MASC) {
                System.out.println("Usted se encuentra en edad de jubilarse");
            } else {
                System.out.println("Usted no se encuentra en edad de jubilarse");
            }
        }
        input.close();
    }

}
