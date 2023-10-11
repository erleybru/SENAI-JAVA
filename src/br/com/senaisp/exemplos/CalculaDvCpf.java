package br.com.senaisp.erley.cpf;

import java.util.Scanner;

public class CalculaDvCpf {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o CPF:");
		// Pega o CPF numa string/literal
		String numeroCPF = teclado.next();
		
		// chega se tem 11 digitos
		if(numeroCPF.length() != 11) {
			System.out.println("CPF deve ser digitado com 11 digitos");
			System.out.println("Programa encerrado!");
			// Encerra o programa aqui
			System.exit(0);
		}
		char digito10, digito11;
		// calcular o primeiro digito verificador do CPF
		int peso = 10; // usada para multiplicar cada digito do CPF
		int soma = 0;  // acumulador das multiplicações
		int resto;     // ira guardar o resto da divisão da soma por 11
		String digitoVerificador = ""; // vazio porque vou colocar os digitos aqui
		int digito;
		int digito1; // guardar o 
		int digito2;
		for(int i = 0; i < 9; i++) {
			// pegar o digito do CPF
			// necessario fazer casting porque na conversao 
			// para inteiro vem o codigo ASCII do digito e nao
			// o seu valor
			digito = (int)(numeroCPF.charAt(i) - 48);
			soma += digito * peso;
			peso--;
		} // final do for
		resto = soma % 11;
		if(resto < 2) {
			resto = 11;
		} // final do if
		digito1 = 11 - resto;
		digito10 = (char)(digito1 + 48);

		
		// final do calculo do primeiro digito
		
		// inicio do calculo do SEGUNDO digito
		soma = 0;
		peso = 11;
		for(int i = 0; i < 9; i++) {
			digito = (int)(numeroCPF.charAt(i) - 48);
			soma += digito * peso;
			peso--;
		} // final do for
		soma += digito1 * 2;
		// pega o resto da divisão da soma por 11
		resto = soma % 11;
		// se o resto for ZERO ou 1 daria dois digito e para
		// evitar isto eu vou colocar o numero 11 quando isso 
		// ocorrer.
		if(resto < 2) {
			resto = 11;
		} // final do if
		digito2 = 11 - resto;
		digito11 = (char)(digito2 + 48);
		
		// comparar os digitos calculados são iguais usando metodos
		// da classe String
		if ((digito10 == numeroCPF.charAt(9)) && (digito11 == numeroCPF.charAt(10))) {
			System.out.println("O CPF digitado está correto");
		} else {
			System.out.println("O CPF digitado é inválido!");
		}
		
		teclado.close();
	}

}
