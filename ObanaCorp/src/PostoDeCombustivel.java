import java.util.Scanner;

public class PostoDeCombustivel {
	public static void main(String[] args) {
		
	Scanner teclado = new Scanner (System.in);	
	//Declarando as vari�veis e atribuindo valor e pre�o para as bombas	
	Bomba b1, b2, b3;
	int bomba, colocar;
	
	
	b1 = new Bomba("�lcool", 3.50);
	b2 = new Bomba("Gasolina Comum", 5.35);
	b3 = new Bomba("Gasolina Aditivada", 5.55);
	
	//Painel de escolha
	System.out.println("Que vai ser patr�o/madame?");
	System.out.println("Escolha: " + "\n" +
			 		   "1 - �lcool" + "\n" +
					   "2 - Gasolina Comum" + "\n" +
					   "3 - Gasolina Aditivada" + "\n");
	bomba = teclado.nextInt();
	System.out.println("Deseja colocar a quantidade em litros (Digite: 1) ou reais (Digite = 2)?");
	colocar = teclado.nextInt();
	
	
		
		if(bomba == 1) {
			if(colocar == 1) {
				b1.abastecerPorLitros(10);
			}
			else {
				b1.abastecerPorValor(50.00);
			}
			System.out.println(b1.exibirInfo());
		}
		
		
		else if(bomba == 2) {
			if(colocar == 1) {
				b2.abastecerPorLitros(10);
			}
			else {
				b2.abastecerPorValor(50.00);
			}
			System.out.println(b2.exibirInfo());
		}
		
		else {
			if(colocar == 1) {
				b3.abastecerPorLitros(10);
			}
			else {
				b3.abastecerPorValor(50.00);
			}
			System.out.println(b3.exibirInfo());
		}
			
	
	} 
	
//	while(bomba != 1 && bomba != 2 && bomba != 3 ) {
//		System.out.println("[ERRO] Op��o inv�lida!");
//		System.out.println("Digite outra op��o.");
//		System.out.println("Escolha: " + "\n" +
//		 		   "1 - �lcool" + "\n" +
//				   "2 - Gasolina Comum" + "\n" +
//				   "3 - Gasolina Aditivada" + "\n");
//		bomba = teclado.nextInt();
//
//		}
//		
	
	
	
	}

