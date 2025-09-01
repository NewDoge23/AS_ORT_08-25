package actividad2;

/*
    Para entrar a la montaña rusa Infierno en las alturas se requiere tener al menos 7 años y medir
    más de 1,50 metros. Completa el siguiente cuadro a mano según los requisitos y luego
    escribí el programa que permita, ejecutándolo cada vez para cada niño y según las edades y
    estaturas ingresadas por el usuario, obtener los mismos resultados para los siguientes datos:

        Nombre  Edad    Altura  ¿Entra al juego?(V/F)
        Juan      5       1.45          F
        María     7       1.23          F
        Luis      8       1.51          V
        Ana       9       1.39          F
 */

import java.util.Scanner;

public class Ejercicio14 {

    static Scanner input = new Scanner(System.in);

    static final int EDAD_MIN = 7;
    static final double ALT_MIN = 1.5;

    public static void main(String[] args) {

        int edad;
        double altura;
        String nombre;

        System.out.println("Ingrese el nombre: ");
        nombre = input.nextLine();
        System.out.println("Ingrese la edad de " + nombre + ": ");
        edad = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese la altura de " + nombre + ": ");
        altura = Double.parseDouble(input.nextLine());

        if (edad >= EDAD_MIN && altura > ALT_MIN) {
            System.out.println(nombre + " puede ingresar!");
        } else {
            System.out.println(nombre + " no puede ingresar debido a los requisitos mínimos.");
        }
        input.close();
    }
}
