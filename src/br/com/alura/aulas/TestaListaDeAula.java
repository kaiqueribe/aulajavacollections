package br.com.alura.aulas;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

	public static void main(String[] args) {
		Aula aula1 = new Aula("Trabalando com Arraylist",12); 
		Aula aula2 = new Aula("Relacionamento com coleções",15); 
		Aula aula3 = new Aula("Aplicando set no modelo",22); 
		
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		
		System.out.println(aulas);
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
		
		Collections.sort(aulas,Comparator.comparing(Aula::getTempo));

		System.out.println(aulas);
		
		aulas.sort(Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas);
		
	}

}
