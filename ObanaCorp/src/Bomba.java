
public class Bomba {

	//declarando as variaveis privadas
	
	private String nome;
	private double precoLitro, qtdeLitros, totalPagar;
	
	
	//colocando gets e sets
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPrecoLitro() {
		return precoLitro;
	}
	public void setPrecoLitro(double precoLitro) {
		this.precoLitro = precoLitro;
	}
	public double getQtdeLitros() {
		return qtdeLitros;
	}
	public void setQtdeLitros(double qtdeLitros) {
		this.qtdeLitros = qtdeLitros;
	}
	public double getTotalPagar() {
		return totalPagar;
	}
	public void setTotalPagar(double totalPagar) {
		this.totalPagar = totalPagar;
	}
	
	//m�todo construtor - fornecendo o nome da bomba e o pre�o por litro
	
	public Bomba (String nome, double precoLitro) {
		this.nome = nome;
		this.precoLitro = precoLitro;
	}
	
	//m�todo que calcula o total a pagar a partir do total de litros
	public void abastecerPorLitros(double qtdeLitros) {
		this.qtdeLitros = qtdeLitros;
		totalPagar = qtdeLitros * precoLitro;
		
	}
	
	//m�todo que calcula o total de litros  a partir do total a pagar
	public void abastecerPorValor(double totalPagar) {
		this.totalPagar = totalPagar;
		qtdeLitros = totalPagar/ precoLitro;
	}
	
	//m�todo que retorna o recibo do abastecimento
	public String exibirInfo() {
		return "-------------------Abastecimento realizado com sucesso-----------------------" + "\n" +
				"Combust�vel			: " + nome + "\n" +
				"Pre�o por litro			: R$ " + String.format("%.3f\n", precoLitro)+ 
				"Quantidade abastecida		: " + String.format("%.3f", qtdeLitros) + " L" + "\n" + 
				"Valor total			: R$ " + String.format("%.2f\n", totalPagar);
				
	}
}
