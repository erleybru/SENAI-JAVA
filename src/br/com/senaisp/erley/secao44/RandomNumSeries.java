package br.com.senaisp.erley.secao44;

import java.util.Random;

public class RandomNumSeries {

	public static void main(String[] args) {
		// Instancia a classe Random
		Random num = new Random();
		
		System.out.println("Número aleatório 1: " + num.nextInt(5));
		System.out.println("Número aleatório 2: " + num.nextInt(5));
		System.out.println("Número aleatório 3: " + num.nextInt(5));
		System.out.println("Número aleatório 4: " + num.nextInt(5));
		System.out.println("Número aleatório 5: " + num.nextInt(5));
		
		System.out.println("Arredonda: " + Math.max(0, -15));
		
	} // fim do método main

} // fim da classe RandomNumSeries
