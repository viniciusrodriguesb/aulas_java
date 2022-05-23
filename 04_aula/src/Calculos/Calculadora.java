package Calculos;

public class Calculadora {
	private double valor1;
	private double valor2;

	// Atributos
	
	public Calculadora() {}
	
	public Calculadora(double a, double b) {
		this.valor1 = a;
		this.valor2 = b;
	}

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
	public double som() {
		return valor1 + valor2;
	}
	
	public double som(double a, double b) {
		return a + b;
	}

	public double sub(double a, double b) {
		return a - b;

	}

	public double div(double a, double b) {
		double retorno;

		if (b == 0) {
			retorno = b;
		} else {
			retorno = a / b;
		}
		return retorno;
	}

	public double mult(double a, double b) {
		return a * b;
	}
}
