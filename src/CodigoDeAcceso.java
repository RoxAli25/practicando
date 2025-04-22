import java.util.Scanner;

public class CodigoDeAcceso {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int claveAcceso = 2023;
        int nivelMinimo = 1;
        int nivelMaximo = 3;

        System.out.println("Ingrese su Clave de acceso: ");
        int claveUsuario = scanner.nextInt();

        System.out.println("Ingrese su Nivel de Permiso");
        int permisoUsuario = scanner.nextInt();

        if (claveAcceso == claveUsuario && permisoUsuario >= nivelMinimo && permisoUsuario <= nivelMaximo) {
            System.out.println("ACCESO PERMITIDO\nBienvenido al Sistema");
        } else {
            System.out.println("ACCESO DENEGADO");
        }

        scanner.close();


    }
}
