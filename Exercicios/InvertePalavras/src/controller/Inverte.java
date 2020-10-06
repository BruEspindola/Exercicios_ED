package controller;

import javax.swing.JOptionPane;

public class Inverte {
	String frase;
	String Inverte;

	public Inverte(String frase, String Inverte) {
		this.frase = frase;
		this.Inverte = Inverte;
	}

	public void troca() {
		String frase = JOptionPane.showInputDialog(null, "Digite uma frase: ");
		StringBuilder Inverte = new StringBuilder(frase).reverse();
		System.out.println(frase + "\n" + Inverte );
	}
}