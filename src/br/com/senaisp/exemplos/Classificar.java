package br.com.senaisp.erley.classificar;

public class Classificar {

	public static void main(String[] args) {
		// carregar os valores em um vetor (array)
		int[] valores = {100, 150, 300, 25, 77, 500, 18, 20};
		int auxiliar;
		
		// loop para ordenar TODOS os valores
		// serão dois loops. O de fora é para garantir que 
		// passou por todos os elementos do vetor.
		for(int i=0; i < valores.length; i++) {
			for(int j=0; j < valores.length-1; j++) {
				if(valores[j] > valores[j+1]) {
					/* A variavel auxiliar server para guardar o valor 
					 * enquanto fazemos a trocar de valores entre os
					 * elementos do vetor 
					 */
					auxiliar = valores[j];
					// coloca o valor do proximo elemento no vetor para indice indicado por "j"
					valores[j] = valores[j+1];
					// coloca o valor que guardmos em "auxiliar" no elemento
					// j+1 do vetor
					valores[j+1] = auxiliar;
				}
			}
		}
		System.out.println("Números em ordem crescente");
		// exibe os numeros em ordem crescente. Desta vez eu
		// não vou pular linha
//		for(int numero : valores) {
//			System.out.print(numero + ", ");
//		}
		for(int k=0; k < valores.length; k++) {
			if(k != 0) {
				System.out.print(", ");
			}
			System.out.print(valores[k]);
			if(k == (valores.length-1)) {
				System.out.println(".");
			}
		}
	}
}





