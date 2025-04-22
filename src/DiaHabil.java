import java.util.Scanner;

public class DiaHabil {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Se le pide al Usuario ingresar un Día
        System.out.println("Ingrese un día de la Semana");
        String dia = scanner.nextLine().toLowerCase(); //El "toLowerCase()" se usa para convertir lo que se escriba en minuscula

        //Se Verifica el Día
        if (dia.equals("lunes") || dia.equals("martes") || dia.equals("miercoles") || dia.equals("jueves")
                || dia.equals("viernes") ) {
            System.out.println(dia + " Es Día Hábil");
        } else if (dia.equals("sabado") || dia.equals("domingo")){
            System.out.println(dia + " No es día Hábil");
        } else {
            System.out.println("Opción Ingresada NO es válida");
        }

        scanner.close();

    }
}
