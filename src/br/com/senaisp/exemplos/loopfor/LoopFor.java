package br.com.senaisp.exemplos.loopfor;

public class LoopFor {

	public static void main(String[] args) {
		// Loop FOR é usando quando se tem um numero deterninado de
		// iteracoes
		// Por exemplo. vai executar o bloco de código 5.
		for(int i=0; i < 5; i++) {
			// aqui podem haver dezenas de linhas de código que
			// serão executadas enquanto a expressão "i < 5" resultar
			// em VERDADEIRO
			System.out.println("Passou aqui " + (i+1) + " vez."); // Olha! Eu utilizei uma expressão "i+1" aqui
		}
	}

}
