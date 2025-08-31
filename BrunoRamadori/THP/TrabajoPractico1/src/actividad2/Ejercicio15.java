package actividad2;

import java.util.Scanner;

/*
 * Para entrar a la montaña rusa Miedo a las alturas, algo más chica y tranquila que la anterior,
	alcanza con que se cumpla solamente una de las siguientes condiciones: ser mayor de 6 años
	o medir más de 1,50 metros. Realizá el mismo procedimiento que con el ejercicio anterior
	pero con los nuevos requisitos.
 */

public class Ejercicio15 {

    private static Scanner input = new Scanner(System.in);
    final static int EDAD_MINIMA = 6;
    final static int ALTURA_MINIMA = 150;

    public static void main(String[] args) {
        int edad, altura;

        System.out.println("Por favor, ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());

        System.out.println("Por favor, ingrese su altura en centimetros: ");
        altura = Integer.parseInt(input.nextLine());

        if (edad > EDAD_MINIMA || altura > ALTURA_MINIMA) {
            System.out.println("Puede ingresar a la montaña rusa Infierno");
        } else {
            System.out.println("No puede ingresar al juego");
        }

        input.close();
    }

}
