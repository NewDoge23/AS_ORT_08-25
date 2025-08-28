package actividad3;

public class EjercicioEC {

    static final int MAX_MULTIPLICADOR = 10;
    static final int MAX_MULTIPLICANDO = 9;

    public static void main(String[] args) {
        
        int producto;

        for (int i = 1; i <= MAX_MULTIPLICANDO; i++) {
            System.out.println("Tabla del " + i);
            for (int j = 0; j <= MAX_MULTIPLICADOR; j++) {
                producto = i * j;
                System.out.println(i + "*" + j + " = " + producto);
            }
            
        }
        
    }
}

