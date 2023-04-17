package br.com.alura.aulas;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções Java", "Paulo Silveira",350.32);

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando uma Colecao", 17));

		Aluno a1 = new Aluno("Rodrigo Turini", 11256);
		Aluno a2 = new Aluno("Nico Stepat", 21276);
		Aluno a3 = new Aluno("Guilherme Silveira", 31280);
		Aluno a4 = new Aluno("Mauricio Aniche", 41250);
		Aluno a5 = new Aluno("Mauricio Aniche", 41250);
		Aluno a6 = new Aluno("Nico Stepat", 21276);
		Aluno a7 = new Aluno("", 0);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		javaColecoes.matricula(a4);
		javaColecoes.matricula(a5);
		javaColecoes.matricula(a6);
		javaColecoes.matricula(a7);

		
		System.out.println("");
		System.out.println("Todos os Alunos Matriculado: ");

		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		while (iterador.hasNext()) {
			Aluno proximo = iterador.next();
			System.out.println(proximo);
		}

//		
//		javaColecoes.getAlunos().forEach(a -> {
//			System.out.println(a);
//		});
//		

		System.out.println("");

		System.out.println("O Aluno " + a1 + ", esta matriculado: " + javaColecoes.estaMatriculado(a1));

		Aluno turini = new Aluno("Rodrigo Turini", 11256);

		System.out.println("E esse turin " + turini + ", esta matriculado: " + javaColecoes.estaMatriculado(turini));

		System.out.println("O a1 é equals ao turini?");
		System.out.println(a1.equals(turini));

		// Obrigatoriamente o seguinte é true:
		System.out.println(a1.hashCode() == turini.hashCode());
		
		System.out.println(javaColecoes);
		System.out.println(javaColecoes.getValorCurso());
		System.out.println(javaColecoes.getInstrutor());

	}

}
