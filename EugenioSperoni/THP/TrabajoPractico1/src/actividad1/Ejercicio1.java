package actividad1;


import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nombreUsuario;
        System.out.println("Ingrese su nombre de Usuario: ");
        nombreUsuario = input.nextLine();

        System.out.println("Bienvenido " + nombreUsuario);

        input.close();

    }

}
