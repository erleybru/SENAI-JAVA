package br.com.senaisp.exemplos.testelogico;

public class TestesLogicos {

	public static void main(String[] args) {
		// criar variaveis locais
		int numero1 = 100;
		String resultado;
		
		// testar expressao com IF (SE)
		if(numero1 > 10) {
			// o Java entra aqui para executar este bloco de código se 
			// o resultado da expressao for VERDADEIRO (TRUE em inglês)
			System.out.println(numero1 + "_é maior do que 10.");
		}
		
		// Outro teste
		if(numero1 == 100) {
			// o Java entra aqui para executar este bloco de código se 
			// o resultado da expressao for VERDADEIRO (TRUE em inglês)
			System.out.println(numero1 + "_é igual 100.");			
		} else {
			System.out.println("os numeros são diferentes!");
		}
		
		// Operador Ternario. Um IF diferentão
		resultado =  numero1 == 100 ? "igual" : "diferente"; // Não precisa ser strings
		System.out.println("O valor de numero1 é " + resultado);

	}

}
