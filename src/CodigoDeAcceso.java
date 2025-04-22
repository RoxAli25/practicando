import java.util.Scanner;

public class CodigoDeAcceso {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int claveAcceso = 2023;
        int nivelDePermiso1 = 1;
        int ninelDePermiso2 = 2;
        int nivelDePermiso3 = 3;

        System.out.println("Ingrese su Clave de acceso: ");
        int claveUsuario = scanner.nextInt();

        System.out.println("Ingrese su Nivel de Permiso");
        int permisoUsuario = scanner.nextInt();

        if (claveAcceso == claveUsuario && nivelDePermiso1 == permisoUsuario) {
            System.out.println("ACCESO PERMITIDO\n Bienvenido al Sistema");
        } else if (claveAcceso == claveUsuario && nivelDePermiso3 == permisoUsuario) {
            System.out.println("ACCESO PERMITIDO\n Bienvenido al Sistema");
        } else if (claveUsuario == claveAcceso && ninelDePermiso2 == permisoUsuario) {
            System.out.println("ACCESO PERMITIDO\nBienvenido al Sistema");
        } else {
            System.out.println("ACCESO DENEGADO");
        }

        scanner.close();


    }
}
