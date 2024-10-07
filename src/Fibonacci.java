import java.util.Scanner;

public class Fibonacci {
    public static void fibonacci() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de termos da sequência de Fibonacci:");
        int n = scanner.nextInt();

        int a = 0, b = 1;

        System.out.println("Sequência de Fibonacci:");
        System.out.print(a + " " + b);

        for (int i = 2; i < n; i++) {
            int proximo = a + b;
            System.out.print(" " + proximo);
            a = b;
            b = proximo;
        }
    }
}
