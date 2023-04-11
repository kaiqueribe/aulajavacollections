package br.com.alura.aulas;

import java.util.Collections;
import java.util.List;
import br.com.alura.aulas.Aula;

public class TestaCurso {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções Java", "Paulo Silveira");

//		List<Aula> aulas = javaColecoes.getAulas();
//		System.out.println("Antes de adicionar aula: "+aulas);

//    	aulas.add(new Aula("Trabalhando com ArrayList", 21));

//		javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando uma Colecao", 17));

		// System.out.println("Depois de adicionar aula: "+aulas);

		List<Aula> aulas = javaColecoes.getAulas();
		
		System.out.println(javaColecoes.getAulas());
		

		// System.out.println(aulas == javaColecoes.getAulas());
	}

}
