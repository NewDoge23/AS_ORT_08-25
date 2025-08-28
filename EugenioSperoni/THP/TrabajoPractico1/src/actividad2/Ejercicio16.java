package actividad2;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int inscriptos;
        int asientos;
        int faltan;

        System.out.print("Ingrese la cantidad de inscriptos: ");
        inscriptos = input.nextInt();

        System.out.print("Ingrese la cantidad de asientos disponibles: ");
        asientos = input.nextInt();

        if(asientos >= inscriptos) {
            System.out.println("Alcanzan los asientos para todos.");
        } else {
            faltan = inscriptos - asientos;
            System.out.println("No alcanzan los asientos.");
            System.out.println("Faltan " + faltan + " asientos para que todos se sienten.");
        }
        input.close();
    }
}
