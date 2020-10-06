package src.Controller;

public class Aluno {
	String Matricula;
	String Nome;
	String Disciplina;
	float NotaP1;
	float NotaP2;
	float NotaSUB;
	float NotaEX;
	Aluno anterior;

	public Aluno(String Matricula, String Nome, String Disciplina, float NotaP1, float NotaP2, float NotaSUB,
			float NotaEX) {
		this.Nome = Nome;
		this.Disciplina = Disciplina;
		this.Matricula = Matricula;
		this.NotaEX = NotaEX;
		this.NotaP1 = NotaP1;
		this.NotaP2 = NotaP2;
		this.NotaSUB = NotaSUB;
	}

	public Aluno getAnterior() {
		return anterior;
	}

	public void setAnterior(Aluno anterior) {
		this.anterior = anterior;
	}

	@Override
	public String toString() {
		return "Nome: " + Nome + "\nMatricula: " + Matricula + "\nNota P1: " + NotaP1 + "\nNota P2: " + NotaP2
				+ "\nNota Sub: " + NotaSUB + "\nNota Exercicios: " + NotaEX + "\n";
	}
}
