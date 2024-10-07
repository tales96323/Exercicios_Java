import java.util.Scanner;

public class CalculadoraSimples {
    public static void calculadoraSimples() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero:");
        double num1 = scanner.nextDouble();

        System.out.println("Digite um numero:");
        double num2 = scanner.nextDouble();

        System.out.println("Soma entre" + num1 + "e" + num2 + (num1 + num2));
        System.out.println("Subtração: " + num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println("Multiplicação: " + (num1 * num2));
        System.out.println("Divisão: " + (num1 / num2));

    }
}