package actividad2;

/*
    Para entrar a la montaña rusa Miedo a las alturas, algo más chica y tranquila que la anterior,
    alcanza con que se cumpla solamente una de las siguientes condiciones: ser mayor de 6 años
    o medir más de 1,50 metros. Realizá el mismo procedimiento que con el ejercicio anterior
    pero con los nuevos requisitos.

        Nombre  Edad    Altura  ¿Entra al juego?(V/F)
        Juan      5       1.45          F
        María     7       1.23          F
        Luis      8       1.51          V
        Ana       9       1.39          F
 */

import java.util.Scanner;

public class Ejercicio15 {

    static Scanner input = new Scanner(System.in);

    static final int EDAD_MIN = 6;
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

        if (edad > EDAD_MIN || altura > ALT_MIN) {
            System.out.println(nombre + " puede ingresar!");
        } else {
            System.out.println(nombre + " no puede ingresar debido a los requisitos mínimos.");
        }
        input.close();
    }
}
