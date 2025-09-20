import java.util.Scanner;

public class Main {
    public static int suma(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + suma(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número n: ");
        int n = sc.nextInt();

        int resultado = suma(n);
        System.out.println("La suma de los primero v:  " + n + " numeros naturales es: " + resultado);
    }
}