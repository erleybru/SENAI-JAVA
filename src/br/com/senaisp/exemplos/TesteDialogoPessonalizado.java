package br.com.senaisp.erley.exerciciosecao35;

// precisa importar o pacote do JOptionPane
import javax.swing.JOptionPane;

// criando a classe
public class TesteDialogoPessonalizado {

  // metodo que executa o codigo
	public static void main(String[] args) {
    // sao as opções do botao. Note que usei a classe Object
		Object[] options = { "SENAI" };
    // Exibe informação na tela
		JOptionPane.showOptionDialog(null, "Mensage linha 1\nMensagem linha 2\nMensagem linha 3", "Matrícula Cancelada",
		             JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
		             null, options, options[0]);	
  } // final do metodo main
} // final da classe
