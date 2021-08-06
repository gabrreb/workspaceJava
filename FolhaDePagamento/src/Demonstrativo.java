import java.util.Scanner;

public class Demonstrativo {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		//declarando e armazenando espaço pras vars
		Calculos c1, c2, c3;
		double valor;
		c1 = new Calculos();
		c2 = new Calculos();
		c3 = new Calculos();
		
		//infos funcionario 1
		c1.setNome("Jasmim Kaori");
		c1.setEmail("jasmim.kaori@outlook.com");
		c1.setNumeroFuncional(987325666);
		c1.setSalario(1000.00);
		
		//infos funcionario 2
		c2.setNome("Yudi Gabriel");
		c2.setEmail("jasmim.kaori@outlook.com");
		c2.setNumeroFuncional(987358666);
		c2.setSalario(2050.00);
		
		//infos funcionario 3 
		c3.setNome("Carlinhos Almeida");
		c3.setEmail("carlinhos.almeida@outlook.com");
		c3.setNumeroFuncional(987563254);
		c3.setSalario(7000.00);
		
		//reajustando o salario
		
		c1.reajustarSalario(10);	
		c2.reajustarSalario(15);
		c3.reajustarSalario(30);
		
		//exibindo as infos
		
		System.out.println("Nome: " + c1.getNome() + "\n" + "Salario: " + c1.getSalario() +  "\n" + "Valor do imposto: "+c1.calcularImposto() + "\n");
		System.out.println("Nome: " + c2.getNome() + "\n" + "Salario: " + c2.getSalario() +  "\n" + "Valor do imposto: "+c2.calcularImposto() + "\n");
		System.out.println("Nome: " + c3.getNome() + "\n" + "Salario: " + c3.getSalario() +  "\n" + "Valor do imposto: "+ c3.calcularImposto() + "\n");
		
	}
}
