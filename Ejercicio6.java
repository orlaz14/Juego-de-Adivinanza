import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int secreto = (int)(Math.random() * 100) + 1;
        int numero, intentos = 0;

        while (true) {
            System.out.print("Adivina el numero (1-100): ");
            numero = sc.nextInt();
            intentos++;

            if (numero == secreto) {
                System.out.println("Felicidades, acertaste!");
                break;
            }

            if (numero < secreto) {
                System.out.println("El numero es mayor");
            } else {
                System.out.println("El numero es menor");
            }
        }

        System.out.println("Intentos utilizados: " + intentos);

        sc.close();
    }
}