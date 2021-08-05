import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Hello World!");
		int a;
		a = teclado.nextInt();
		System.out.println("Voce digitou " + a);
		
		teclado.close();
	}
}
