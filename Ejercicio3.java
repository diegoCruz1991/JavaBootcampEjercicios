
public class Ejercicio3 {

	public static void main(String... args) {
		Calculadora calculadora = new Calculadora();
		System.out.println(calculadora.sumar(1,1));
		System.out.println(calculadora.restar(4,3));
		System.out.println(calculadora.dividir(5.5,3.2));
		System.out.println(calculadora.multiplicar(1,1));
		CalculadoraLogica calculadoraLogica = new CalculadoraLogica();
		

		boolean esIgual = calculadoraLogica.esIgual(5 / 5 + (4 - 3) * (7 + 10), 18); //->Segundo, hacer que el metodo esIgual regrese true cuando le paso los valores (5 / 5 + 4 - 3 * 7 + 10, 18)
		System.out.println("Es Igual");
	}
}

class CalculadoraLogica {
		//Primero, crear el metodo esIgual para que compare que 2 numeros son iguales o no	
	public boolean esIgual (int a, int b) {
		return a == b;
	}
}

class Calculadora {
	//Hacer que el metodo sumar() de calculadora me traiga la suma de 2 numeros enteros
	public int sumar(int a, int b) {
		return a + b;
	}
	//Hacer que el metodo restar() de calculadora me traiga la suma de 2 numeros enteros
	public int restar(int a, int b) {
		return a - b;
	}
	//Hacer que el metodo dividir() de calculadora me traiga la division de 2 numeros double
	public double dividir(double a, double b) {
		return a / b;
	}
	//Hacer que el metodo multiplicar() de calculadora me traiga la multiplicacion de 2 numeros flotantes
	public float multiplicar(float a, float b) {
		return a * b;
	}
}
