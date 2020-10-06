package src.Controller;

public class Lista {
	private Aluno topo, anterior;

	public void adiciona(Aluno aluno) {
		if (anterior == null) {
			anterior = aluno;
		} else {
			topo = aluno;
			topo.setAnterior(anterior);
			anterior = topo;
		}
	}

	public void remove() {
		topo = topo.getAnterior();
		anterior = topo;
	}

	public void mostraAluno() {
		Aluno aux = topo;

		while (aux != null) {
			System.out.println(aux.toString());
			aux = aux.getAnterior();
		}
	}
}
