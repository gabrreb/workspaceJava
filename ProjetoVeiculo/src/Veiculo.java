
//ja que eu tenho um aclasse abstrata, nao posso dar NEW em objetod dela
// mas eu posso utiliza-la de TEMPLATE  (com requisitos estritatmente essenciais
//que o meu tipo de dado precisa de ter)

//al�m disso eu posso EXIGIR que quem herdar dessas classe, compromete-se  escrever a l�gica
//dos m�todos definidos(aqui na classe abstrata eu defino o 'o que' )
//as classes filhas definem 'como'
public abstract class Veiculo {

	String marca;
	String modelo;
	
	//aqui vem a espoecifica��o do O QUE
	public abstract void acelerar();
	public abstract void frear();
	
}
