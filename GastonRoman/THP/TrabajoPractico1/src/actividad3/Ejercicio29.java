package actividad3;

/*
    Realizá un programa que permita validar la nota de un examen. Se espera que la nota que el
    usuario ingrese sea un número comprendido entre 0 y 10. La misma debe ser ingresada
    tantas veces como sea necesario hasta que quede comprendida dentro del rango indicado.
 */

import java.util.Scanner;

public class Ejercicio29 {

    static Scanner input = new Scanner(System.in);

    static final int NOTA_MIN = 0;
    static final int NOTA_MAX = 10;

    public static void main(String[] args) {

        int nota;

        do {
            System.out.println("Ingrese la nota del exámen: ");
            nota = Integer.parseInt(input.nextLine());
        } while (nota < NOTA_MIN || nota > NOTA_MAX);

    }
}
