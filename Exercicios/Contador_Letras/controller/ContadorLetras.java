package controller;

import javax.swing.JOptionPane;

public class ContadorLetras {

	public static void main(String[] args) {

		String frase;

		frase = JOptionPane.showInputDialog(null, "Digite a sua frase: ");

		System.out.println("Sua frase é: " + frase);

		frase = frase.toLowerCase();

		int vogal = 0, consoante = 0;
		for (int i = 0; i < frase.length(); i++) {
			char FrasePilha = frase.charAt(i);
			if (FrasePilha == 'a' || FrasePilha == 'e' || FrasePilha == 'i' || FrasePilha == 'o' || FrasePilha == 'u') {
				vogal++;
			} else {
				consoante++;
			}
		}
		System.out.println("Na frase \"" + frase + "\" temos:\nVogais: " + vogal + "\nConsoantes: " + consoante);

	}

}