public class Ejercicio3 {

	public static void main(String... args) {
		Calculadora calculadora = new Calculadora();
		//Hacer que el metodo sumar() de calculadora me traiga la suma de 2 numeros enteros
		//Hacer que el metodo restar() de calculadora me traiga la suma de 2 numeros enteros
		//Hacer que el metodo dividir() de calculadora me traiga la division de 2 numeros double
		//Hacer que el metodo multiplicar() de calculadora me traiga la multiplicacion de 2 numeros flotantes
		CalculadoraLogica calculadoraLogica = new CalculadoraLogica();

		System.out.println("El resultado de la suma es: " + calculadora.sumar(13,14));
		System.out.println("El resultado de la resta es: " + calculadora.restar(24,13));
		System.out.println("El resultado de la division es: " + calculadora.dividir(13.456f,4.543f));
		System.out.println("El resultado de la multiplicacion es: " + calculadora.multiplicar(23.231f,43.231f));


		boolean esIgual = calculadoraLogica.esIgual(5 / 5 + 4 - 3 * 7 + 10, 18);

		System.out.println("El resultado de la operacion booleana es: " + esIgual);
		/*
			Primero, crear el metodo esIgual para que compare que 2 numeros son iguale so no
			Segundo, hacer que el metodo esIgual regrese true cuando le paso los valores y/o operaciones que estan arriba
		*/
		
	}
}

class Calculadora {
	int sumar(int a, int b){
		return a + b;
	}

	int restar(int c, int d){
		return c - d;
	}

	float dividir(float e, float f){
		return e / f;
	}

	float multiplicar(float g, float h){
		return g * h;
	}
}

class CalculadoraLogica {
	boolean esIgual(int i, int j){
		return i==j;
	}

}