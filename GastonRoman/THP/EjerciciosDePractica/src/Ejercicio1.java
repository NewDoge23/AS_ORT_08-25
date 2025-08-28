import java.util.Scanner;

public class Ejercicio1 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int num, aux1 = 0, factorial = 1;

        do {
            System.out.println("Ingrese un número entero: ");
            num = Integer.parseInt(input.nextLine());
            if (num <= 0) {
                System.out.println("ERROR --- El número tiene que ser entero y positivo (mayor a 0)");
            }
        } while (num <= 0);

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }

        System.out.println("El factorial de " + num + " es = " + factorial);

        input.close();
    }
}
