package actividad2;

import java.util.Scanner;

/*
 * .Realizá un programa que permita ingresar la cantidad de inscriptos a una conferencia y la
	cantidad de asientos disponibles en el auditorio. Debes indicar si alcanzan los asientos, Si los
	asientos no alcanzaran indicar cuántos faltan para que todos los inscriptos puedan sentarse.
 */

public class Ejercicio16 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int cantInscriptos, cantAsientos, cantFaltantes;

        System.out.println("Ingrese la cantidad de Inscriptos que asistiran a la conferencia");
        cantInscriptos = Integer.parseInt(input.nextLine());

        System.out.println("Ingrese la cantidad de asientos disponibles");
        cantAsientos = Integer.parseInt(input.nextLine());

        cantFaltantes = cantInscriptos - cantAsientos;

        if (cantInscriptos > cantAsientos) {
            System.out.println(
                    "Los asientos no alcanzan para todos los Inscriptos, faltan " + cantFaltantes + " asiento/s");
        } else {
            System.out.println("Los asientos alcanzan para todos los Inscriptos");
        }

        input.close();

    }

}
