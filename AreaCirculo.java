import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el radio: ");
        double r = teclado.nextDouble();
        double area = (22 * r * r) / 7;
        System.out.println("El area del circulo es: " + area);

        teclado.close();
    }
}
