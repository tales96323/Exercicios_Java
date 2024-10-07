import java.util.Scanner;

public class Tabuada {

    public static void tabuada() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero para ver a sua tabuada: ");
        int num = scanner.nextInt();

        for (int i=0; i<=10 ; i++) {
            System.out.println(num + " x " + i + " = " + (num*i));
        }
    }
}
