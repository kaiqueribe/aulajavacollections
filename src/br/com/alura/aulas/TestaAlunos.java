package br.com.alura.aulas;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();

		alunos.add("Icaro");
		alunos.add("Nilton");
		alunos.add("Gabriel");
		alunos.add("Flavio");
		alunos.add("Udi");
		alunos.add("Sillas");
		alunos.add("Rafael");
		alunos.add("Kaique");
		alunos.add("Kaique");
		alunos.add("Kaique");
		alunos.add("Gabriel");

		System.out.println(alunos.size());

		boolean verificaMatricula = alunos.contains("Udi");
		// alunos.remove("Udi");

		System.out.println(verificaMatricula);

		for (String aluno : alunos) {
			System.out.println(aluno);
		}
	}

}
