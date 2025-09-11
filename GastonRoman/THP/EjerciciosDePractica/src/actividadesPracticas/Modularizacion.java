package actividadesPracticas;

import java.util.Scanner;

public class Modularizacion {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        double num1, num2, resu;
        char op;

        num1 = ingresarNumero();
        num2 = ingresarNumero();
        op = ingresarOperacion();
        resu = realizarOperacion(num1, num2, op);

        if (num2 == 0 && op == '/') {
            mostrarMensaje("No se puede dividir por cero");
        } else {
            mostrarResultado(resu);
        }
    }

    private static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    private static double ingresarNumero() {

        double n;

        System.out.println("Ingrese un número: ");
        n = Integer.parseInt(input.nextLine());

        return n;
    }

    private static char ingresarOperacion() {

        System.out.println("Ingrese la operación a realizar ( +, -, *, / ): ");
        char oper = input.next().charAt(0);

        while (oper != '+' && oper != '-' && oper != '*' && oper != '/') {
            System.out.println("Error, ingrese una operación válida");
            oper = input.next().charAt(0);
        }

        return oper;
    }

    private static double realizarOperacion(double v1, double v2, char operacion) {
        double resultado = 0;
        switch (operacion) {
            case '+': {
                resultado = v1 + v2;
                break;
            }
            case '-': {
                resultado = v1 - v2;
                break;
            }
            case '*': {
                resultado = v1 * v2;
                break;
            }
            case '/': {
                if (v2 != 0) {
                    resultado = v1 / v2;
                }
                break;
            }
        }

        return resultado;
    }

    private static void mostrarResultado(double resu) {
        System.out.println("El resultado de la operación es: " + resu);
    }

}
