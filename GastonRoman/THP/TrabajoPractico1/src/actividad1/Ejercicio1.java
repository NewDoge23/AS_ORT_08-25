package actividad1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        String nombre = "";

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        nombre = input.nextLine();

        System.out.println("Bienvenido/a " + nombre + "!");

        input.close();
    }

}
