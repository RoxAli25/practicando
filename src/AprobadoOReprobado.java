import java.util.OptionalInt;
import java.util.Scanner;

public class AprobadoOReprobado {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner (System.in);
//        double nota = scanner.nextDouble();

       double nota = 2;

        if (nota >= 7.0) {
            System.out.println("El alumno tuvo un promedio de: " + nota + " Fue APROBADO");
        } else if (nota >= 5.0) {
            System.out.println("El alumno tuvo un promedio de: " + nota + " En Recuperación");
        } else {
            System.out.println("El alumno tuvo un promedio de: " + nota + " REPROBADO");
        }

    }
}
