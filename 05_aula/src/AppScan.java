import java.util.Scanner;

public class AppScan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroLido;
		String textoLido;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		
		numeroLido = teclado.nextInt();
		
		System.out.println("Digite um nome: ");
		textoLido = teclado.next();
		
		System.out.println("Seu nome �: " + textoLido);
		System.out.println("O valor digitado foi: " + numeroLido);
	}	
}
