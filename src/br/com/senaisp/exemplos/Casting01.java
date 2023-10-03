package br.com.senaisp.erley.casting01;

public class Casting01 {
    public static void main(String[] args) {
        //Declare and initialize a byte with a value of 128
        //Observe NetBeans' complaint
    	byte numero1 = 127;
        
        //Declare and initialize a short with a value of 128
        //Create a print statement that casts this short to a byte
    	short numero2 = 128;
    	System.out.println((byte) numero2);
        
        
        //Declare and initialize a byte with a value of 127
    	System.out.println("Valor do byte = " + numero1);
        //Add 1 to this variable and print it
    	numero1++;
    	System.out.println("Somei 1 ao numero. Veja como ficou");
    	System.out.println("Valor do byte = " + numero1);
    	
        //Add 1 to this variable again and print it again
    	numero1++;
    	System.out.println("Somei 1, NOVAMENTE, ao numero. Veja como fica");
    	System.out.println("Valor do byte = " + numero1);
        
    }    
}
