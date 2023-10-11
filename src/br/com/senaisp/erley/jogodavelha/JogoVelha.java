package br.com.senaisp.erley.jogodavelha;

public class JogoVelha {
	// criando constantes que serão usadas no jogo
	private static final char JOGADOR_O = 'O';
	private static final char JOGADOR_X = 'X';
	private static final char AREA_VAZIA = '_';

	// criando os campos (ou propriedadas) desta classe
	// Encapsulamento (uso do private)
	private String tabuleiro;
	private boolean terminado; // se o jogo terminou
	private boolean empate; // se deu empate (velha)
	private int turno; // de quem é a vez

	/*
	 * Criando o contrutor padrão da classe para inicia-la
	 */
	public JogoVelha() {
		this.tabuleiro = (AREA_VAZIA + "").repeat(9);
		this.terminado = false;
		this.empate = false;
		this.turno = 0;
	}

	public boolean isTerminado() {
		return terminado;
	}

	public boolean isEmpate() {
		return empate;
	}

	public String getTurno() {
		// teste ternario
		return turno == 0 ? "Jogador O" : "Jogador X";
	}

	// metodo mostrar o tabuleiro
	// O Eclipse me sugeriu lancar estas duas exceções por causa dos comando que utilizei
	// para limpar a tela  throws IOException, InterruptedException
	public void mostrarTabuleiro() {

		System.out.println("  1 2 3");
		System.out.print("1 ");

		for (int car = 0; car < 9; car++) {
			// fazendo o teste para a quebra de linha
			if (car % 3 == 0 && car > 0) { // 0 1 2
				System.out.println(); // 3 4 5
				System.out.print((car / 3 + 1) + " "); // 6 7 8
			}
			// exibe o caracter que está no tabuleiro
			System.out.print(tabuleiro.charAt(car));
			// Exibe o pipe apenas para as colunas 1 e 2
			if (car % 3 < 2) {
				System.out.print("|");
			}
		}
	}

	public void efetuarJogada(int lin, int col) {
		// Calcula a posicao
		int pos = (lin - 1) * 3 + (col - 1);
		if (tabuleiro.charAt(pos) == AREA_VAZIA) {
			// pode realizar a jogada
			tabuleiro = tabuleiro.substring(0, pos) + (turno == 0 ? JOGADOR_O : JOGADOR_X)
					+ tabuleiro.substring(pos + 1);
			String t = tabuleiro; // para ficar mais facil de digitar o texto

			// Verificar se está terminado o jogo
			/*
			 * 0 1 2 3 4 5 6 7 8
			 */
			// testando as linhas
			terminado = t.charAt(0) == t.charAt(1) && t.charAt(1) == t.charAt(2) && t.charAt(0) != AREA_VAZIA;
			terminado = terminado
					|| (t.charAt(3) == t.charAt(4) && t.charAt(4) == t.charAt(5) && t.charAt(3) != AREA_VAZIA);
			terminado = terminado
					|| (t.charAt(6) == t.charAt(7) && t.charAt(7) == t.charAt(8) && t.charAt(6) != AREA_VAZIA);
			// testando as colunas
			terminado = terminado
					|| (t.charAt(0) == t.charAt(3) && t.charAt(3) == t.charAt(6) && t.charAt(0) != AREA_VAZIA);

			terminado = terminado
					|| (t.charAt(1) == t.charAt(4) && t.charAt(4) == t.charAt(7) && t.charAt(1) != AREA_VAZIA);
			terminado = terminado
					|| (t.charAt(2) == t.charAt(5) && t.charAt(5) == t.charAt(8) && t.charAt(2) != AREA_VAZIA);
			// testando as diagonais
			terminado = terminado
					|| (t.charAt(0) == t.charAt(4) && t.charAt(4) == t.charAt(8) && t.charAt(0) != AREA_VAZIA);
			terminado = terminado
					|| (t.charAt(2) == t.charAt(4) && t.charAt(4) == t.charAt(6) && t.charAt(2) != AREA_VAZIA);
			// se não terminou o jogo, mude o turno ou seja passa a vez
			if (!terminado) {
				turno = ((turno + 1) % 2);
				// verifica se ainda tem casas vazias. Se não houver, entao deu empate
				if (t.indexOf(AREA_VAZIA) == -1) {
					terminado = true;
					empate = true;
				}
			}
		} else {
			System.out.println();
			System.out.println("Posição ocupada, escolha outra");
		}
	}

} // final da classe JogoVelha
