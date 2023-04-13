package br.com.alura.aulas;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class TestaPerformance {

	public static void main(String[] args) {

		Collection<Integer> numeros = new HashSet<>();

		long inicio = System.currentTimeMillis();

		for (int i = 1; i <= 100000; i++) {
			numeros.add(i);

		}
		long tFimInsercao = System.currentTimeMillis();


		for (Integer numero : numeros) {
			numeros.contains(numero);
		}
		long tFimBusca = System.currentTimeMillis();
		
		
		

		long fim = System.currentTimeMillis();
		
		
		long tempoDeExcecucao = fim - inicio;
		long tempoInsercao = tFimInsercao - inicio;
		long tempoBusca = tFimBusca - tFimInsercao;

		System.out.println("Tempo de inserção dos itens: " + tempoInsercao);
		System.out.println("Tempo de busca dos itens: " + tempoBusca);
		System.out.println("Tempo gasto: " + tempoDeExcecucao);
	}
	// Resultado
//  ArrayLista83813
//	LinkedList83620
//	Hashset32399
}
