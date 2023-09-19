//Este é o pacote que usamos para organizar o codigo e manter separado
//Costumamos usar um site escrito de forma invertida
package br.com.senaisp.exemplos.parte2;

//Criação de uma classe para representar um funcionario
public class Funcionario {
	// Criação do campos e/ou proepriedades
	
	// O encapsulamento visa garantir que campos d métodos se mantenha
	// invisíveis
	
	/*
	 * Criação dos campos (propriedades). Para mantê-los invisíveis
	 * iniciamos com a palavra chave "private"
	 */
	private String nome; // Lembre-se da regra camelCase para nomes
	private String cpf;
	private int matricula;
	private double salario;
	
	// daqui para baixo definimos os métodos (as ações)
	
	
	// Método construtor
	// Construtor padrão
	
	public Funcionario() {
		// Não tem nada mesmo
	}
	
	
	
	// estão lembrados da regra do "camelCase" para nomes de metodos, variaveis e campos?
	
	// Permitir que outras classes tenham acesso ao nome do funcionario
	public String getNome() {
		return this.nome; // o "this." não é necessário neste caso
	}
	
	// Permitir que se possa alterar o nome do funcionario
	public void setNome(String nome) {
		/* aqui o this é o obrigatório pois usei o nome
		 * no parametro que o nome do campo. O Java nao saberia
		 * o que você quer fazer. Se colocar o que veio no parametro 
		 * no campo ou vice-versa
		 */
		this.nome = nome;  
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
