package actividad1;


import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);

        int primerNumero, segundoNumero, auxiliarNumero;

        System.out.println("Bienvenidos, porfavor ingresar un numero para la primera posicion = ");
        primerNumero = Integer.parseInt(input.nextLine());
        System.out.println("Bienvenidos, porfavor ingresar un numero para la segunda posicion = ");
        segundoNumero = Integer.parseInt(input.nextLine());

        System.out.println("Quedaria la primera posicion con el numero " + primerNumero);
        System.out.println("Quedaria la segunda posicion con el numero " + segundoNumero);

        auxiliarNumero = primerNumero;
        primerNumero = segundoNumero;
        segundoNumero = auxiliarNumero;

        System.out.println("Quedaria la primera posicion con el numero " + primerNumero);
        System.out.println("Quedaria la segunda posicion con el numero " + segundoNumero);

        input.close();

    }
}
