package br.com.senaisp.erley.desafio.versao1;

public class Classificacao {

	public static void main(String[] args) {
		int[] vetor = {23, 7, 3, 8, 1};
		int auxilaTroca;
		
		System.out.println("Vetor desorganizado");
		
		for(int i=0; i < 5; i++) {
			System.out.println(vetor[ i ]);
		}
		
		System.out.println("Iniciando a classificação");
		
		for(int i = 0; i < 5; i++) {
			for(int k = 0; k < 4; k++) {
				if(vetor[k] > vetor[ k + 1]) {
					auxilaTroca = vetor[k];
					vetor[k] = vetor[k+1];
					vetor[k+1] = auxilaTroca;
				}
			}
		}
		
		System.out.println("Vetor classificado pelo método Bobble Sort");

		for(int i=0; i < 5; i++) {
			System.out.println(vetor[ i ]);
		}

	}

}
