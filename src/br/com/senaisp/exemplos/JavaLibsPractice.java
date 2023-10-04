package br.com.senaisp.erley.javalibspractice;

import javax.swing.JOptionPane;

public class JavaLibsPractice {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Entre com seu nome");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Entre com a sua idade"));
        String localMoradia = JOptionPane.showInputDialog("Entre com um lugar");
        double distancia = Double.parseDouble(JOptionPane.showInputDialog("Entre com um valor decimal entre 0 e 10"));
        String comida = JOptionPane.showInputDialog("Entre um tipo de comida");
        String animal = JOptionPane.showInputDialog("Qual é o seu animal preferido?");
        String parteCorpo = JOptionPane.showInputDialog("Informe uma parte do corpo");
        String condicao = JOptionPane.showInputDialog("Entre condição médica");
        String bebida = JOptionPane.showInputDialog("Entre com o seu tipo de bebida preferida");
        int duracao = Integer.parseInt(JOptionPane.showInputDialog("Entre um número entre 2 e 14"));
        
        // Exibe o diálogo na tela
        JOptionPane.showMessageDialog(null,"Olá! " + nome + " você tem " + idade + " e mora em " + localMoradia + ".\n"
            +"No próximo ano " + nome + " irá fazer "+  (idade+1) +" anos de idade."
            +" A loja mais próxima da sua casa fica a "+ distancia+" quilometros de distancia, \n "
            +"Então você precisa se locomover "+(distancia*2)+ " quilometros para comprar " + comida +"!\n"
            +nome+" tem um "+ animal + " para companhia.\n"
            +"Um dia, "+nome+" desenvolveu " + condicao+" no(a) "+ parteCorpo +".\n"
            +"O médico prescreveu beber "+bebida+" todos os dias por "+duracao +" dias!");
            //JOptionPane.INFORMATION_MESSAGE);
    } // final do método main
} // final da classe
