
public class Empregado {

	//declarando as vars do empregado
	
	String nome, cargo;
	double salario;
	
	//funcionalidade que imprime os dados
	void imprimir() {
		System.out.println("Nome: " + nome);
		System.out.println("Cargo: " + cargo);
		System.out.println("Sal�rio: " + salario + "\n");
	}
	
	//funcionalidade que aumenta o salario
	void aumentarSalario(double percentual) {
		salario = salario * (1 + (percentual/100));
		System.out.println("O sal�rio do(a) funcion�rio(a) " +nome +" com aumento de " + percentual + "% � de: " + salario + "\n");
	}
	
	
	
}
