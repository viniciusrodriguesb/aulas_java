public class Pelicano {
	private boolean bico;
	private String cor;
	private int peso;
	
	//Cor
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	//Bico
	public boolean getBico() {
		return bico;
	}
	
	public void setBico(boolean bico) {
		this.bico = bico;
	}
	
	//Peso
	public int getPeso() {
		return peso;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	
	
	public void voar() {
		if (peso > 50) {
			System.out.println("o pelicano não consegue voar, está pesado.");
		} else {
			System.out.println("O pelicano está voando!");
		}
	}

	public void comer() {
		System.out.println("O pelicano está comendo!");
	}

	public void definirNome(String nome) {
		System.out.println("o nome do pelicano é: " + nome);
	}

	public String retornarCor() {
		return cor;
	}
}