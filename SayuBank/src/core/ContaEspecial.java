package core;

public class ContaEspecial extends ContaV2 {

	private double limite;
	
	public ContaEspecial(String nomeTitular, String cpf, int numeroConta, double limite) {
		super(nomeTitular, cpf, numeroConta);
		this.limite = limite;
	}

	public String exibirInfo() {
		return "Conta especial: " + super.numeroConta + "-" + super.nomeTitular+ 
				" ("+super.cpf+ " ) R$ " +String.format("%.2f", super.saldo) +
				" Limite R$ "+ String.format("%.2f", this.limite);
	}
	
	public boolean debitar(float valor) {
		if(super.saldo + this.limite >= valor) {
			super.saldo = super.saldo - valor;
			return true;
		}
		return false;
	}
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	
	
}
