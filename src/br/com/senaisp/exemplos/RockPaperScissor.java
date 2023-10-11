package br.com.senaisp.erley.flipcoin;

import java.util.Random;

public class RockPaperScissor {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		int sorteio = aleatorio.nextInt(2);
		System.out.println(sorteio);
/*		if(sorteio == 0) {
			System.out.println("Pedra");
		}
		if(sorteio == 1) {
			System.out.println("Papel");
		}
		if(sorteio == 2) {
			System.out.println("Tesoura");
		} */
		switch(sorteio) {
		case 0:
			System.out.println("Pedra");
			break;
		case 1:
			System.out.println("Papel");
			break;
		case 2:
			System.out.println("Tesoura");
			break;
		}
	}

}
