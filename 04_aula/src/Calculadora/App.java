package Calculadora;

import Calculos.Calculadora;

public class App {

	public static void main(String[] args) {
		double calculo = 0;
		
		Calculadora c = new Calculadora(5,85);
		
		System.out.println(c.som());	
		
		/*calculo = c.div(6,0);
		if( calculo == 0) {
			System.out.println("Não é permitido usar 0 na divisão");
		}else {
			System.out.println("Dividir " + c.div(10,0));
		}*/
	}
}