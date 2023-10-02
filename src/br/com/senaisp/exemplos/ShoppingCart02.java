// Exercicio Seção 3-3. Slide nº 21
package br.com.senaisp.erley.literais;

public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirts";
        String message = custName+" wants to purchase a "+itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity.   
        double preco = 10.00; // preco/price
        double taxa = 10.00; // imposto/tax
        int quantidade = 10; // quantity
        
        // Declare and assign a calculated totalPrice
        double precoTotal = quantidade * (preco + (preco * taxa / 100)); 
        
        // Modify message to include quantity 
        message = message + " Quantidade " + quantidade;
        System.out.println(message);
        
        // Print another message with the total cost
        System.out.println("Preço total = " + precoTotal);
    }    
}
