import javax.swing.JOptionPane;
public class Conta {
	public static void main(String[] args) {
		Operacoes c1, c2, c3;
		
		c1 = new Operacoes();
		c2 = new Operacoes();
		c3 = new Operacoes();
		
		JOptionPane.showMessageDialog(null, "Oi, tudo bem?");
		//cliente1
		c1.conta = 22365;
		c1.CPF = "958632250/05";
		c1.digito = 2;
		c1.nome = "Maria Aparecida da Silva";
		c1.saldo = 10000.02;
		
		//cliente2
		c2.conta = 25665;
		c2.CPF = "958000250/85";
		c2.digito = 8;
		c2.nome = "José Mario Aparecido";
		c2.saldo = 100;
		
		//cliente3
		c3.conta = 44665;
		c3.CPF = "111000250/85";
		c3.digito = 9;
		c3.nome = "Clara Maria Garcia";
		c3.saldo = 5000;
			
		//depositar
		c1.depositar(500);
		c2.depositar(150);
		c3.depositar(750);
		
		
		//extrato
		c1.exibirInfo();
		//mostrando a info de cima em uma caixinha de dialogo
		//JOptionPane.showMessageDialog(null, c1.exibirInfo()); não deu certo pq a operacao é do tipo void e 
		//para fazer isso precisaria ser 
		c2.exibirInfo();
		c3.exibirInfo();
		
		//sacar
		
		c1.sacar(50);
		c2.sacar(500);
		c3.sacar(60);
		
	}
}
