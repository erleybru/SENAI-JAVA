package br.com.senaisp.erley.secao42;

import javax.swing.JFrame;

public class JanelaBasica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame janela = new JFrame("Meu primeiro frame em Java");
		janela.setSize(300,200);
		janela.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		janela.setVisible(true);
	}

}
