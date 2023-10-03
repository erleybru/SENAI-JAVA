package br.com.senaisp.erley.exerciciosecao35;

// importar o pacote da classe JOptionPane
// Esta classe abre uma janela de dialogo para solicitar uma
// string
import javax.swing.JOptionPane;

public class Input01 {
    public static void main(String[] args) {
        // Cria uma variável do tipo String para receber o que o 
    	// usuário vai digitar
        String entrada;
        // Atribui o valor digitado à variável String chamada 
        // entrada
        entrada = JOptionPane.showInputDialog("Digite um numero:");
        
        // Mostra/imprime na tela da console o valor digitado
        System.out.println("Você digitou: " + entrada);
        
        // Faz o Parse da String (converte texto para número)
        // digitada para um tipo int.
        // Soma 1 ao valor digitado e mostra na tela da console
        System.out.println(Integer.parseInt(entrada)+1);
        
        
        
        // Cria uma variavel inteira e atribui o valor digitado a ela
        // como é uma string ela necessita que seja realizado um parse
        // parse é a conversão de um texto em número.
        int valor = Integer.parseInt(
        		JOptionPane.showInputDialog("Digite o numero:")
        		);
        
        // mostra na tela da console o valor digitado
        System.out.println(valor);
    }
}
