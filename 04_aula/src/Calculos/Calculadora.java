package Calculos;

public class Calculadora {
	private double valor1;
	private double valor2;

	// Atributos

	public double getValor1() {
		return valor1;
	}

	public void setValor1(double valor1) {
		this.valor1 = valor1;
	}

	public double getValor2() {
		return valor2;
	}

	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}

	// Metodos
	// Adicionar as ações da classe
	public double som(double a, double b) {
		this.valor1 = a;
		this.valor2 = b;

		return valor1 + valor2;
	}

	public double sub(double a, double b) {
		this.valor1 = a;
		this.valor2 = b;

		return valor1 - valor2;

	}

	public double div(double a, double b) {
		this.valor1 = a;
		this.valor2 = b;

		return valor1 / valor2;

	}

	public double mult(double a, double b) {
		this.valor1 = a;
		this.valor2 = b;

		return valor1 * valor2;
	}
}
