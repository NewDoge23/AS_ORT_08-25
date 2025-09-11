package actividad3;

/*
    Realizá un programa que permita validar la nota de un examen de la misma manera que el
    ejercicio 29 pero con las siguientes nuevas directivas:

    - Las notas 1 y 3 no se usan nunca.
    - La nota 0 se reserva para los ausentes

    En resumen, las notas válidas pueden ser un 2 o un valor entre 4 y 10.
 */

import java.util.Scanner;

public class Ejercicio32 {

    static Scanner input = new Scanner(System.in);
    static final int PROH1 = 1;
    static final int PROH2 = 3;
    static final int AUSENTE = 0;
    static final int NOTA_MIN = 0;
    static final int NOTA_MAX = 10;

    public static void main(String[] args) {

        int nota;

        do {
            System.out.println("Ingrese la nota del exámen: ");
            nota = Integer.parseInt(input.nextLine());
            if (nota == AUSENTE) {
                System.out.println("Alumno ausente");
            }
        } while (nota < NOTA_MIN || nota > NOTA_MAX || nota == PROH1 || nota == PROH2);

    }
}
