package actividadesPracticas;

import java.util.Scanner;

/*
    La cadena McDonald's quiere evaluar la satisfacción de sus clientes con sus productos.
    Para ello, realizará una encuesta a los usuarios con tres productos diferentes:
                    ‘Big Mac’, ‘Cuarto de Libra’ y ‘Mc Nifica’.

    Requerimientos:

        Preguntar cuántos usuarios se encuestarán.
        Para cada usuario, preguntar:
        Nombre del usuario
        Producto que consume (‘Big Mac’, ‘Cuarto de Libra’ y ‘Mc Nifica’).
        Puntuación de satisfacción (un valor entre 1 y 10)


    Al finalizar el ingreso de datos, se debe mostrar por pantalla:

        El promedio de satisfacción para cada uno de los productos.
        La mayor puntuación registrada y el nombre del usuario que la dio.
        La cantidad total de usuarios que otorgaron una puntuación de 8 o más.
 */

public class EjercicioEC2_FP {

    static Scanner input = new Scanner(System.in);

    static final String PROD1 = "Big Mac";
    static final String PROD2 = "Cuarto de Libra";
    static final String PROD3 = "Mc Nifica";
    static final int PUNTAJE_ALTO = 8;
    static final int PUNTAJE_MIN = 1;
    static final int PUNTAJE_MAX = 10;
    static final int CANT_USU_MIN = 1;
    static final int MIN_DIV = 1;

    public static void main(String[] args) {

        int usuarios, puntaje, puntajeMax = Integer.MIN_VALUE;
        int puntajeAlto = 0, cantUsu1 = 0, cantUsu2 = 0, cantUsu3 = 0;
        String producto = "", nombreUsuario = "", nombreUsuMax = "";
        double promedio1 = 0, promedio2 = 0, promedio3 = 0;

        do {
            System.out.println("Cuántos usuarios van a ser encuestados?");
            usuarios = Integer.parseInt(input.nextLine());
        } while (usuarios < CANT_USU_MIN);

        for (int i = 0; i < usuarios; i++) {
            System.out.println("Nombre del usuario: ");
            nombreUsuario = input.nextLine();
            do {
                System.out.println("Qué producto consume?");
                System.out.println("Opciones: " + PROD1 + ", " + PROD2 + " o " + PROD3);
                producto = input.nextLine();
                if (!producto.equals(PROD1) && !producto.equals(PROD2) && !producto.equals(PROD3)) {
                    System.out.println("ERROR --- producto inválido: Debe ser " + PROD1 + ", " + PROD2 + " o " + PROD3);
                }
            } while (!producto.equals(PROD1) && !producto.equals(PROD2) && !producto.equals(PROD3));
            do {
                System.out.println("Qué puntaje le daría a dicho producto? (entre " + PUNTAJE_MIN + " y " + PUNTAJE_MAX + ")");
                puntaje = Integer.parseInt(input.nextLine());
                if (puntaje < PUNTAJE_MIN || puntaje > PUNTAJE_MAX) {
                    System.out.println("ERROR --- entre " + PUNTAJE_MIN + " y " + PUNTAJE_MAX);
                }
            } while (puntaje < PUNTAJE_MIN || puntaje > PUNTAJE_MAX);
            if (puntaje > puntajeMax) {
                puntajeMax = puntaje;
                nombreUsuMax = nombreUsuario;
            }
            if (puntaje >= PUNTAJE_ALTO) {
                puntajeAlto++;
            }
            switch (producto) {
                case PROD1: {
                    promedio1 = promedio1 + puntaje;
                    cantUsu1++;
                    break;
                }
                case PROD2: {
                    promedio2 = promedio2 + puntaje;
                    cantUsu2++;
                    break;
                }
                case PROD3: {
                    promedio3 = promedio3 + puntaje;
                    cantUsu3++;
                    break;
                }
            }
        }

        if (cantUsu1 > MIN_DIV) {
            promedio1 = promedio1 / cantUsu1;
            System.out.println("El puntaje promedio para el " + PROD1 + " es de: " + promedio1);
        } else {
            System.out.println(PROD1 + " no ha sido elegido.");
        }
        if (cantUsu2 > MIN_DIV) {
            promedio2 = promedio2 / cantUsu2;
            System.out.println("El puntaje promedio para el " + PROD2 + " es de: " + promedio2);
        } else {
            System.out.println(PROD2 + " no ha sido elegido.");
        }
        if (cantUsu3 > MIN_DIV) {
            promedio3 = promedio3 / cantUsu3;
            System.out.println("El puntaje promedio para el " + PROD3 + " es de: " + promedio3);
        } else {
            System.out.println(PROD3 + " no ha sido elegido.");
        }
        System.out.println("El mayor puntaje registrado fue de " + puntajeMax + " y fue otorgado por " + nombreUsuMax);

        input.close();
    }
}
