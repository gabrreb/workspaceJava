package userinterface;

import java.util.ArrayList;

import core.Chefe;
import core.Comissionado;
import core.Empreiteiro;
import core.Funcionario;
import core.Horista;

public class FolhaDePagamentoV2 {
	public static void main(String[] args) {
		//definindo a array que vão ficar os funcionários
//		Funcionario lista[];
//		
//		//declarando a lista que possui 6 posições
//		lista = new Funcionario[6]; 
//		
//		//agra preciso criar os objetos
//		
//		lista[0] = new Chefe(1234, "Gabi", 10000, 15, 2000);
//		lista[1] = new Horista(1235, "Vandeco", 200, 79);
//		lista[2] = new Comissionado(1236, "Yuri", 5000, 17.32);
//		lista[3] = new Horista(1237, "Yara", 150, 79);
//		lista[4] = new Empreiteiro(1238, "Carlos", 4508.0);
//		lista[5] = new Empreiteiro(1239, "Tamara", 89000.00);
//		
//		for(int pos = 0; pos < lista.length; pos++) {
//			System.out.println(lista[pos].getNumRegistro() + " "+ lista[pos].getNome()+ " R$ "+lista[pos].calcularSalario());
//		}
		
		
		ArrayList<Funcionario> lista; //declarei
		lista = new ArrayList<Funcionario>(); // instanciei
		lista.add(new Chefe(1234, "Gabi", 10000, 15, 2000));
		lista.add(new Horista(1235, "Vandeco", 200, 79));
		lista.add(new Comissionado(1236, "Yuri", 5000, 17.32));
		lista.add(new Horista(1237, "Yara", 150, 79));
		lista.add(new Empreiteiro(1238, "Carlos", 4508.0));
		lista.add(new Empreiteiro(1239, "Tamara", 89000.00));
		
		//outro tipo de for que serve só para listas
		
		for(Funcionario f : lista) {
			System.out.println(f.getNumRegistro()+ " " + f.getNome() + " R$ "+ f.calcularSalario());
		}
		
		//vamos fazer do jeito manual
		System.out.println("---------------------------------");
		for(int pos = lista.size() - 1 ; pos >= 0; pos--) {
			System.out.println(lista.get(pos).getNumRegistro() + " "+lista.get(pos).getNome() + 
					" R$ " + lista.get(pos).calcularSalario());
		}
	}
}
