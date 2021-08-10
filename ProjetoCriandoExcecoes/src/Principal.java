import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Produto p = new Produto();
		int _id;
		String _strId, _nome, _strPreco;
		double _preco;
		
		System.out.println("Digite o ID:");
		_strId = teclado.nextLine();
		_id = Integer.parseInt(_strId);
		p.setId(_id);
		
		System.out.println("Digite o nome");
		_nome = teclado.nextLine();
		p.setNome(_nome);
		
		System.out.println("Digite o preco");
		_strPreco = teclado.nextLine();
		_preco = Double.parseDouble(_strPreco);
		p.setPreco(_preco);
		
		System.out.println("Produto cadastrado!");
		
	}
}
