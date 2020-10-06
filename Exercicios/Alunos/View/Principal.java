package src.View;

import src.Controller.Aluno;
import src.Controller.Lista;

public class Principal {
	public static void main(String[] args) {

		Aluno a1 = new Aluno("0001", "Pedro", "Matemática", 10, 8, 0, 8);
		Aluno a2 = new Aluno("0002", "Maria", "Matemática", 9, 5, 7, 2);
		Aluno a3 = new Aluno("0003", "Gustavo", "Matemática", 7, 8, 4, 4);
		Aluno a4 = new Aluno("0004", "Bruna", "Matemática", 5, 8, 0, 2);

		Lista lista = new Lista();

		lista.adiciona(a1);
		lista.adiciona(a2);
		lista.adiciona(a3);
		lista.adiciona(a4);

		System.out.println("===================");
		System.out.println("Todos Alunos:");
		lista.mostraAluno();

		System.out.println("===================");
		System.out.println("Removendo primeiro aluno:");

		lista.remove();

		lista.mostraAluno();

	}
}
