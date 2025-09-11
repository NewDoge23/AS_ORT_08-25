package actividadesPracticas;

import java.util.Scanner;

public class EjercicioParcial_Ascensor {

    static Scanner input = new Scanner(System.in);

    static final char ASCENSOR_A = 'A';
    static final char ASCENSOR_B = 'B';
    static final char ASCENSOR_C = 'C';
    static final char ASCENSOR_D = 'D';
    static final char SALIR = 'X';
    static final int ULTIMO_PISO = 30;
    static final int PB = 0;
    static final int ULTIMO_SUBS = -2;

    public static void main(String[] args) {

        int piso, paradasTotales = 0, paradasPares = 0, paradasImpares = 0, pisoMax = Integer.MIN_VALUE;
        char ascensor, ascensorMax = 'z';


        ascensor = pedirAscensor();
        while (ascensor != SALIR) {

            piso = pedirPiso(ascensor);

            paradasTotales++;

            if (piso % 2 == 0) {
                paradasPares++;
            } else {
                paradasImpares++;
            }
            if (piso > pisoMax) {
                pisoMax = piso;
                ascensorMax = ascensor;
            }
            ascensor = pedirAscensor();
        }

        mostrarResultados(paradasTotales, paradasPares, paradasImpares, pisoMax, ascensorMax);

    }

    static int pedirPiso(char a) {
        int p = 0;
        switch (a) {

            case ASCENSOR_A, ASCENSOR_B: {
                p = pedirPisoTodos(a);
                break;
            }
            case ASCENSOR_C: {
                p = pedirPisoPares(a);
                break;
            }

            case ASCENSOR_D: {
                p = pedirPisoImpares(a);
                break;
            }
        }
        return p;
    }

    static int pedirPisoImpares(char a) {
        System.out.println("Ingrese un piso o subsuelo para el ascensor " + a + ":");
        int p = Integer.parseInt(input.nextLine());
        while (p < PB || p % 2 == 0) {
            System.out.println("ERROR --- Debe estar en el rango [1 a 30] y ser un piso IMPAR");
            System.out.println("Ingrese un piso o subsuelo para el ascensor " + a + ":");
            p = Integer.parseInt(input.nextLine());
        }
        return p;
    }

    static int pedirPisoPares(char a) {
        System.out.println("Ingrese un piso o subsuelo para el ascensor " + a + ":");
        int p = Integer.parseInt(input.nextLine());
        while (p < PB || p % 2 != 0) {
            System.out.println("ERROR --- Debe estar en el rango [1 a 30] y ser un piso PAR");
            System.out.println("Ingrese un piso o subsuelo para el ascensor " + a + ":");
            p = Integer.parseInt(input.nextLine());
        }
        return p;
    }

    static int pedirPisoTodos(char a) {
        System.out.println("Ingrese un piso o subsuelo para el ascensor " + a + ":");
        int p = Integer.parseInt(input.nextLine());
        while (p > ULTIMO_PISO || p < ULTIMO_SUBS) {
            System.out.println("ERROR --- Debe estar en el rango [-2 a 30]");
            System.out.println("Ingrese un piso o subsuelo para el ascensor " + a + ":");
            p = Integer.parseInt(input.nextLine());
        }
        return p;
    }

    static char pedirAscensor() {
        System.out.println("Ingrese el ascensor (A-B-C-D) o X para salir");
        char a = input.nextLine().strip().toUpperCase().charAt(0);
        while (a != 'A' && a != 'B' && a != 'C' && a != 'D' && a!= 'X') {
            System.out.println("ERROR --- Entrada inválida");
            System.out.println("Ingrese el ascensor (A-B-C-D) o X para salir");
            a = input.nextLine().strip().toUpperCase().charAt(0);
        }
        return a;
    }

    static void mostrarResultados (int pTotales, int pPares, int pImpares, int pMax , char aMax) {
        if (pTotales != 0) {
            System.out.println("La cantidad de paradas totales es de: " + pTotales);
            System.out.println("La cantidad de paradas pares es de: " + pPares);
            System.out.println("La cantidad de paradas impares es de: " + pImpares);
            System.out.println("El piso más alto elegido fue: " + pMax + " en el ascensor: " + aMax);
        } else {
            System.out.println("No se ingresaron datos. Saliendo...");
        }
    }
}
