import java.util.Scanner;

public class NumeroEnIntervalos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese valor del préstamo: ");
        int monto = scanner.nextInt();

        if (monto >= 1000 && monto <= 5000) {
            System.out.println("Ha sido APROBADO su préstamo de: \n " + "$" + monto);
        } else {
            System.out.println("El monto no esta dentro del rango.\n " + "$" + monto + "\n Préstamo RECHAZADO");
        }

        scanner.close();

    }
}
