
public class ProdutoTester {

	public static void main(String[] args) {
		Produto produto1 = new Produto();
		produto1.setNumeroItem(1001);
		produto1.setNomeProduto("Lápis");
		produto1.setQuantidade(15);
		produto1.setPreco(3.50);

		Produto produto2 = new Produto();
		produto2.setNumeroItem(1002);
		produto2.setNomeProduto("Caneta azul");
		produto2.setQuantidade(15);
		produto2.setPreco(3.50);
		
		// criar um novo objeto passando os dados para o método
		// construtor
		Produto p3 = new Produto("Caderno ", 3, 1, 30);
		Produto p4 = new Produto("Lapiseira", 5, 1, 25);
		Produto p5 = new Produto("Apontador", 8, 1, 5);
		Produto p6 = new Produto("Grampeador", 15, 1, 15);
		
		System.out.println(produto1);
		System.out.println(produto2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		System.out.println(p6);
	}

}
