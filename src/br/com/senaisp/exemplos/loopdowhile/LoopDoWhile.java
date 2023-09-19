package br.com.senaisp.exemplos.loopdowhile;

public class LoopDoWhile {

	public static void main(String[] args) {
		int i = 11;
		
		// executa o bloco de codigo PELO MENOS 1 vez
		do {
			System.out.println("Valor de i = " + i);
			i++;
		} while(i <= 10);
		// só executará uma vez pois a variavel local i valor 11
	}

}
