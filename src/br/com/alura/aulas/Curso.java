package br.com.alura.aulas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import javax.swing.plaf.BorderUIResource.TitledBorderUIResource;

public class Curso {

	
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<>();

	public Curso(String nome, String instrutor) {
		super();
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public int getTempoTotal() {
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}
	
	@Override
	public String toString() {
		
		return "[Curso: " + this.nome + ", tempo total: "+ this.getTempoTotal()+", aulas: "+ this.aulas + "]";	}
}
