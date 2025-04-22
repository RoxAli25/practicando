import java.util.Scanner;

public class VerificacionDeDescuento {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double montoNecesario = 100;

        System.out.println("Ingrese el Valor de la Compra");
        double montoCompra = scanner.nextDouble();

        if (montoCompra >= montoNecesario) {
            double descuento = montoCompra * 0.10;
            double totalCompra = montoCompra - descuento;
            System.out.println("Se aplica el descuento del 10%, su total a pagar es de:\n " + totalCompra + "$");
        } else {
            System.out.println("Descuento NO se aplica su total a pagar es:\n " + montoCompra + "$");
        }

        scanner.close();
    }
}
