package br.com.senaisp.erley.teste;

public class Teste {

	public static void main(String[] args) {
		String s1 = "abcdef";
		String s2 = "abcdef";
		String s3 = new String(s1);
		boolean x = true;
		boolean y = false;
		System.out.println((x || y) && !(x && y));
				System.out.println((x && !y) || (!x && y));
						System.out.println(	(x || y) && (!x ||!y));
	}
}
