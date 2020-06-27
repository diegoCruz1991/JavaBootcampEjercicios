public class Ejercicio3 {

	public static void main(String... args) {
		Calculadora calculadora = new Calculadora();
		//Hacer que el metodo sumar() de calculadora me traiga la suma de 2 numeros enteros
		//Hacer que el metodo restar() de calculadora me traiga la suma de 2 numeros enteros
		//Hacer que el metodo dividir() de calculadora me traiga la division de 2 numeros double
		//Hacer que el metodo multiplicar() de calculadora me traiga la multiplicacion de 2 numeros flotantes

		double resultadoSuma = calculadora.sumar(3, 4,3);
		System.out.println(resultadoSuma);

		double resultadoResta = calculadora.restar(4, 1.4);
		System.out.println(resultadoResta);

		double resultadoDividir = calculadora.dividir(30.1, 1.9);
		System.out.println(resultadoDividir);

		double resultadoMultiplicar = calculadora.multiplicar(40, 2.5);
		System.out.println(resultadoMultiplicar);


		CalculadoraLogica calculadoraLogica = new CalculadoraLogica();

		boolean esIgual = calculadoraLogica.esIgual(5 / 5 + (4 - 3) * 7 + 10, 18);
		System.out.println(esIgual);
		/*
			Primero, crear el metodo esIgual para que compare que 2 numeros son iguales o no
			Segundo, hacer que el metodo esIgual regrese true cuando le paso los valores y/o operaciones que estan arriba
		*/
		
	}
}

class Calculadora{

	public static double sumar(double a, double b) {
		return a + b;
	}

	public static double sumar(double... a){
		if(a.length <= 1){
			System.out.println("Debes agregar 2 o más números");
			return -1;
		}
			double suma=0;
			for(int i=0;i <a.length;i++){
				suma +=a[i];
			
		}
		return suma;
	}

	public static double restar(double a, double b) {
		return a - b;
	}
	public static double dividir(double a, double b) {
		return a / b;
	}
	public static double multiplicar(double a, double b) {
		return a * b;
	}
}

class CalculadoraLogica{
	public boolean esIgual(float a, float b){
		if(a == b)
			return true;
		else
			return false;
	}
}