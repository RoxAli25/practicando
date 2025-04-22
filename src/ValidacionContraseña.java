import java.util.Scanner;

public class ValidacionContraseña {
    public static void main(String[] args) {

        String contrasena = "123456";
        Scanner scanner = new Scanner(System.in);

        System.out.println( "Ingrese la contraseña");
        String ingresoDeContrasena = scanner.nextLine();

        if (ingresoDeContrasena.equals(contrasena)) {
            System.out.println("ACCESO AUTORIZADO");
        } else {
            System.out.println("ACCESO DENEGADO");
        }
    }
}
