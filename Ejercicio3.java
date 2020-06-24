public class Ejercicio3 {

	public static void main(String... args) {
		Calculadora calculadora = new Calculadora();
		int resultadoSuma = calculadora.sumar(10, 5);
		System.out.println(resultadoSuma);
		int resultadoRestar= calculadora.restar(10, 6);
		System.out.println(resultadoRestar);
		double resultadoDividir = calculadora.dividir(1000000d, 52000222222d);
		System.out.println(resultadoDividir);
		float resultadoMultiplicar = calculadora.multiplicar(5.5f, 10.5f);
		System.out.println(resultadoMultiplicar);
		//Hacer que el metodo sumar() de calculadora me traiga la suma de 2 numeros enteros
		//Hacer que el metodo restar() de calculadora me traiga la suma de 2 numeros enteros
		//Hacer que el metodo dividir() de calculadora me traiga la division de 2 numeros double
		//Hacer que el metodo multiplicar() de calculadora me traiga la multiplicacion de 2 numeros flotantes
		CalculadoraLogica calculadoraLogica = new CalculadoraLogica();
		boolean iguales= calculadoraLogica.esIgual(10, 10);
		System.out.println(iguales);
		//System.out.println(iguales);
		//boolean esIgual = calculadoraLogica.esIgual(5 / 5 + 4 - 3 * 7 + 10, 18);
		/*
			Primero, crear el metodo esIgual para que compare que 2 numeros son iguale so no
			Segundo, hacer que el metodo esIgual regrese true cuando le paso los valores y/o operaciones que estan arriba
		*/
		
	}
}

class Calculadora {
	public int sumar(int a, int b) {
		return a + b;

	}

	public int restar(int x, int y) {
		return x - y;
	}

	public double dividir(double numero1, double numero2) {
		return numero1 / numero2;

	}

	public float multiplicar (float numero3, float numero4) {
		return numero3 * numero4;
	}

}

class CalculadoraLogica {
	public boolean esIgual(int numero5, int numero6) {
		if(numero5 == numero6){						
			return true;
		}else{
			return false;
		}
		
		}
}