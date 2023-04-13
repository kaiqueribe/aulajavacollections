package br.com.alura.aulas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import br.com.alura.aulas.Aula;

public class TestaCurso2 {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções Java", "Paulo Silveira");


		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 22));
		javaColecoes.adiciona(new Aula("Modelando uma Colecao", 17));
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
		
		Collection<Aula> aulas = new ArrayList<>(aulasImutaveis);
 		
		Collections.sort((List<Aula>) aulas);
		System.out.println("Ap�s o sort: "+aulas);
		
		System.out.println(javaColecoes.getTempoTotal());
		
		System.out.println(javaColecoes);
	}

}
