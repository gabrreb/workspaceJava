
public class Carro {

	//vamos declarar as vars que comp�e o tipo carro
	
	String marca;
	String modelo;
	int ano;
	String cor;
	double preco;
	
	//agora tamb�m precisamos criar trechos de codigo (subrotinas - metodos)
	//para manipular, exibir, alterar essas variaveis
	
	void exibirInfo() {
		System.out.println("Autom�vel: " + marca + " - " + modelo);
		System.out.println("      Ano: " + ano);
		System.out.println("      Cor: " + cor);
		System.out.println("    Pre�o: " + preco);
	}
	void aplicarDesconto (double percentual) {
		preco = preco - preco * percentual/100;
	
	}
	
	// calcular ipva do carro
	
	double calcularIPVA() {
		double valorIpva;
		if(ano<2000) {
			valorIpva =0;
		}
		else {
			valorIpva = preco * 0.02;
		}
		
		return valorIpva;
	}
}
