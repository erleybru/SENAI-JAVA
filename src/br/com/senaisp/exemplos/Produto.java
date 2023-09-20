
public class Produto {
	// Declarações de campos de instância
	private String nomeProduto;
	private double preco;
	private int quantidade;
	private int numeroItem;
	
	/**
	 * Construtor da classe Produto
	 * Lança valores iniciais para os campos da instancia
	 * Autor: Erley Barbosa
	 * Versão: 05-09-2023
	 */
	public Produto() {
		numeroItem = 0;
		nomeProduto = "";
		preco = 0;
		quantidade = 0;
	} // final do construtor da classe
	
	/** 
	 * Construtor da classe Produto 
	 * passando os valores para o construtor
	 * Autor: Erley Barbosa da Silva
	 * Versao: 05-09-2023
	 */
	public Produto(String nomeProduto, int numero, int quantidade, double preco) {
		this.nomeProduto = nomeProduto;
		this.numeroItem = numero;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	/**
	 * @return the nomeProduto
	 */
	public String getNomeProduto() {
		return nomeProduto;
	}

	/**
	 * @param nomeProduto the nomeProduto to set
	 */
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	/**
	 * @return the preco
	 */
	public double getPreco() {
		return preco;
	}

	/**
	 * @param preco the preco to set
	 */
	public void setPreco(double preco) {
		this.preco = preco;
	}

	/**
	 * @return the quantidade
	 */
	public int getQuantidade() {
		return quantidade;
	}

	/**
	 * @param quantidade the quantidade to set
	 */
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	/**
	 * @return the numeroItem
	 */
	public int getNumeroItem() {
		return numeroItem;
	}

	/**
	 * @param numeroItem the numeroItem to set
	 */
	public void setNumeroItem(int numeroItem) {
		this.numeroItem = numeroItem;
	}
	
	// modificar metodo toString herdado
	public String toString() {
		return "\nProduto       :" + this.nomeProduto +
	           "\nCódigo        :" + this.numeroItem +
	           "\nQuantidade    :" + this.quantidade +
	           "\nPreço         :" + this.preco;
	} // final do metodo toString
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
} // final da classe Produto
