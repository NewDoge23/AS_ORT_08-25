package actividad1;


import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numeroEntero;
        double numeroMulti, numeroDivi;

        System.out.println("Indique un Numero Entero =");
        numeroEntero = Integer.parseInt(input.nextLine());

        numeroMulti = numeroEntero * 5;
        numeroDivi = (double)numeroEntero / 2;
        System.out.println("El numero " + numeroEntero + " multiplicado por 5 da = " + numeroMulti);
        System.out.println("El numero " + numeroEntero + " dividido entre 2 da = " + numeroDivi);

        input.close();

    }

}
