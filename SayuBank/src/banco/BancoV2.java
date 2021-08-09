package banco;

import java.util.Scanner;

import core.ContaEspecial;
import core.ContaV2;

public class BancoV2 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int opcao;
		float valor;
		ContaV2 c;
		//setando valores no metodo construtor
		c = new ContaV2("Paulo","123.456.789-00", 123456);
		
		
		//fazendo menu
		
		do {
			System.out.println("Bem vindo ao SayuBank - Sua fintech");
			System.out.println("Digite 1 - Info / 2 - Depósito / 3 - Saque / 0 - Encerrar");
			opcao = teclado.nextInt();
			switch(opcao) {
			case 1:
				System.out.println(c.exibirInfo());
				break;
			case 2:
				System.out.println("[DEPOSITO] Digite o valor:");
				valor = teclado.nextFloat();
				c.creditar(valor);
				break;
			case 3:
				System.out.println("[SAQUE] Digite o valor:");
				valor = teclado.nextFloat();
				if(c.debitar(valor)) {
					System.out.println("Saque autorizado.");
				}
				else {
					System.out.println("Saldo insuficiente.");
				}
				break;
			case 0:
				System.out.println("Obrigado pela preferência.");
				break;
			default:
				System.out.println("ERRO: Opcao Invalida.");
			}
		}while (opcao != 0 );
		
		//conta especial
		ContaEspecial c2;
		c2 = new ContaEspecial("Asdrubal", "3456", 8759, 2000.00);
		
		System.out.println(c2.exibirInfo());
		c2.creditar(30.00);
		System.out.println(c2.exibirInfo());
		
		if(c2.debitar(200)) {
			System.out.println("Debito efetivado");
		}
		else {
			System.out.println("Saldo insuficiente");
		}
		System.out.println("Saldo insuficiente");
		teclado.close();
	}
	
}
