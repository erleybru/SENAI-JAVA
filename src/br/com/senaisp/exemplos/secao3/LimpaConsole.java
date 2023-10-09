package br.com.senaisp.exemplos.secao3;

import java.io.IOException;
import java.util.Scanner;

public class LimpaConsole {

	public static final String ANSI_RESET = "\u001B[0m";
	public static final String PRETO = "\u001B[30m";
	public static final String VERMELHO = "\u001B[31m";
	public static final String VERDE = "\u001B[32m";
	public static final String AMARELO = "\u001B[33m";
	public static final String AZUL = "\u001B[34m";
	public static final String ROXA = "\u001B[35m";
	public static final String CIANO = "\u001B[36m";
	public static final String BRANCO = "\u001B[37m";
	// Cores para o fundo
	public static final String FUNDO_PRETO = "\u001B[40m";
	public static final String RED_BACKGROUND = "\u001B[41m";
	public static final String GREEN_BACKGROUND = "\u001B[42m";
	public static final String YELLOW_BACKGROUND = "\u001B[43m";
	public static final String BLUE_BACKGROUND = "\u001B[44m";
	public static final String PURPLE_BACKGROUND = "\u001B[45m";
	public static final String CYAN_BACKGROUND = "\u001B[46m";
	public static final String FUNDO_BRANCO = "\u001B[47m";

	public static void main(String[] args) throws IOException, InterruptedException {
		Scanner scanner = new Scanner(System.in);
		System.out.println(BLUE_BACKGROUND + BRANCO + "Teste");
		String texto = scanner.next();

		// Limpa a tela no windows, no linux e no MacOS
		if (System.getProperty("os.name").contains("Windows"))
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		else
			Runtime.getRuntime().exec("clear");
		// exibe o texto que foi digitado
		System.out.println(texto);

		// fecha o objeto scanner que está em uso
		scanner.close();
	} // final do método main

} // final da classe LimpaConsole
