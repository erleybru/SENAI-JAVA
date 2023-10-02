import javax.swing.JOptionPane;

public class JavaLibsPractice_Soln {

    public static void main(String[] args) {
        // TODO code application logic here
        String nome = JOptionPane.showInputDialog("Entre com seu nome");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Entre com a sua idade"));
        String localMoradia = JOptionPane.showInputDialog("Entre com um tipo de moradia");
        double distancia = Double.parseDouble(JOptionPane.showInputDialog("Entre com um valor decimal entre 0 e 10"));
        String comida = JOptionPane.showInputDialog("Entre a type of food");
        String animal = JOptionPane.showInputDialog("What is your favorite animal?");
        String parteCorpo = JOptionPane.showInputDialog("Entre a body part");
        String condicao = JOptionPane.showInputDialog("Entre a medical condition");
        String bebida = JOptionPane.showInputDialog("Entre a type of drink");
        int duracao = Integer.parseInt(JOptionPane.showInputDialog("Entre a number between 2 and 14"));
        JOptionPane.showMessageDialog(null,"Olá! " + nome + " você tem " + idade + " e mora em " + localMoradia + ".\n"
                                    +"No próximo ano " + name + " irá fazer "+  (idade+1) +" anos de idade."
                                    +" A loja mais próxima da sua casa fica a "+ distancida+" de distancia, \n "
                                    +"Então você precisa se locomover "+(distance*2)+ " quilometros para comprar " + comida +"!\n"
                                    +nome+" tem um "+ animal + " para companhia.\n"
                                    +"Um dia, "+nome+" desenvolveu " + condicao+" on the "+ parteCorpo +".\n"
                                    +"O médico prescreveu beber "+drink+" todos os dias por "+duracao +" dias!");        
    }   
}
