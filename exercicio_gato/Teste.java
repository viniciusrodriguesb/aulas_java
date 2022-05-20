package exercicio_gato;

public class Teste {

	public static void main(String[] args) {
		String animal = "gato";
		
		Gato g1 = new Gato();
		Leao l1 = new Leao();
		
		if(animal == "gato") {
			g1.setCor("preto");
			g1.setPeso(80);
			g1.setTamanho(20);	
			g1.emitirSom();
			g1.brincar();
			g1.dormir();
			g1.comer();
			
		} else if(animal == "leao"){
			l1.setCor("Amarelo");
			l1.setPeso(100);
			l1.setTamanho(20);
			l1.comer();
			l1.dormir();
			l1.emitirSom();
		}
	}
}
