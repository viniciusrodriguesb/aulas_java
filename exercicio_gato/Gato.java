package exercicio_gato;

public class Gato {
	private String cor;
	private int tamanho;
	private int peso;

	// Atributo Cor
	public String getCor() {
		return cor;
	}

	public void setCor(String c) {
		cor = c;
	}

	// Atributo Tamanho
	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int t) {
		tamanho = t;
	}

	// Atributo Peso
	public int getPeso() {
		return peso;
	}

	public void setPeso(int p) {
		peso = p;
	}

	// Método Comer
	void comer() {
		System.out.println("O gato comeu a ração.");
	}

	// Método Dormir
	void dormir() {
		System.out.println("O gato irá dormir agora.");
	}

	// Método brincar
	void brincar() {
		System.out.println("Gato está brincando");
	}

	// Método EmitirSom
	void emitirSom() {
		if (tamanho < 30) {
			System.out.println("miau");
		} else if (tamanho > 30 && tamanho < 60) {
			System.out.println("miau miau");
		} else {
			System.out.println("miau miau miau");
		}
	}
}
