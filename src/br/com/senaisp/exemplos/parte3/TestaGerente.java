package br.com.senaisp.exemplos.parte3;

public class TestaGerente {
	// Esta é uma classe Driver porque tem um método main
	public static void main(String[] args) {
		// instanciando um objeto da classe Gerente
		Gerente gerente = new Gerente();
		
		// veja que por ser uma classe filha da classe funcionario
		// temos acesso aos metodos dela tambem
		gerente.setMatricula(1001);
		gerente.setNome("Erley da Silva");
		
		// vamos definir uma senha para o gerente
		gerente.setSenha(4321);
		
		// vamos ver se consegue autenticar (verificar a senha)
		gerente.autentica(4321);
		
		// o que apareceu no Console?
	}
}
