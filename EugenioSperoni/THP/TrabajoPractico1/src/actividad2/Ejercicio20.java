package actividad2;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final char SUMA = '+';
        final char RESTA = '-';
        final char MULTI = '*';
        final char DIV = '/';
        int num1;
        int num2;
        int resultado;
        char operacion;

        System.out.println("Ingresar el primer numero: ");
        num1 = Integer.parseInt(input.nextLine());

        System.out.println("Ingresar el segundo numero: ");
        num2 = Integer.parseInt(input.nextLine());

        System.out.println("Ingresar una operacion a realizar( +, -, * y / ): ");
        operacion = input.nextLine().strip().charAt(0);

        switch (operacion){
            case SUMA:
                resultado = num1 + num2;
                System.out.println("El resultado de la suma sera " + resultado);
                break;
            case RESTA:
                resultado = num1 - num2;
                System.out.println("El resultado de la resta sera " + resultado);
                break;
            case MULTI:
                resultado = num1 * num2;
                System.out.println("El resultado de la multiplicacion sera " + resultado);
                break;
            case DIV:
                resultado = num1 / num2;
                System.out.println("El resultado de la division sera " + resultado);
                break;
            default:
                System.out.println("ERROR, tipo de operacion invalida. ");
        }
        input.close();
    }
}