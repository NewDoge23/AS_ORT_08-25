package actividad2;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Los nombres de las constantes van en MAYUSCULAS //
        final int DOMINGO = 1;
        final int LUNES = 2;
        final int MARTES = 3;
        final int MIERCOLES = 4;
        final int JUEVES = 5;
        final int VIERNES = 6;
        final int SABADO = 7;
        int num1;

        System.out.println("Ingrese un numero del 1 al 7 ");
        num1 = Integer.parseInt(input.nextLine());

        switch (num1) {
            case DOMINGO:
                System.out.println("El numero " + num1 + " coresponde al dia Domingo ");
                break;
            case LUNES:
                System.out.println("El numero " + num1 + " coresponde al dia Lunes ");
                break;
            case MARTES:
                System.out.println("El numero " + num1 + " coresponde al dia Martes ");
                break;
            case MIERCOLES:
                System.out.println("El numero " + num1 + " coresponde al dia Miercoles ");
                break;
            case JUEVES:
                System.out.println("El numero " + num1 + " coresponde al dia Jueves ");
                break;
            case VIERNES:
                System.out.println("El numero " + num1 + " coresponde al dia Viernes ");
                break;
            case SABADO:
                System.out.println("El numero " + num1 + " coresponde al dia Sabado ");
                break;
            default:
                System.out.println("ERROR, no se encuentra un dia asignado al numero proporcionado ");
        }
        input.close();
    }
}