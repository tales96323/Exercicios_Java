import java.util.Scanner;

public class JogoDaVelha {

    // Declaração do Tabuleiro
    private static char[][] tabuleiro = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};

    // Declarar Jogador atual
    private static char jogadorAtual = 'X';

    private static String nomeJogadorX;
    private static String nomeJogadorO;
    private static String nomeJogadorAtual;


    // Função para imprimir o tabuleiro
    private static void imprimirTabuleiro() {

        System.out.println("                ");
        System.out.println("***TABULEIRO***");
        System.out.println("                ");
        System.out.println("  1   2   3");


        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + " " + tabuleiro[i][0] + " | " + tabuleiro[i][1] + " | " + tabuleiro[i][2]);
            if (i < 3) {
                System.out.println("  ---------");
            }
        }
    }


    // Metodo principal (main)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Define o jogador ativo.
        boolean jogoAtivo = true;

        // Pedindo os nomes dos jogadores
        System.out.println("Bem-vindo ao Jogo da Velha!");
        System.out.print("Insira o nome do Jogador X: ");
        nomeJogadorX = scanner.nextLine();
        System.out.print("Insira o nome do Jogador O: ");
        nomeJogadorO = scanner.nextLine();

        // O jogador atual começa como X
        nomeJogadorAtual = nomeJogadorX;

        while (jogoAtivo) {
            imprimirTabuleiro();
            int linha;
            int coluna;


            // Recebe a jogada do jogador atual
            do {
                System.out.println(nomeJogadorAtual + " (Jogador " + jogadorAtual + "), escolha uma linha (1-3) e uma coluna (1-3):");
                linha = scanner.nextInt() - 1;
                coluna = scanner.nextInt() - 1;

            } while (!jogadaValida(linha, coluna));

            // Faz a jogada no tabuleiro
            tabuleiro[linha][coluna] = jogadorAtual;

            // Verifica se o jogo acabou
            if (vitoria()) {
                imprimirTabuleiro();
                System.out.println("Parabéns! " + nomeJogadorAtual + " venceu!");
                jogoAtivo = false;
            } else if (tabuleiroCompleto()) {
                imprimirTabuleiro();
                System.out.println("O jogo terminou em empate!");
                jogoAtivo = false;
            } else {
                // Troca o jogador
                jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
                nomeJogadorAtual = (jogadorAtual == 'X') ? nomeJogadorX : nomeJogadorO;
            }
        }

        scanner.close();
    }


    // Função para verificar se a jogada é válida
    private static boolean jogadaValida(int linha, int coluna) {
        if (linha < 0 || linha >= 3 || coluna < 0 || coluna >= 3 || tabuleiro[linha][coluna] != ' ') {
            System.out.println("Jogada inválida! Tente novamente.");
            return false;
        }
        return true;
    }

    // Função para verificar se algum jogador venceu
    private static boolean vitoria() {
        // Verifica linhas, colunas e diagonais
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogadorAtual && tabuleiro[i][1] == jogadorAtual && tabuleiro[i][2] == jogadorAtual)
                return true;
            if (tabuleiro[0][i] == jogadorAtual && tabuleiro[1][i] == jogadorAtual && tabuleiro[2][i] == jogadorAtual)
                return true;
        }
        if (tabuleiro[0][0] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][2] == jogadorAtual)
            return true;
        if (tabuleiro[0][2] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][0] == jogadorAtual)
            return true;
        return false;
    }

    // Função para verificar se o tabuleiro está completo (empate)
    private static boolean tabuleiroCompleto() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == ' ') {
                    return false;
                }
            }
        }


        return true;
    }
}

