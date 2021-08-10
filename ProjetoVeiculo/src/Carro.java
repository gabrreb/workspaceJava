
public class Carro extends Veiculo{
	int ano;
	
	public void acelerar() {
		System.out.println("O Carro " +marca+"/"+modelo+" ("+ano+") acelera no pé! VRUMMMMMM");
	}
	
	public void frear() {
		System.out.println("O Carro "+marca+"/"+modelo+" ("+ano+") freia na mão! IIRRRRRRCCCCHHHHHHHHHH");
	}

}
