package br.com.senaisp.erley.secao32;

public class Chickens01 {

	public static void main(String[] args) {
		// aqui é a quantidade de galinhas
		int chickenCount = 0;
		// aqui é a quantidade de ovos que cada galinha bota por dia
		int eggsPerChicken = 0;
		// acumula a quantidade de ovos
		int totalOvos = 0;
		
		// Na segunda-feira
		chickenCount = 3;
		eggsPerChicken = 5;
		totalOvos = totalOvos + chickenCount * eggsPerChicken;
		
		// terça-feira
		//chickenCount = chickenCount + 1;
		//chickenCount += 1;
		chickenCount++;
		totalOvos += (chickenCount * eggsPerChicken);
		
		// Quarta-feira
		//chickenCount = chickenCount / 2;
		chickenCount /= 2;
		totalOvos += (chickenCount * eggsPerChicken);
		
		// exibir a quantidade de ovos coletados até a quarta-feira
		System.out.println("Quantidade de ovos: " + totalOvos);
	}

}
