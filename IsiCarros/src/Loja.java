
public class Loja {
	public static void main(String[] args) {
		//Carro é meu novo tipo de dado
		// c1 e c2 são as "variaveis" deste novo tipo - chamamos de objetos
		Carro c1;
		Carro c2;
		
		
		// se fosse um tipo comum, ja tava ok, mas como falamos de classes
		//precisamos solicitar à Maquina Virtual um espaço de memória
		
		c1 = new Carro(); // aqui reservamos memória para todas as variáveis
		c2 = new Carro();
		
		// Vamos atribuir valores(forçando mesmo)
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
		
		//Vamos exibir o anúncio na mão
		
		/*System.out.println("Automóvel: " +c1.marca+ " - " + c1.modelo);
		System.out.println("      Ano: "+c1.ano);
		System.out.println("      Cor: "+c1.cor);
		System.out.println("    Preço: R$ "+c1.preco +"\n");
		
		
		System.out.println("Automóvel: " +c2.marca+ " - " + c1.modelo);
		System.out.println("      Ano: "+c2.ano);
		System.out.println("      Cor: "+c2.cor);
		System.out.println("    Preço: R$ "+c2.preco); */
		
		// Vamos exibir o anúncio
		c1.exibirInfo();
		c2.exibirInfo();
		
		System.out.println("-------------------------");
		//Exibir com desconto
		c1.aplicarDesconto(10.0);
		c2.aplicarDesconto(5);
		
		// Vamos exibir o anúncio com desconto
		c1.exibirInfo();
		c2.exibirInfo();
		
	}
}
