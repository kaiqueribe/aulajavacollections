package br.com.alura.aulas;

public class TesteBuscaAlunoNoCurso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Curso javaColecoes = new Curso("Dominando as coleções Java", "Paulo Silveira",350.32);

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando uma Colecao", 17));

		Aluno a1 = new Aluno("Rodrigo Turini", 11256);
		Aluno a2 = new Aluno("Nico Stepat", 21276);
		Aluno a3 = new Aluno("Guilherme Silveira", 31280);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Quem é o aluno com matricula 5617 ?");
		Aluno aluno = javaColecoes.buscaMatriculado(7569);
		System.out.println("Aluno: "+aluno);
		
		
	}

}
