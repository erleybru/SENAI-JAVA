package br.com.senaisp.exemplos.csv;

//importar pacote com classe para trabalhar com arquivos no Java
import java.io.File;

//importar pacote com classe para lançar excessão de arquivo nao encontrado
import java.io.FileNotFoundException;

//importar pacote com classe Scanner
import java.util.Scanner;

public class LendoArqCSV {

	public static void main(String[] args) {
		// define onde e com que nome o arquivo csv esta
		// coloque o nome e local do seu arquivo
		// estou usando duas barras invertidas por causa dos caracters de escape.
		// Lembram-se?
		String nomeArquivoCSV = "C:\\Users\\Erley\\Downloads\\arquivoCSVexemplo.csv";

		// cria variavel da classe File para acessar o arquivo
		File arquivo = new File(nomeArquivoCSV);

		// cria variavel da classe Scanner para ler o arquivo
		/*
		 * o Java vai reclamar que eu não estou tratando a possivel exceção quando o
		 * arquivo informado não existir. Vou criar uma nova classe tratando esta
		 * excessão. Observação: Excessões foram explicadas no item JF 7 do curso. Se
		 * precisa releiam
		 */
		try {
			Scanner arquivoEntradaDados = new Scanner(arquivo);
			arquivoEntradaDados.useDelimiter(";"); // Separador/delimitador

			// loop para ler todos as linhas (registros) do arquivo
			while (arquivoEntradaDados.hasNext()) {
				// le uma linha por vez
				String registro = arquivoEntradaDados.next();
				// criar um array chamado campos contendo como elementos os valores da linha
				// um valor para cada ponto e virgula
				String[] campos = registro.split(";");
				// exibe o dado na tela
				// Para exibir irei utilizar o for-each
				for (String campoMostrar : campos) {
					System.out.print(campoMostrar + "|");
				}
			} // final do loop while
			
			// depois de terminar a leitura do arquivo devemos fechar a variavel da classe
			// Scanner
			arquivoEntradaDados.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} // final do try-catch
	} // final do método main
} // final da classe LendoArqCSV
