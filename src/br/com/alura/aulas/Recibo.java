package br.com.alura.aulas;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//Criar algo que faça listar e somar todos os cursos comprador
public class Recibo {

	private int numeroRecibo;
	private double valorRecibo;
	private Set<Curso> cursosComprados = new TreeSet<>();

	public Recibo(int numeroRecibo) {
		super();
		this.numeroRecibo = numeroRecibo;

	}

	public Set<Curso> getCursos() {
		return Collections.unmodifiableSet(cursosComprados);
	}

	@Override
	public String toString() {
		return "Numero do Recibo: " + this.numeroRecibo + " Valor Total Recibo: " + this.valorRecibo + this.cursosComprados;

	}

	public int getNumeroRecibo() {
		return numeroRecibo;
	}

	public double getValorRecibo() {
		return valorRecibo;
	}

	public void adiciona(Curso curso) {
		this.cursosComprados.add(curso);
		valorRecibo += curso.getValorCurso();
	}

}
