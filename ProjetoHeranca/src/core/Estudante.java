package core;


//leitura
//a classe Estudante amplia a defini��o da classe Pessoa
//o que isso quer dizer? que em Estudante tem TUDO que tem em Pessoa e mais alguma coisa

public class Estudante extends Pessoa {
	private int numeroMatricula;
	private String curso;
	
	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public void exibir() {
		System.out.println("Estudante: " +nome+ "/"+email+"/"+numeroMatricula+"/"+curso);
	}
		
}
