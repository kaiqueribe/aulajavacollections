package br.com.alura.aulas;

public class Aula {
	
	private String titulo;
	private int tempo;
	
	public Aula(String titulo, int tempo) {
		super();
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public int getTempo() {
		return tempo;
	}
	

}
