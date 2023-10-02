// exemplo Seção 3.3 - slide 17
package br.com.senaisp.erley.literais;

// criação da classe ShoppingCart01
public class ShoppingCart01 {

    // Criação do método especial "main". O programa começa por ele
    public static void main(String[] args) {
        // Declara e inicializa variáveis String/Literal. Não inicialize a variavel "message" ainda
        String custName = "Jhonata"; // String custName = new String("Jhonata");
        String itemDesc = "Camiseta";
        String message;
        
        // Atribua um valor a variavel "message" aqui
        message = custName + " que comprar uma " + itemDesc;
        
        // Imprima a variavel message e execute o seu código java
        System.out.println(message);
    }
}
