package actividadesPracticas;

/*
    En una carrera de caballos se busca premiar al primer y segundo puesto. Los ganadores serán aquellos caballos que hayan
    completado la carrera en el menor tiempo. Se nos solicita crear un programa que solicite la cantidad de caballos
    participantes en la carrera, así como el número de vueltas que consta la misma.

    Para cada caballo, se solicitará su nombre y el tiempo (en segundos) que tardó en completar cada una de las vueltas.

    El caballo ganador será aquel que haya finalizado la carrera en el menor tiempo, y
    el segundo puesto será otorgado al caballo con el segundo mejor tiempo.

    Al finalizar el programa, se debe informar:
        El primer y segundo puesto, indicando el nombre del caballo y su respectivo tiempo.
        La cantidad de caballos que hayan tardado más de 600 segundos en completar la carrera.

    Nos informan que nunca habrá empate en los tiempos.
 */

import java.util.Scanner;

public class EjercicioEC3_FP {

    private static Scanner input = new Scanner(System.in);

    private static final int MAX_TIEMPO = 600;

    public static void main(String[] args) {

        int cantCaballos, cantVueltas, tiempoTotal, aux1 = 0, mejorTiempo1 = Integer.MAX_VALUE, mejorTiempo2 = Integer.MAX_VALUE;
        String nombreCaballo = "", primerPuesto = "", segundoPuesto = "";


        cantCaballos = ingresarNumEntero("Ingrese la cantidad de caballos a competir: ");
        cantVueltas = ingresarNumEntero("Ingrese la cantidad de vueltas que tendrá la carrera: ");

        for (int i = 1; i <= cantCaballos ; i++) {

            System.out.println(i + "° caballo");

            nombreCaballo = ingresarTxt("Ingrese el nombre del caballo: ");

            tiempoTotal = calcularTiempo(cantVueltas);

            if (tiempoTotal < mejorTiempo1) {
                mejorTiempo2 = mejorTiempo1;
                segundoPuesto = primerPuesto;

                mejorTiempo1 = tiempoTotal;
                primerPuesto = nombreCaballo;
            } else if (tiempoTotal < mejorTiempo2) {
                mejorTiempo2 = tiempoTotal;
                segundoPuesto = nombreCaballo;
            }

            if (tiempoTotal > MAX_TIEMPO) {
                aux1++;
            }

        }

        System.out.println("El 1er lugar es para: " + primerPuesto + " con un tiempo de vuelta de: " + mejorTiempo1);
        System.out.println("El 2do lugar es para: " + segundoPuesto + " con un tiempo de vuelta de: " + mejorTiempo2);
        System.out.println("La cantidad de caballos que han tardado más de " + MAX_TIEMPO + " segundos fue de: " + aux1);

        input.close();
    }

    private static String ingresarTxt(String mensaje){

        System.out.println(mensaje);
        return input.nextLine();
    }

    private static int ingresarNumEntero(String mensaje){

        System.out.println(mensaje);
        return input.nextInt();
    }

    private static int calcularTiempo(int vueltas) {

        int total = 0;

        for (int i = 1; i <= vueltas; i++) {

            System.out.println(i + "° vuelta");

            int tiempoVuelta = ingresarNumEntero("Ingrese la cantidad de segundos de la vuelta: ");

            total += tiempoVuelta;
        }
        return total;
    }
}
