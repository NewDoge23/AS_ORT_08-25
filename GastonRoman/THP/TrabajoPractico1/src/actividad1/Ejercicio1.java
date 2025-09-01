package actividad1;

/*
    Realizá un programa que permita que el usuario ingrese su nombre. El programa debe emitir
    una salida con un mensaje de bienvenida que incluya el nombre ingresado.
 */

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        String nombre;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        nombre = input.nextLine();

        System.out.println("Bienvenido/a " + nombre + "!");

        input.close();
    }

}
