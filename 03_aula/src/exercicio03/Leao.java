package exercicio03;

public class Leao {
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

	// M�todo Comer
	void comer() {
		System.out.println("O Leao comeu a ra��o.");
	}

	// M�todo Dormir
	void dormir() {
		System.out.println("O Leao ir� dormir agora.");
	}

	// M�todo EmitirSom
	void emitirSom() {
		if (tamanho < 50) {
			System.out.println("grraurrr!");
		} else if (tamanho > 50 && tamanho < 80) {
			System.out.println("grraurrr! grraurrr!");
		} else {
			System.out.println("grraurrr! grraurrr! grraurrr!");
		}
	}
}