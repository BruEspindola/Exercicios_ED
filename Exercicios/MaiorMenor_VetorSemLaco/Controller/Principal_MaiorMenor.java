package Controller;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Principal_MaiorMenor {

	public static void main(String[] args) {

		int[] vetor = new int[10];
		int Maior, Menor;

		for (int i = 0; i < 10; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero para inserir no vetor"));
			System.out.println(vetor[i]);
		}

		Arrays.sort(vetor); // ordenar vetor
		
		Maior = vetor[9];
		Menor = vetor[0];

		System.out.println("Maior = " + Maior + "\nMenor = " + Menor);
	}
}


