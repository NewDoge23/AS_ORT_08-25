package actividad2;

/*
    Realizá un programa que permita ingresar dos números enteros y la operación a realizar
    ('+', '-', '*', '/'). Debe mostrarse el resultado para la operación ingresada. Considerar
    que no se puede dividir por cero (en ese caso mostrar el texto 'ERROR').
 */

import java.util.Scanner;

public class Ejercicio20 {

    static Scanner input = new Scanner(System.in);

    static final char SUMA = '+';
    static final char RESTA = '-';
    static final char MULTIP = '*';
    static final char DIV = '/';


    public static void main(String[] args) {

        int num1, num2, resultado;
        char op;

        System.out.println("Ingrese el 1er número: ");
        num1 = Integer.parseInt(input.nextLine());

        System.out.println("Ingrese el 2do número: ");
        num2 = Integer.parseInt(input.nextLine());

        System.out.println("Ingrese la operación que desea realizar: ");
        System.out.println("( + , - , * , / )");
        op = input.nextLine().strip().charAt(0);

        switch (op) {
            case SUMA: {
                resultado = num1 + num2;
                    System.out.println("El resultado de la SUMA es = " + resultado);
                break;
            }
            case RESTA: {
                resultado = num1 - num2;
                System.out.println("El resultado de la RESTA es = " + resultado);
                break;
            }
            case MULTIP: {
                resultado = num1 * num2;
                System.out.println("El resultado de la MULTIPLICACIÓN es = " + resultado);
                break;
            }
            case DIV: {
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("El resultado de la DIVISIÓN es = " + resultado);
                } else {
                    System.out.println("ERROR -- No se puede dividir entre 0");
                }
                break;
            }
            default: {
                System.out.println("La operación ingresada es inválida.");
            }
        }

        input.close();
    }

}
