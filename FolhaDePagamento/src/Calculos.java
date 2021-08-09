
public class Calculos {

	//declarando as variaveis privadas
	private int numeroFuncional;
	private String nome;
	private String email;
	private double salario;
	
	//criando um m�todo espec�fico, que s� pode ser chamado no momento do NEW
	// M�todo construtor e serve geralmente para inicializar valores no objeto
	
	public Calculos (int numeroFuncional, String nome, String email, double salario) {
		this.numeroFuncional= numeroFuncional;
		this.nome = nome;
		this.email = email;
		this.salario = salario;
		
	}
	//gets e sets publicos
	public int getNumeroFuncional() {
		return numeroFuncional;
	}

	public void setNumeroFuncional(int numeroFuncional) {
		this.numeroFuncional = numeroFuncional;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//Vamos dar um aumento para o funcionario
	public void reajustarSalario(double percentual) {
		salario = salario * (1 + (percentual/100));
		
	}
	
	public String exibirInfo() {
		return "Nome: " + nome + "\n" + "Funcional: " + 
				numeroFuncional + "\n" + "E-mail: " + email + 
				"\n" + "Salario: R$ " + salario + "\n";
	}
	
	public double calcularImposto() {
		if(salario <= 2000) {
			return 0;
		}
		else if(salario > 2000 && salario <= 3000) {
			return salario * 0.15;
			
		}
		else if(salario > 3000 && salario <= 4500) {
			return salario * 0.25;
		}
		else {
			return 2250;
		}
		
	}
	
}
