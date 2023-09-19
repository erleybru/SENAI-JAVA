package br.com.senaisp.exemplos.parte1;

public class Gerente {
	private String nome; // já tem na Classe Funcionario
	private String cpf; // já tem na Classe Funcionario
	private double salario; // já tem na Classe Funcionario
	private int senha;
	private int numeroDeFuncionariosGerenciados;

	// construtor
	public Gerente() {
		// vou colocar um valor padrao na senha
		this.senha = 8888;
	}
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Permitido!");
			return true;
		} else {
			System.out.println("Acesso Negado!");
			return false;
		}
	}
	
	// Mais métodos aqui
}
