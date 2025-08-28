package actividad1;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numeroPrimero, numeroSegundo;
        double resultadoSuma, resultadoResta, resultadoMulti, resultadoDiv;

        System.out.print("Ingrese el primer numero natural = ");
        numeroPrimero = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese el segundo numero natural = ");
        numeroSegundo = Integer.parseInt(input.nextLine());

        resultadoSuma = numeroPrimero + numeroSegundo;
        resultadoResta =numeroPrimero - numeroSegundo;
        resultadoMulti =numeroPrimero * numeroSegundo;
        resultadoDiv = (double)numeroPrimero / numeroSegundo;

        System.out.println("El resultado de la sumado es = " + resultadoSuma);
        System.out.println("El resultado de la resta es = " + resultadoResta);
        System.out.println("El resultado de la multiplicado es = " + resultadoResta);
        System.out.println("El resultado de la dividido es = " + resultadoDiv);

        input.close();

    }
}
