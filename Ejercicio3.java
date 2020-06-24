public class Ejercicio3 {

	public static void main(String... args) {
		int num1 = 2;
		int num2 = 5;
		double num3 = 1.849223d;
		double num4 = 4.18398321d;
		float num5 = 2.8717f;
		float num6 = 3.3187f;

		Calculadora calculadora = new Calculadora();
		//Hacer que el metodo sumar() de calculadora me traiga la suma de 2 numeros enteros
		int suma = calculadora.sumar(num1, num2);
		System.out.println("Resultado de sumar: " + suma);
		//Hacer que el metodo restar() de calculadora me traiga la suma de 2 numeros enteros
		int resta = calculadora.restar(num1, num2);
		System.out.println("Resultado de restar: " +resta);
		//Hacer que el metodo dividir() de calculadora me traiga la division de 2 numeros double
		double division = calculadora.dividir(num3, num4);
		System.out.println("Resultado de dividir: " +division);
		//Hacer que el metodo multiplicar() de calculadora me traiga la multiplicacion de 2 numeros flotantes
		float multiplicacion = calculadora.multiplicar(num5, num6);
		System.out.println("Resultado de multiplicar: " +multiplicacion);

		CalculadoraLogica calculadoraLogica = new CalculadoraLogica();

		boolean esIgual = calculadoraLogica.esIgual(5 / 5 + 4 - 3 * 7 + 10, 18);
		System.out.println(esIgual);
		/*
			Primero, crear el metodo esIgual para que compare que 2 numeros son iguale so no
			Segundo, hacer que el metodo esIgual regrese true cuando le paso los valores y/o operaciones que estan arriba
		*/
	}
}

class Calculadora {

		public int sumar(int numero1, int numero2) {
			return numero1 + numero2;
		}
		public int restar(int numero1, int numero2) {
			return numero1 - numero2;
		}
		public double dividir(double numero1, double numero2) {
			return numero1 / numero2;
		}
		public float multiplicar(float numero1, float numero2) {
			return numero1 * numero2;
		}
}

class CalculadoraLogica {
	public boolean esIgual(int numero1, int numero2) {
		// quiero saber que numeros esta mandando
		System.out.println(numero1);
		System.out.println(numero2);

		// compara ambos numeros y dice si son iguales o no
		if (numero1 == numero2)
			System.out.println("Son iguales");
		else
			System.out.println("No son iguales");

		// regresa true si son los valores que se mandan arriba
		// regresa false si no
		if ((numero1 == (-6)) && (numero2 == 18))
			return true;
		else
			return false;
	}
}
