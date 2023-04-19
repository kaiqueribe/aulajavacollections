package br.com.alura.aulas;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<>();
	private Set<Aluno> alunos = new LinkedHashSet<>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
	private double valorCurso;

	public Curso(String nome, String instrutor, double valorCurso) {
		this.nome = nome;
		this.instrutor = instrutor;
		this.valorCurso = valorCurso;
	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
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

	public int getTempoTotal() {
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}

	public double getValorCurso() {
		return valorCurso;
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	@Override
	public String toString() {

		return "[Curso: " + this.nome + ", tempo total: " + this.getTempoTotal() + ", aulas: " + this.aulas + "]";
	}

	public void matricula(Aluno aluno) {
		if (this.alunos.contains(aluno)) {
			System.out.println("Esse aluno ja esta matriculado" + " Nome Aluno: " + aluno.getNomeAluno()
					+ " Matricula: " + aluno.getNumeroMatricula());
		}
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);

	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);

	}

	public Aluno buscaMatriculado(int numero) {
		for (Aluno aluno : alunos) {
			if (aluno.getNumeroMatricula() == numero)
				return aluno;
		}
		throw new NoSuchElementException("Matricula não encontrada" + numero);
	}
}
