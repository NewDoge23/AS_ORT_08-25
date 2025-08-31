package actividad2;

import java.util.Scanner;

/*
 * Para entrar a la montaña rusa Infierno en las alturas se requiere tener al menos 7 años y medir
	más de 1,50 metros. Completá el siguiente cuadro a mano según los requisitos y luego
	escribí el programa que permita, ejecutándolo cada vez para cada niño y según las edades y
	estaturas ingresadas por el usuario, obtener los mismos resultados para los siguientes datos:
 */

public class Ejercicio14 {

    private static Scanner input = new Scanner(System.in);
    final static int EDAD_MINIMA = 7;
    final static int ALTURA_MINIMA = 150;

    public static void main(String[] args) {

        int edad, altura;

        System.out.println("Por favor, ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());

        System.out.println("Por favor, ingrese su altura en centimetros: ");
        altura = Integer.parseInt(input.nextLine());

        if (edad >= EDAD_MINIMA && altura > ALTURA_MINIMA) {
            System.out.println("Puede ingresar a la montaña rusa Infierno");
        } else {
            System.out.println("No puede ingresar al juego");
        }

        input.close();
    }

}
