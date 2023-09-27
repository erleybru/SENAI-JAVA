package br.com.senaisp.erley.desafio.calculo;

import java.util.Scanner;

public class Retangulo {
	// campo para receber a base do retangulo
	private double base;
	// campo para receber a altura do retangulo
	private double altura;
	
	// Construtor da Classe retangulo
	public Retangulo(double baseRetangulo, double alturaRetangulo) {
		// atribue o valor recebido ao campo chamado "base"
		this.base = baseRetangulo;
		// atribue o valor recebido ao campo chamado "altura"
		this.altura = alturaRetangulo;
	}
	
	// calcula a área do retangulo
	public double area() {
		return base * altura;
	}
	
	// calcula o perimetro do retangulo
	public double perimetro() {
		return 2 * base + 2 * altura;
	}
	
	// calcula a diagona do retangulo
	public double diagona() {
		// utilizando o método sqrt da classe Math 
		// para calcular a raiz quadrada
		return Math.sqrt(base * base + altura * altura);
	}
	
	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);
		double base, altura;
		
		System.out.println("Calcular dados de um retângulo");
		
		System.out.println("Informe o comprimento da base:");
		base = dados.nextDouble();
		
		System.out.println("Informe o comprimento da altura:");
		altura = dados.nextDouble();
		
		dados.close();
		System.out.println("================================");
		
		Retangulo retangulo = new Retangulo(base, altura);
				
		System.out.println("Área: " + retangulo.area());
		System.out.println();
		System.out.println();
	}

}
