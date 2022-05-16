package java_senac;

public class exercicio_04 {

	public static void main(String[] args) {
		for(int i = 1; i <= 500; i++) {
			int num = i%2;
			if(num%2==0) {
				System.out.println("Numero par: " + i);
			}
		}
	}
}
