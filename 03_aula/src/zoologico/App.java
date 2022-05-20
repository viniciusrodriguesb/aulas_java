package zoologico;

import correcao_exercicio03.Animal;
import correcao_exercicio03.Gato;
import correcao_exercicio03.Leao;
import correcao_exercicio03.Tatu;

public class App {

	public static void main(String[] args) {
		Gato gato = new Gato();
		Leao leao = new Leao();
		Tatu tatu = new Tatu();
		
		gato.setCor("Branco e Preto");
		gato.setPeso(20);
		gato.setTamanho(5);
		gato.setNome("Brutus");

		System.out.println(gato.getNome() + " , " + gato.brincar()+ " , "  + gato.emitirSom());
		System.out.println(leao.comer());
		System.out.println(tatu.emitirSom());
		
		
		//Polimorfismo
		//Polimorfismo de argumentos e retornos
		Animal[] animais = new Animal[3];
		
		animais[0] = new Leao();
		animais[1] = new Tatu();
		animais[2] = new Gato();
		
		for(Animal a: animais) {
			System.out.println(a.emitirSom());
		}
	}
}