package br.com.senaisp.erley.secao44;

import java.util.Random;

public class SorteandoInteiros {

	public static void main(String[] args) {
		Random sorteio = new Random();
		
		System.out.println("Menor inteiro:" + Integer.MIN_VALUE);
		System.out.println("Maior valor Inteiro:" + Integer.MAX_VALUE);
/*		// sorteia um numero inteiro
		System.out.println("1º sorteio: " + Math.abs(sorteio.nextInt()));
		System.out.println("2º sorteio: " + Math.abs(sorteio.nextInt()));
		System.out.println("3º sorteio: " + Math.abs(sorteio.nextInt()));
		System.out.println("4º sorteio: " + Math.abs(sorteio.nextInt()));
		System.out.println("5º sorteio: " + Math.abs(sorteio.nextInt()));
*/		
		// gerar numero inteiro entre 0 e um numero qualquer
		System.out.println("5º sorteio: " + sorteio.nextInt(200));
		
		
		
		
		
		
		
		
	} // final do método main

} // final da classe SorteandoInteiros
