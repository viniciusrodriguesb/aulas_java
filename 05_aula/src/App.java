import java.util.ArrayList;
import java.util.List;

public class App {

/*	
	Demonstração de uso de ArrayList
	
*/
	public static void main(String[] args) {
		//ArrayList

		List<String> lista = new ArrayList<String>();
		
		lista.add("Matheus");
		lista.add("Vinicius"); 
		lista.add("Beatriz");
		lista.add("Vinicius");
		
		for(String temp: lista) {
			System.out.println(temp);
		}	
		
		//Procurando a beatriz
		System.out.println("O array tem " + lista.size() + " elementos.");
		
		System.out.println(lista.contains("Beatriz"));
		
		System.out.println("O valor está no indice " + lista.indexOf("Beatriz"));
		
		System.out.println("O conteúdo do indice 3 é " + lista.get(3));
	}
}