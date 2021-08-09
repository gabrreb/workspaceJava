package core;

public class ContaV2 {
	protected String nomeTitular;
	protected String cpf;
	protected int numeroConta;
	protected double saldo;
	
	//generate constructor using fields
	public ContaV2(String nomeTitular, String cpf, int numeroConta) {
		super();
		this.nomeTitular = nomeTitular;
		this.cpf = cpf;
		this.numeroConta = numeroConta;
		this.saldo = 0;
	}
	//gets e sets
	public String getNomeTitular() {
		return nomeTitular;
	}


	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public int getNumeroConta() {
		return numeroConta;
	}


	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}


	//método de exibição
	public String exibirInfo() {
		return "Nome: " + nomeTitular + "\n"+
				" CPF: " + cpf + "\n"+
				"Número da conta: " + numeroConta + "\n" +
				"Saldo: " + String.format("%.2f", saldo) + "\n";
	}
	
	//método debitar
	public boolean debitar(double valor) {
		if(this.saldo>= valor) {
			this.saldo = this.saldo - valor;
			return true;
		}
		
		return false;
	}
	
	//método de creditar
	public void creditar(double valor) {
		this.saldo = saldo + valor;
	}
	
	
}
