package view;

import controller.Pilha;

public class Palindromo {

	public static void main(String[] args) {

		imprimeResultado("ADA");

		imprimeResultado("A grama � amarga");

		imprimeResultado("ABCCBA");

		imprimeResultado("Maria");
	}

	public static void imprimeResultado(String palavra) {
		System.out.println(palavra + " � palindromo? " + testaPalindromo(palavra));
	}

	public static boolean testaPalindromo(String palavra) {

		Pilha<Character> pilha = new Pilha<Character>();

		for (int i = 0; i < palavra.length(); i++) {
			pilha.empilha(palavra.charAt(i));
		}

		String palavraInversa = "";
		while (!pilha.estaVazia()) {
			palavraInversa += pilha.desempilha();
		}

		if (palavraInversa.equalsIgnoreCase(palavra)) {
			return true;
		}

		return false;
	}

}