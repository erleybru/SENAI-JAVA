package br.com.senaisp.erley.jogodavelhawing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JogoVelha extends JFrame {
	// criando constantes que serão usadas no jogo
	private static final String JOGADOR_O = "O";
	private static final String JOGADOR_X = "X";

	// criando os campos (ou propriedadas) desta classe
	// Encapsulamento (uso do private)
	JButton[] botao = new JButton[9];
	private boolean terminado; // se o jogo terminou
	private boolean empate; // se deu empate (velha)
	private int turno; // de quem é a vez
	// controla onde ja foi jogado
	boolean[] click = new boolean[9];

	/**
	 * Coloquei porque o Eclipse solicitou
	 */
	private static final long serialVersionUID = 1L;

	/*
	 * construtor Ira montar a janela grafica (tabuleiro) para o jogo
	 */
	public JogoVelha() {
		setTitle("Jogo da Velha GUI - Usando Swing");
		setDefaultCloseOperation(3);
		setSize(420, 500);
		setResizable(false);
		setLocationRelativeTo(null);
		// desligar o layout padrao
		setLayout(null);
		// utilizando for para alterar as propriedades/campos dos objetos JButton
		int indice = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				botao[indice] = new JButton();
				botao[indice].setBounds((100 * i) + 50, (100 * j) + 50, 95, 95);
				botao[indice].setFont(new Font("Arial", Font.BOLD, 40));
				add(botao[indice]);
				indice++;
			}
		}
		// coloca false para as nove posições de jogo
		for (int i = 0; i < 9; i++) {
			click[i] = false;
		}
		setVisible(true);
		// Define um listner para identificar quando botao for clicado e executar uma
		// ação
		// botao 1
		botao[0].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (!click[0]) {
					click[0] = true;
					registrarJogada(botao[0]);
				}
			}
		});
		// botao 2
		botao[1].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (!click[1]) {
					click[1] = true;
					registrarJogada(botao[1]);
				}
			}
		});
		// botao 3
		botao[2].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (!click[2]) {
					click[2] = true;
					registrarJogada(botao[2]);
				}
			}
		});
		// botao 4
		botao[3].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (!click[3]) {
					click[3] = true;
					registrarJogada(botao[3]);
				}
			}
		});
		// botao 5
		botao[4].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (!click[4]) {
					click[4] = true;
					registrarJogada(botao[4]);
				}
			}
		});
		// botao 6
		botao[5].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (!click[5]) {
					click[5] = true;
					registrarJogada(botao[5]);
				}
			}
		});
		// botao 7
		botao[6].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (!click[6]) {
					click[6] = true;
					registrarJogada(botao[6]);
				}
			}
		});
		// botao 8
		botao[7].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (!click[7]) {
					click[7] = true;
					registrarJogada(botao[7]);
				}
			}
		});
		// botao 9
		botao[8].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (!click[8]) {
					click[8] = true;
					registrarJogada(botao[8]);
				}
			}
		});

	} // final do método construtor desta classe

	public boolean isTerminado() {
		return terminado;
	}

	public boolean isEmpate() {
		return empate;
	}

	public String getTurno() {
		return turno == 0 ? "Jogador " + JOGADOR_O : "Jogador " + JOGADOR_X;
	}

	public int quantasJogadasFatam() {
		int quantidade = 0;

		// Cadê as chaves do comando for?
		for (int i = 0; i < click.length; i++)
			if (click[i] == false)
				quantidade++; // Veja que para um unico comando NÃO PRECISA de chaves no IF

		return quantidade;
	}

	// seleciona o outro jogador
	public void registrarJogada(JButton btn) {
		if (turno == 0) {
			btn.setText(JOGADOR_O);
		} else {
			btn.setText(JOGADOR_X);
		}
		// verifica se alguem ganhou
		// Jogador O
		terminado = checarVitoria(JOGADOR_O);
		// Jogador X
		if(!terminado)terminado = checarVitoria(JOGADOR_X);
		
		// ninguem ganhou, então verifique se deu empate
		if (!terminado) {
			// verifica se ainda tem jogadas
			if (quantasJogadasFatam() == 0) {
				// termina partida
				terminado = true;
				empate = true;
			}
		}
		// O jogo acabou. Pode ser por empate,ou alguem ganho
		if (terminado) {
			String msg="";
			if(isEmpate()) {
				// exibe mensagem de empate
				msg = "EMPATOU!!!! ";
			} else {
				msg = "Ganhador " + getTurno();
			}
			JOptionPane.showMessageDialog(null, msg, "Resultado", JOptionPane.INFORMATION_MESSAGE + JOptionPane.OK_OPTION);				
			// cancela jogadas restantes
			desativaJogo();
		} else {
			// trocar o jogador
			turno = ((turno + 1) % 2);
		}

	}

	public boolean checarVitoria(String jogador) {
		// LINHAS
		// 1ª linha
		terminado = botao[0].getText() == jogador && botao[1].getText() == jogador && botao[2].getText() == jogador;
		// 2ª linha
		terminado = terminado || (botao[3].getText() == jogador && botao[4].getText() == jogador && botao[5].getText() == jogador);
		// 3º linha
		terminado = terminado || (botao[6].getText() == jogador && botao[7].getText() == jogador && botao[8].getText() == jogador);

		// COLUNAS
		// 1ª coluna
		terminado = terminado || (botao[0].getText() == jogador && botao[3].getText() == jogador && botao[6].getText() == jogador);
		// 2ª coluna
		terminado = terminado || (botao[1].getText() == jogador && botao[4].getText() == jogador && botao[7].getText() == jogador);
		// 3ª coluna
		terminado = terminado || (botao[2].getText() == jogador && botao[5].getText() == jogador && botao[8].getText() == jogador);
		// DIAGONAIS
		// 1ª diagonal
		terminado = terminado || (botao[0].getText() == jogador && botao[4].getText() == jogador && botao[8].getText() == jogador);
		// 2ª diagonal
		terminado = terminado || (botao[2].getText() == jogador && botao[4].getText() == jogador && botao[6].getText() == jogador);

/*		// LINHAS
		// 1ª linha
		terminado = terminado || (botao[0].getText() == "X" && botao[1].getText() == "X" && botao[2].getText() == "X");
		// 2ª linha
		terminado = terminado || (botao[3].getText() == "X" && botao[4].getText() == "X" && botao[5].getText() == "X");
		// 3º linha
		terminado = terminado || (botao[6].getText() == "X" && botao[7].getText() == "X" && botao[8].getText() == "X");

		// COLUNAS
		// 1ª coluna
		terminado = terminado || (botao[0].getText() == "X" && botao[3].getText() == "X" && botao[6].getText() == "X");
		// 2ª coluna
		terminado = terminado || (botao[1].getText() == "X" && botao[4].getText() == "X" && botao[7].getText() == "X");
		// 3ª coluna
		terminado = terminado || (botao[2].getText() == "X" && botao[5].getText() == "X" && botao[8].getText() == "X");
		// DIAGONAIS
		// 1ª diagonal
		terminado = terminado || (botao[0].getText() == "X" && botao[4].getText() == "X" && botao[8].getText() == "X");
		// 2ª diagonal
		terminado = terminado || (botao[2].getText() == "X" && botao[4].getText() == "X" && botao[6].getText() == "X"); */
		return terminado;
	} // final do metodo checharVitoria

	// desativa novas jogadas
	public void desativaJogo() {
		// coloca false para as nove posições de jogo
		for (int i = 0; i < 9; i++) {
			click[i] = true;
		}
	} // final no metodo desativa jogo

} // classe
