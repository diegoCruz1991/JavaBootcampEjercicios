public class Ejercicio3 {

	public static void main(String... args) {
		Calculadora calculadora = new Calculadora();
		//Hacer que el metodo sumar() de calculadora me traiga la suma de 2 numeros enteros
		//Hacer que el metodo restar() de calculadora me traiga la suma de 2 numeros enteros
		//Hacer que el metodo dividir() de calculadora me traiga la division de 2 numeros double
		//Hacer que el metodo multiplicar() de calculadora me traiga la multiplicacion de 2 numeros flotantes
		CalculadoraLogica calculadoraLogica = new CalculadoraLogica();

		boolean esIgual = calculadoraLogica.esIgual(5 / 5 + (4 - 3) * 7 + 10, 18);
		System.out.println(esIgual);

		//int resultado1 = calculadora.sumar(1, 5);
		//System.out.println(resultado1);

		//int resultado2 = calculadora.restar(1, 5);
		//System.out.println(resultado2);

		//double resultado3 = calculadora.dividir(5.5, 10.5);
		//System.out.println(resultado3);

		//float resultado4 = calculadora.multiplicar(1.5f, 5.5f);
		//System.out.println(resultado4);

		calculadora.sumar(2.3, 5);
		calculadora.sumar(3, 5.5);
		calculadora.sumar(3.5, 5.5);
		calculadora.sumar(2.3, 5, 10, 20);
		calculadora.sumar(2.3);

		// calculadora sumar o restar mas de dos numeros.

		/*
			Primero, crear el metodo esIgual para que compare que 2 numeros son iguales o no
			Segundo, hacer que el metodo esIgual regrese true cuando le paso los valores y/o operaciones que estan arriba
		*/
	}
}

	class CalculadoraLogica {

		public boolean esIgual(int numero1, int numero2) {
			if (numero1 == numero2) {
				return true;
			}
		return false;
		}
	}

	class Calculadora {

		public double sumar(double... muchosNumeros) {
			double total = 0;
			for(int x = 0; x < muchosNumeros.length; x++) {
				total += muchosNumeros[x];
			}
			System.out.println(total);
			return total;
		}

		public static int sumar(int a, int b) {
			System.out.println(a + b);
			return a + b;
		}

		public static double sumar(double a, int b) {
			System.out.println(a + b);
			return a + b;
		}

		public static double sumar(int a, double b) {
			System.out.println(a + b);
			return a + b;
		}

		public static double sumar(double a, double b) {
			System.out.println(a + b);
			return a + b;
		}

		public static int restar(int a, int b) {
			return a - b;
		}

		public static double dividir(double x, double y) {
			return x / y;
		}

		public static float multiplicar(float x, float y) {
			return x * y;
		}
	}
