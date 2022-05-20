package Calculadora;

import Calculos.Calculadora;

public class App {

	public static void main(String[] args) {
		
		Calculadora c = new Calculadora();
		
		System.out.println(c.mult(5,6));
		
		System.out.println("Dividir " + c.div(10,2));

	}

}
