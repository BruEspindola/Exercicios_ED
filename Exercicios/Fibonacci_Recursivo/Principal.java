import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		int numero;

		numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero para calcular a sequencia:"));

		for (int i = 1; i <= numero; i++) {
			System.out.println(fibonacciRecursivo(i) + " ");
		}
	}

	private static int fibonacciRecursivo(int numero) {
		if (numero == 1 || numero == 2) {
			return 1;
			}

			return fibonacciRecursivo(numero - 1) + fibonacciRecursivo(numero - 2);
			}
	}


