import java.util.Scanner;

public class Fatorial {
    public static void fatorial() {
        Scanner scanner = new Scanner(System.in);

        // Solicita o número ao usuário
        System.out.println("Digite um número para calcular o fatorial:");
        int num = scanner.nextInt();

        // Primeira entrada do fatorial
        int fatorial = 1;

        // String para armazenar a sequência da multiplicação
        StringBuilder sequencia = new StringBuilder();

        // Calcula o fatorial e cria a sequência de multiplicação
        for (int i = 1; i <= num; i++) {

            fatorial *= i;

            if (i == 1) {
                sequencia.append(i);  // Adiciona o primeiro número sem o "x"
            } else {
                sequencia.append(" x ").append(i);  // Adiciona os outros números com "x"
            }
        }

        // Exibe o resultado final no formato desejado
        System.out.println("O fatorial de " + num + " é: " + sequencia + " = " + fatorial);
    }
}