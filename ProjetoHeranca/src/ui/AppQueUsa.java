package ui;

import core.Estudante;
import core.Pessoa;

public class AppQueUsa {
	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		p.setNome("Gabi");
		p.setEmail("gabi@itau.com.br");
		p.exibir();
		
		Estudante e = new Estudante();
		e.setNumeroMatricula(1234);
		e.setCurso("Computação");
		e.setNome("Jose");
		e.setEmail("jose@itau.com.br");
		e.exibir();
		
	}
}
