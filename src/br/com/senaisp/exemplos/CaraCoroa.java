package br.com.senaisp.erley.secao44;

// importa a classa Random para sortear numeros
import java.util.Random;

// Cria a classe DRIVER CaraCoroa
public class CaraCoroa {

	// cria o método main (onde o java inicia a execuacao)
	public static void main(String[] args) {
		// instancia (CRIA) o objeto sorteio da classe Random
		Random sorteio = new Random();
		
		// manda sortear um numero double e guarda na variavel 
		// local numero
		double numero = sorteio.nextDouble();
		
		// exibe na tela o numero sorteado
		System.out.println("Número sorteado: " + numero);
		
		// faz o teste lógico (expressao) para decidir
		// se mostra CARA ou COROA conforme solicitado no slide 13
		// da secao JFo 4-4
		if(numero < 0.5) {
			System.out.println("Deu CARA");
		} else {
			System.out.println("Deu COROA");
		} // final do comando IF

	} // final do método main

} // final da classe CaraCoroa
