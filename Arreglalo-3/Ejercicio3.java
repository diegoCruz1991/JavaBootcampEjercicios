/**
	CREATED THE DAY 23/06/2020
	@Author: Eduardo Avila Carranza.
	Program: Calculadora de operaciones: SUMAR, RESTAR, DIVIR Y MULTIPLICAR. 
*/

public class Ejercicio3 {


	public static void main(String... args) {

		//Hacer que el metodo sumar() de calculadora me traiga la suma de 2 numeros enteros
		//Hacer que el metodo restar() de calculadora me traiga la suma de 2 numeros enteros
		//Hacer que el metodo dividir() de calculadora me traiga la division de 2 numeros double
		//Hacer que el metodo multiplicar() de calculadora me traiga la multiplicacion de 2 numeros flotantes

		CalculadoraLogica calculadoraLogica = new CalculadoraLogica();

		boolean esIgual = calculadoraLogica.esIgual(((5/5)+((4-3)*7))+10, 18);
		System.out.println(esIgual);
		/*
			Primero, crear el metodo esIgual para que compare que 2 numeros son iguale so no
			Segundo, hacer que el metodo esIgual regrese true cuando le paso los valores y/o operaciones que estan arriba
		*/
		
		Calculadora calculadora = new Calculadora();

		int operation_one = calculadora.suma(2, 4);
		System.out.println(operation_one);

		int operation_two = calculadora.resta(4, 2);
		System.out.println(operation_two);

		double operation_three =  calculadora.division(500, 15);
		System.out.println(operation_three);

		float operation_four =  calculadora.multiplicacion(10f, 20f);
		System.out.println(operation_four);
	}

}

class CalculadoraLogica{

	public boolean esIgual(float a, float b){
		return a == b;
	}


}

class Calculadora{

	public int suma(int a, int b) {
		return a + b;
	}

	public int resta(int a, int b) {
		return a - b;
	}

	public double division(double a, double b) {
		return a / b;
	}

	public float multiplicacion(float a, float b) {
		return a * b;
	}
}

