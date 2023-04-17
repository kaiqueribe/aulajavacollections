package br.com.alura.aulas;

public class TestaRecibos {

	public static void main(String[] args) {
		
	Recibo r1= new Recibo(5569);
	Recibo r2= new Recibo(5570);
	
	
	Curso javaColecoes = new Curso("Dominando as coleções Java", "Paulo Silveira",350.32);
	Curso bancoDeDados = new Curso("Banco de Dados mySQL","Nico Stepah",220.20);

	javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
	bancoDeDados.adiciona(new Aula("Insert, Delete, Update",33));
	
	r1.adiciona(javaColecoes);
	r1.adiciona(bancoDeDados);
	
	// Criar Set Curso
	
	
	System.out.println(r1);
	
	
	
	
	
	
	}

}
