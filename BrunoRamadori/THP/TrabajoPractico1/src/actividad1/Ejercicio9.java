package actividad1;

/*
 * Realizá un programa que permita ingresar dos números que representan las medidas en
	grados de dos ángulos interiores de cierto triángulo. A partir de los valores de estos dos
	ángulos el programa debe mostrar el valor en grados del ángulo restante. Recordá que la
	suma de los ángulos interiores de todo triángulo es de 180º.
 */

import java.util.Scanner;

public class Ejercicio9 {

    private static Scanner input = new Scanner(System.in);
    final static int SUMA_ANGULOS = 180;

    public static void main(String[] args) {

        int ang1, ang2, ang3;

        System.out.println("Por favor, ingrese la medida del primer angulo: ");
        ang1 = Integer.parseInt(input.nextLine());

        System.out.println("Por favor, ingrese la medida del segundo angulo: ");
        ang2 = Integer.parseInt(input.nextLine());

        ang3 = SUMA_ANGULOS - (ang1 + ang2);

        System.out.println("La medida del angulo faltante es de: " + ang3);

        input.close();

    }

}
