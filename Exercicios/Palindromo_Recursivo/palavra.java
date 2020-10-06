import javax.swing.JOptionPane;

public class palavra {

	static boolean palindromo(String palavra) {
		boolean aux = true;
		int i;

		for (i = 0; i < palavra.length() / 2; i++) {
			if ((palavra.charAt(i) == palavra.charAt(palavra.length() - i - 1)))
				aux = true;
			else {
				aux = false;
				break;
			}
		}

		return (aux);
	}

	public static void main(String[] args) {
		String Palavra;

		Palavra = JOptionPane.showInputDialog(null, "Digite a sua frase: ");
		Palavra = Palavra.toLowerCase();

		if (palindromo(Palavra) == true) {
			System.out.println("A palavra '"+Palavra + "' é Palindromo");
		} else {
			System.out.println("A palavra '"+Palavra + "' não é Palindromo");
		}
	}
}
