
public class Empregado {

	//declarando as vars do empregado
	
	String nome, cargo;
	double salario;
	
	//funcionalidade que imprime os dados
	void imprimir() {
		System.out.println("Nome: " + nome);
		System.out.println("Cargo: " + cargo);
		System.out.println("Salário: " + salario + "\n");
	}
	
	//funcionalidade que aumenta o salario
	void aumentarSalario(double percentual) {
		salario = salario * (1 + (percentual/100));
		System.out.println("O salário do(a) funcionário(a) " +nome +" com aumento de " + percentual + "% é de: " + salario + "\n");
	}
	
	
	
}
