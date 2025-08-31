package actividad1;

import java.util.Scanner;

/*1.Realizá un programa que permita que el usuario ingrese su nombre.
El programa debe emitir una salida con un mensaje de bienvenida que incluya el nombre
ingresado.*/

public class Ejercicio1 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        String nombre;

        System.out.println("Hola, ingrese su nombre:");
        nombre = input.nextLine();

        System.out.println("Bienvenido " + nombre);

        input.close();
    }

}
