package br.com.alura.aulas;

import java.util.Collections;
import java.util.Set;

public class TesteEmptySet {

	public static void main(String[] args) {

		Set<String> nomes = Collections.emptySet();
		nomes.add("Paulo"); // o que acontece aqui?
	}
	
	
	
	Set<String> alunosSincronizados = Collections.synchronizedSet(null);
	


}
