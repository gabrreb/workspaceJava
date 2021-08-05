
public class Loja {
	public static void main(String[] args) {
		//Carro � meu novo tipo de dado
		// c1 e c2 s�o as "variaveis" deste novo tipo - chamamos de objetos
		Carro c1;
		Carro c2;
		
		
		// se fosse um tipo comum, ja tava ok, mas como falamos de classes
		//precisamos solicitar � Maquina Virtual um espa�o de mem�ria
		
		c1 = new Carro(); // aqui reservamos mem�ria para todas as vari�veis
		c2 = new Carro();
		
		// Vamos atribuir valores(for�ando mesmo)
		c1.marca = "Beterraba";
		c1.modelo = "Veloz";
		c1.ano = 2021;
		c1.cor = "Roxinho";
		c1.preco = 1000000;
		
		c2.marca = "Pintinho";
		c2.modelo = "Amarelinho";
		c2.ano = 2015;
		c2.cor = "Amarelo";
		c2.preco = 8000;
		
		//Vamos exibir o an�ncio na m�o
		
		/*System.out.println("Autom�vel: " +c1.marca+ " - " + c1.modelo);
		System.out.println("      Ano: "+c1.ano);
		System.out.println("      Cor: "+c1.cor);
		System.out.println("    Pre�o: R$ "+c1.preco +"\n");
		
		
		System.out.println("Autom�vel: " +c2.marca+ " - " + c1.modelo);
		System.out.println("      Ano: "+c2.ano);
		System.out.println("      Cor: "+c2.cor);
		System.out.println("    Pre�o: R$ "+c2.preco); */
		
		// Vamos exibir o an�ncio
		c1.exibirInfo();
		c2.exibirInfo();
		
		System.out.println("-------------------------");
		//Exibir com desconto
		c1.aplicarDesconto(10.0);
		c2.aplicarDesconto(5);
		
		// Vamos exibir o an�ncio com desconto
		c1.exibirInfo();
		c2.exibirInfo();
		
	}
}
