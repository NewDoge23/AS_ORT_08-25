package actividad1;

/*
    Realizá un programa que permita ingresar 3 notas pertenecientes a tres trimestres distintos
    para cierto alumno de nivel secundario. Debe calcularse y mostrarse la nota promedio.
 */

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int trim1, trim2, trim3;
        double prom;

        System.out.println("Ingrese la nota del 1er trimestre:");
        trim1 = Integer.parseInt(input.nextLine());

        System.out.println("Ingrese la nota del 2do trimestre:");
        trim2 = Integer.parseInt(input.nextLine());

        System.out.println("Ingrese la nota del 3er trimestre:");
        trim3 = Integer.parseInt(input.nextLine());

        prom = (double)(trim1+trim2+trim3) / 3;

        System.out.println("El promedio del alumno es: " + prom);

        input.close();
    }

}
