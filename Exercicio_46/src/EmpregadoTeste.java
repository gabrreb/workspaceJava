
public class EmpregadoTeste {
	public static void main(String[] args) {
		Empregado e1, e2, e3;
		double salarionovo;
		
		e1 = new Empregado();
		e2 = new Empregado();
		e3 = new Empregado();
		
		
		//pessoa1
		e1.cargo = "Desenvolvedor de software";
		e1.nome = "Carlinhos";
		e1.salario = 1000;
		
		//pessoa2
		e2.cargo = "Arquiteta";
		e2.nome = "Jasmim";
		e2.salario = 5900.05;
		
		//pessoa1
		e3.cargo = "Padeira";
		e3.nome = "Lúcia";
		e3.salario = 5599.85;
		
		//Exibindo as informações sobre a pessoa
		
		e1.imprimir();
		e2.imprimir();
		e3.imprimir();
		
		//Aumentando o salario
		
		e1.aumentarSalario(15);
		e2.aumentarSalario(15);
		e3.aumentarSalario(15);
	}
}
