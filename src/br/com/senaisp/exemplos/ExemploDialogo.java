package br.com.senaisp.erley.exerciciosecao35;

import javax.swing.JOptionPane;

public class ExemploDialogo {

	public static void main(String[] args) {
		/*
		 * ERROR_MESSAGE          // icone de erro
			INFORMATION_MESSAGE   // icone de informação
			WARNING_MESSAGE		  // icone de advertencia
			QUESTION_MESSAGE	  // icone de questionamento
			PLAIN_MESSAGE		  // mensagem apenas
		 */
		String string = (String)JOptionPane.showInputDialog(
				null, 
				"Esta é a pergunta", 
				"Titulo do diálogo",
				JOptionPane.INFORMATION_MESSAGE,
				null,
				null,
				"Aparece no textbox"
				); 
		
		// segundo dialogo
		// Exemplo da criacao do vetor/array com as respostas
		/* String[] resposta = new String[4];
		resposta[0] = "Sim";
		resposta[1] = "Não";
		resposta[2] = "Pode ser";
		resposta[3] = "Quem sabe"; */
		// Exemplo em um unica linha
		String[] resposta = {"Sim", "Não", "Pode ser", "Quem sabe"};
		string = (String)JOptionPane.showInputDialog(
				null,
				"O São Paulo será campeão?", 
				"Dúvida",
				JOptionPane.INFORMATION_MESSAGE,
				null,
				resposta,
				resposta[0]
				);
	} // final do metodo main
} // final da classe









