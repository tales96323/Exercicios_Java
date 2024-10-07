import java.sql.SQLOutput;
import java.util.Scanner;

public class ArrayNumeros {
    public static void arrayNumeros() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do Array: ");
        int tam = scanner.nextInt();

        int[] numeros = new int[tam];

        System.out.println("Digite ma sequencia de numeros");

        for (int i =0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Números na ordem inversa:");
        for (int i = numeros.length - 1; i>= 0; i--) {
            System.out.println(numeros[i]);
        }


    }
}
