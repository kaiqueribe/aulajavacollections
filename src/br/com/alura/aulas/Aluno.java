package br.com.alura.aulas;

public class Aluno  {

	private String nomeAluno;
	private int numeroMatricula;

	public Aluno(String nomeAluno, int numeroMatricula) {
		if (nomeAluno == null) {
			throw new NullPointerException("Nome não pode ser Null");
		}
		this.nomeAluno = nomeAluno;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	@Override
	public boolean equals(Object obj) {

		Aluno outro = (Aluno) obj;

		return this.nomeAluno.equals(outro.nomeAluno);
	}

	@Override
	public int hashCode() {

		return this.nomeAluno.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Matricula:" + this.numeroMatricula + " | Nome Aluno: " + this.nomeAluno;
	}

}
