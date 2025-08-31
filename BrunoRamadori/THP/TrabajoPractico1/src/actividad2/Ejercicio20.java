package actividad2;

import java.util.Scanner;

public class Ejercicio20 {

    static Scanner input = new Scanner(System.in);

    final static char SUMA = '+';
    final static char RESTA = '-';
    final static char MULTI = '*';
    final static char DIV = '/';

    public static void main(String[] args) {

        int num1, num2, resultado;
        char op;

        System.out.println("Por favor, ingrese el primer número entero");
        num1 = Integer.parseInt(input.nextLine());

        System.out.println("Por favor, ingrese el segundo número entero");
        num2 = Integer.parseInt(input.nextLine());

        System.out.println("Por favor, ingrese la operación a realizar");
        op = input.nextLine().strip().charAt(0);

        switch (op) {
            case SUMA: {
                resultado = num1 + num2;
                System.out.println("EL resultado de la suma es " + resultado);
                break;
            }
            case RESTA: {
                resultado = num1 - num2;
                System.out.println("EL resultado de la resta es " + resultado);
                break;
            }
            case MULTI: {
                resultado = num1 * num2;
                System.out.println("EL resultado de la multiplicación es " + resultado);
                break;
            }
            case DIV: {
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("EL resultado de la división es " + resultado);
                } else {
                    System.out.println("ERROR --------- NO se puede dividir por cero mogólico de mierda");
                }
                break;
            }
            default: {
                System.out.println("Operación invalida");
            }
        }

        input.close();
    }
}
