
public class SistemaQueUsa {
	public static void main(String[] args) {
		
		ClasseAB cab = new classeAB();
		
		InterfaceA ia = new ClasseAB();
		InterfaceB ib = new ClasseAB();
		
		cab.metodoA1();
		cab.metodoA2();
		cab.metodoB1();
		cab.metodoB2();
		
		ia.metodoA1();
		ia.metodoA2();
		
		
		
	}
}
