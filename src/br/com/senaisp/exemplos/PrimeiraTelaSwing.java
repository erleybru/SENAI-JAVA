package br.com.senaisp.erley.primeiratela;
/*
 * Itens que vamos precisar hoje:
 * 
 * SQLite Studio - Portable
 * https://github.com/pawelsalawa/sqlitestudio/releases
 * 
 * SQLite JDBC Driver
 * https://repo1.maven.org/maven2/org/xerial/sqlite-jdbc/3.41.2.1/sqlite-jdbc-3.41.2.1.jar
 * 
 */

public class PrimeiraTelaSwing {

	public static void main(String[] args) {
		// Cria objeto para mostrar a tela
		JFrame frame = new JFrame();
		// define o titulo da janela
        frame.setTitle("Agenda Telefonica");
        //[Erley] Defina o icone da tela
        //[Erley] Defina os controles padroes Fechar, Maximizar, etc.
        
        //define o tamanho da janela em pixels
        // 800 pixels de largura
        // 600 pixels de altura
        frame.setSize(800, 600);
        // impede de que tela seja redimensionada
        frame.setResizable(false);
        // comando para centralizar a janela na tela do computador
        frame.setLocationRelativeTo(null);
        // torna a janela visivel
        frame.setVisible(true);	}
}
