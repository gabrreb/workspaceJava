package userinterface;

import core.Chefe;
import core.Comissionado;
import core.Empreiteiro;
import core.Funcionario;
import core.Horista;

public class FolhaDePagamento {

	public static void main(String[] args) {
		Funcionario f1, f2, f3, f4;
		
		//atribuindo valores
		f1 = new Empreiteiro(1234, "Carlos", 550.00);
		f2 = new Horista(567, "Maia", 15.90, 10);
		f3 = new Comissionado(896, "Pedro", 8000, 900);
		f4 = new Chefe(896, "Jasmin", 8000.78, 956.56, 9000);
		
		//printando a lista com os nomes e salarios
		System.out.println("NOME       " +"REGISTRO        "+ "SALÁRIO        ");
		System.out.println(f1.getNome()+"        "+ f1.getNumRegistro()+"        "+ f1.calcularSalario());
		System.out.println(f2.getNome()+"        "+ f2.getNumRegistro()+"        "+ f2.calcularSalario());
		System.out.println(f3.getNome()+"        "+ f3.getNumRegistro()+"        "+ f3.calcularSalario());
		System.out.println(f4.getNome()+"        "+ f4.getNumRegistro()+"        "+ f4.calcularSalario());
		
//		System.out.println("Nome: "+f1.getNome()+" Salário: "+f1.calcularSalario());
//		System.out.println("Nome: "+f2.getNome()+" Salário: "+f2.calcularSalario());
//		System.out.println("Nome: "+f3.getNome()+" Salário: "+f3.calcularSalario());
//		System.out.println("Nome: "+f4.getNome()+" Salário: "+f4.calcularSalario());
	}
}
