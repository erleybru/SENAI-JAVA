package br.com.senaisp.erley.secao45exerc4;

import javax.swing.JOptionPane;

public class CalculoIMC {

	public static void main(String[] args) {
		double peso;
		double altura;
		double imc;
		
		// solicitar o peso da pessoa
		peso = Double.parseDouble(
				JOptionPane.showInputDialog("Informe o peso"));
		
		altura = Double.parseDouble(
				JOptionPane.showInputDialog("Informe a altura"));
		
		// calculo do IMC
		imc = peso / Math.pow(altura, 2);
		
		// mostrar resultado
		JOptionPane.showMessageDialog(null, "IMC = " + imc);
		
		if(imc < 18.5) {
			JOptionPane.showMessageDialog(null, "Você é magro pra caramba");
		} else {
			//		Entre 18,5 e 24,99	Peso normal
			if(imc >= 18.5 && imc <= 24.99) {
				JOptionPane.showMessageDialog(null, "Peso Normal");
			} else {
				//		Entre 25 e 29,99	Acima do peso
				if(imc >= 25 && imc <= 29.99) {
					JOptionPane.showMessageDialog(null, "Acima do peso");
				} else {
					JOptionPane.showMessageDialog(null, "Obsidade");
				}
			}
		}
		
	} // final do método main

} // final da classe
