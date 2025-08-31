package actividad1;

import java.util.Scanner;

/*
 * 2. Realizá un programa que permita ingresar 3 notas pertenecientes a tres trimestres distintos
	para cierto alumno de nivel secundario. Debe calcularse y mostrarse la nota promedio.
 */

public class Ejercicio2 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {


        int num, num2, num3;
        double promedio;

        System.out.println("Porfavor ingrese la nota del primer trimestre: ");
        num = Integer.parseInt(input.nextLine());

        System.out.println("Porfavor ingrese la nota del segundo trimestre: ");
        num2 = Integer.parseInt(input.nextLine());

        System.out.println("Porfavor ingrese la nota del tercer trimestre: ");
        num3 = Integer.parseInt(input.nextLine());

        int suma = num + num2 + num3;

        promedio = (double) suma / 3;

        System.out.println("El promedio de las 3 notas fue de: " + promedio);

        input.close();
    }

}
