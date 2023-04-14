package br.com.alura.aulas;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando uma Colecao", 17));

		Aluno a1 = new Aluno("Rodrigo Turini", 11256);
		Aluno a2 = new Aluno("Nico Stepat", 21276);
		Aluno a3 = new Aluno("Guilherme Silveira", 31280);
		Aluno a4 = new Aluno("Mauricio Aniche", 41250);
		Aluno a5 = new Aluno("Mauricio Aniche", 41250);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		javaColecoes.matricula(a4);

		System.out.println("Todos os Alunos Matriculado: ");
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});
		System.out.println("");
		
		System.out.println("O Aluno "+ a1+", esta matriculado: " +javaColecoes.estaMatriculado(a1));
		
		Aluno turini = new Aluno("Rodrigo Turini",11256);
		
		System.out.println("E esse turin "+turini+", esta matriculado: "+javaColecoes.estaMatriculado(turini));
		
		
		System.out.println("O a1 é equals ao turini?");
		System.out.println(a1.equals(turini));
		
		
		//Obrigatoriamente o seguinte é true:
		System.out.println(a1.hashCode() == turini.hashCode());
		
		
		

	}

}
