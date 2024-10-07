import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Escolha o exercício para executar:");
            System.out.println("1 - Exercício 1 (Array de Numeros)");
            System.out.println("2 - Exercício 2 (Calculadora Simples)");
            System.out.println("3 - Exercício 3 (Contador de Vogais)");
            System.out.println("4 - Exercício 4 (Fatorial)");
            System.out.println("5 - Exercício 5 (Fibonacci)");
            System.out.println("6 - Exercício 6 (Hello World)");
            System.out.println("7 - Exercício 7 (Numero Primo)");
            System.out.println("8 - Exercício 8 (Par ou Impar)");
            System.out.println("9 - Exercício 9 (Tabuada)");
            System.out.println("0 - Sair");

            int escolha = scanner.nextInt();

            switch (escolha) {

                case 1:
                    ArrayNumeros.arrayNumeros();
                    break;

                case 2:
                    CalculadoraSimples.calculadoraSimples();
                    break;

                case 3:
                    ContadorVogais.contadorVogais();
                    break;

                case 4:
                    Fatorial.fatorial();
                    break;

                case 5:
                    Fibonacci.fibonacci();
                    break;

                case 6:
                    HelloWorld.helloWorld();
                    break;

                case 7:
                    NumeroPrimo.numeroPrimo();
                    break;

                case 8:
                    ParOuImpar.parOuImpar();
                    break;

                case 9:
                    Tabuada.tabuada();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    System.exit(0); // Encerra o programa
                    break;

                default:
                    System.out.println("Escolha inválida, tente novamente.");
            }

            System.out.println(); // Linha em branco para separar as execuções
    }
}
