
public class correcao_desafio {

	public static void main(String[] args) {
		int n = 0;
		String virgula = ",";
		int max = 10;
		
		while(n <= max) {
			if(n == max) {
				virgula = ".";
			}
			System.out.print(n + virgula);
			n++;
		}

	}

}
