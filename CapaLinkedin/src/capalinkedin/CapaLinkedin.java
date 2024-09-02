package jogodavelha;

import java.util.Scanner;

public class JogoDaVelha {

    private static char[][] tabuleiro = {
        {'1', '2', '3'},
        {'4', '5', '6'},
        {'7', '8', '9'}
    };

    // Jogador atual
    private static char jogadorAtual = 'X';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jogadas = 0;
        boolean jogoAtivo = true;

        while (jogoAtivo) {
            imprimirTabuleiro();
            System.out.println("Jogador " + jogadorAtual + ", escolha uma posição (1-9): ");
            int posicao = scanner.nextInt();

            if (fazerJogada(posicao)) {
                jogadas++;
                if (verificarVitoria()) {
                    imprimirTabuleiro();
                    System.out.println("Parabéns! O jogador " + jogadorAtual + " venceu!");
                    jogoAtivo = false;
                } else if (jogadas == 9) {
                    imprimirTabuleiro();
                    System.out.println("Empate! O jogo terminou.");
                    jogoAtivo = false;
                } else {
                    trocarJogador();
                }
            } else {
                System.out.println("Posição inválida, tente novamente.");
            }
        }
        scanner.close();

    }

    // Criar o tabuleiro
    private static void imprimirTabuleiro() {
        System.out.println("+-----------+");
        for (int i = 0; i < 3; i++) {
 