package br.com.senaisp.erley.secao4.exercio1;

public class Tip01 {
    public static void main(String[] args) {
        //Find everyone's indivudlal total after tax(5%) and tip(15%)
        
        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15
        Person 7: $11
        Person 8: $30
        */
    	// coloca os valores em um vetor
    	double[] gastos = {10, 12, 9, 8, 7, 15, 11, 30};
    	
    	// acrescer 5% de imposto
    	// faz um loop para calcular o imposto e 
    	// a gorjeta do garçon
    	for(int i=0; i < gastos.length; i++) {
    		System.out.println(
    		  "Valor com imposto da pessoa nº " +(i+1) + 
    		  " = " + ((gastos[i] * 1.05) + (gastos[i] * 0.15)));
    	}
    }    
}



