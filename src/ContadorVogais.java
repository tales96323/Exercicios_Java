import java.util.Scanner;

public class ContadorVogais {
    public static void contadorVogais() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra ou frase:");
        String texto = scanner.nextLine();
        int contadorVogais = 0;

        for (int i = 0; i < texto.length(); i++) {
            char ch = texto.toLowerCase().charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                contadorVogais++;
            }
        }

        System.out.println("Número de vogais: " + contadorVogais);
    }
}