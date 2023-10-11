package br.com.senaisp.erley.jogodavelha;

import java.util.Scanner;

public class JogoVelhaTeste {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		JogoVelha jg = new JogoVelha();
		jg.mostrarTabuleiro();

		do {
			// pular 3 linha seguidas
			for(int i=0; i< 3; i++) {
				System.out.println();
			}
			System.out.println(jg.getTurno());
			System.out.println("Digite a linha:");
			int lin = teclado.nextInt();
			System.out.println("Digite a coluna:");
			int col = teclado.nextInt();
			// realizar a jogada (se a posicao nao estiver ocupada)
			jg.efetuarJogada(lin, col);
			// Exibindo o tabuleiro
			jg.mostrarTabuleiro();

		} while (!jg.isTerminado());

		// Verifica o fim do jogo1
		if (jg.isEmpate()) {
			System.out.println();
			System.out.println("Fim do Jogo - EMPATE!");
		} else {
			System.out.println();
			System.out.println("Fim do Jogo - O vencedor é ...");
			System.out.println(jg.getTurno());
		}

		teclado.close();
	}

}
