import java.util.Scanner;

public class VerificacionDeTriangulo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        Se pide al usuario ingresar los valores de los lados
        System.out.println("Ingrese el Valor del 1 Lado: ");
        int lado1 = scanner.nextInt();

        System.out.println("Ingrese el Valor del 2 Lado: ");
        int lado2 = scanner.nextInt();

        System.out.println("Ingrese el valor del 3 Lado: ");
        int lado3 = scanner.nextInt();

//      Se hace la suma de los lados
        if (lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado1 + lado3 > lado2) {
            System.out.println("Se puede formar un Triángulo");
        } else {
            System.out.println("NO se puede realizar un Triángulo");
        }

        scanner.close();
    }
}






// CON VALORES YA DESIGNADOS
//int lado1 = 3;
//        int lado2 = 4;
//        int lado3 = 5;
//
//        int totalLados = lado1 + lado2;
//
//        if (totalLados > lado3) {
//            System.out.println("La suma de sus lados es de: " + totalLados + "\n Se puede hacer un Triangulo");
//        } else {
//            System.out.println("No se puede formar el triangulo");
//        }