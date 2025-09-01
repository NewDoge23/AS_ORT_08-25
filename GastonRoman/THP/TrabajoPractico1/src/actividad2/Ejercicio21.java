package actividad2;

/*
    Realizá un programa que permita al usuario ingresar un número entero entre 1 y 7. Debe
    mostrarse por pantalla el nombre del día de la semana que representa tal número tomando
    como el primer día de la semana el domingo. De ingresar un número fuera de rango debe
    mostrar error.
 */

import java.util.Scanner;

public class Ejercicio21 {

    static Scanner input = new Scanner(System.in);

    static final int DOMINGO = 1;
    static final int LUNES = 2;
    static final int MARTES = 3;
    static final int MIERCOLES = 4;
    static final int JUEVES = 5;
    static final int VIERNES = 6;
    static final int SABADO = 7;


    public static void main(String[] args) {

        int numIng;

        System.out.println("Ingrese el número correspondiente al día de la semana que quiere visualizar: ");
        numIng = Integer.parseInt(input.nextLine());

        switch (numIng) {
            case DOMINGO: {
                System.out.println("El número ingresado corresponde al día DOMINGO");
                break;
            }
            case LUNES: {
                System.out.println("El número ingresado corresponde al día LUNES");
                break;
            }
            case MARTES: {
                System.out.println("El número ingresado corresponde al día MARTES");
                break;
            }
            case MIERCOLES: {
                System.out.println("El número ingresado corresponde al día MIÉRCOLES");
                break;
            }
            case JUEVES: {
                System.out.println("El número ingresado corresponde al día JUEVES");
                break;
            }
            case VIERNES: {
                System.out.println("El número ingresado corresponde al día VIERNES");
                break;
            }
            case SABADO: {
                System.out.println("El número ingresado corresponde al día SÁBADO");
                break;
            }
            default: {
                System.out.println("ERROR --- El número ingresado NO corresponde a ningún día de la semana.");
            }
        }
        input.close();
    }
}
