
public class Ejercicio3 {

	public static void main(String... args) {
		Calculadora calculadora = new Calculadora();
		//Hacer que el metodo sumar() de calculadora me traiga la suma de 2 numeros enteros
		System.out.println(calculadora.sumar(5,5));
		//Hacer que el metodo restar() de calculadora me traiga la suma de 2 numeros enteros
		System.out.println(calculadora.restar(10,5));
		//Hacer que el metodo dividir() de calculadora me traiga la division de 2 numeros double
		System.out.println(calculadora.dividir(10,5));
		//Hacer que el metodo multiplicar() de calculadora me traiga la multiplicacion de 2 numeros flotantes
		System.out.println(calculadora.multiplicar(5,5));

		CalculadoraLogica calculadoraLogica = new CalculadoraLogica();

		boolean esIgual = calculadoraLogica.esIgual(5 / 5 + (4 - 3) * 7+ 10, 18);
		
		/*
			Primero, crear el metodo esIgual para que compare que 2 numeros son iguales o no
			Segundo, hacer que el metodo esIgual regrese true cuando le paso los valores y/o operaciones que estan arriba
		*/
		
		
	}
}

class Calculadora{
	public int sumar(int a, int b){
		return a+b;
	}
	public int restar(int a, int b){
		return a-b;
	}
	public float dividir(float a, float b){
		return a/b;
	}
	public int multiplicar(int a, int b){
		return a*b;
	}
}

class CalculadoraLogica{
	public boolean esIgual(float a, float b){
		if (a == b) {
			System.out.println("Son iguales");
			return true;
		} else {
			System.out.println("No son iguales");
			return false;
		}
	}
}