import java.util.Scanner;

public class DonacionDeSangre {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su Edad: ");
        int edadDonante = scanner.nextInt();

        System.out.println("ingrese su Peso en kg: ");
        int pesoDonante = scanner.nextInt();

        if (edadDonante >= 18 && edadDonante <= 65 && pesoDonante > 50) {
            System.out.println("Es Compatible para Donar Sangre");
        } else {
            System.out.println("No es compatible para Donar Sangre \n Debe tener Entre 18 y 65 años");
        }

        scanner.close();
    }
}

