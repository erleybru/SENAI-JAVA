package br.com.senaisp.exemplos.loopwhile;

public class LoopWhile {

	public static void main(String[] args) {
		// O tipo char utilizar APÓSTROFO para delimitar o caracter
		// Lembre-se disso ou o JAVA o lembrará
		char caracter = 'A';
		int codigoAscii; // Optei por não inicializa-lo aqui
		// utilize o loop while quando não souber quantas vezes o
		// codigo deverá ser executado. de nehuma vez a muitas
		while(caracter <= 'Z') {
			// bloco de código
			codigoAscii = caracter; // pega o valor do caracter, vulgo codigo ASCII
			System.out.println("\tLetra: " + caracter + " igual a codigo ASCII " + codigoAscii);
			caracter += 1; // soma um valor e guarda na variavel caracter
		}
	}

}
