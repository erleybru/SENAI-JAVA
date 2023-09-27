package br.com.senaisp.erley.secao32;

public class Chicken02 {

	public static void main( String[] args ) {
        // Coloque o seu código aqui em baixo
		// calculando a média diária
		// colocando soma entre parenteses para evitar erro
		double mediaDiaria = (100.0 + 121.0 + 117.0) / 3.0;
		
		// a média mensal é o mesmo que a média diária vezes
		// 30 dia
		double mediaMensal = mediaDiaria * 30;
		
		// O lucro é a média mensal vezes R$ 0,18
		double lucroMensal = mediaMensal * 0.18;
		
		// Exibe os resultados
        System.out.println("Média diária: " +mediaDiaria);
        System.out.println("Média mensal: " +mediaMensal);
        System.out.println("Lucro mensal: R$" +lucroMensal);

	}
}
