/*
 * Exemplo de encapsulamento (blindagem) - segurança
 */

public class Conta {
	//como eu encapsulo? - atributos sempre privados
	private int numeroConta;
	private int digitoVerif;
	private String nomeTitular;
	private String cpfTitular;
	private double saldo;
	
	
	public int getDigitoVerif() {
		return digitoVerif;
	}

	public void setDigitoVerif(int digitoVerif) {
		this.digitoVerif = digitoVerif;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getCpfTitular() {
		return cpfTitular;
	}

	public void setCpfTitular(String cpfTitular) {
		this.cpfTitular = cpfTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	//atributos / funcionalidades sempre publicos
	public void setNumeroConta(int numeroConta) {
		//aqui eu poderia fazer a rotina de validação que eu quisesse
		this.numeroConta = numeroConta;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public String exibir() {
		return "Conta " +numeroConta +"/" +digitoVerif+ "\n"+
				"		Titular: " +nomeTitular+ "(" + cpfTitular+ ")" + "\n" +
				"		Saldo  : R$ " + saldo;	
	}
	
	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	
	public boolean sacar(double valor) {
		if (saldo >= valor) {
			saldo = saldo - valor;
			return true;
		}
		//nesse caso eu não preciso por o else, pq o return finaliza / acaba com a função
		return false;
		
	}
}
