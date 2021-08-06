
public class Operacoes {
	
	//declarando as vars
	
	String nome, CPF;
	double saldo;
	int conta, digito;
	
	
	//opera��o de depositar
	
	void depositar(double valor) {
		saldo = saldo + valor;
		System.out.println("Dep�sito realizado com sucesso " + nome + "!");
		System.out.println("Valor depositado: R$ " + valor);
		System.out.println("Saldo atual: R$ " + saldo + "\n");
	}
	
	//opera��o de extrato
	void exibirInfo() {
		
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + CPF);
		System.out.println("Conta: " + conta + " - " + digito);
		System.out.println("Saldo: R$ " + saldo + "\n");
		
	}
	
	//operacao de sacar
	void sacar(double valor) {
		if(valor<=saldo) {
			saldo = saldo - valor;
			System.out.println("Saque realizado com sucesso " + nome + "!");
			System.out.println("Valor sacado: R$ " + valor);
			System.out.println("Saldo atual: R$ " + saldo + "\n");
		}
		else {
			System.out.println("Voc� n�o possui saldo suficiente para realizar a opera��o." + "\n");
		
		}
		
	}
}
