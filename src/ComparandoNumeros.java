import java.util.Scanner;

public class ComparandoNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Se pide al usuario que ingre 2 números
        System.out.println("Ingresa el primer número");
        int numero1 = scanner.nextInt();

        System.out.println("Ingresa el segundo número");
        int numero2 = scanner.nextInt();

        //Se hace la comparación
        if (numero1 > numero2) {
            System.out.println("El número mayor es: " + numero1 + ".");
        } else if (numero2 > numero1) {
            System.out.println("El número mayor es " + numero2 + ".");
        } else {
            System.out.println( "Ambos número son iguales");
        }

        scanner.close();
    }
}