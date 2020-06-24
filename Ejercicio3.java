public class Ejercicio3 {

	public static void main(String... args) {
		
		Calculadora calculadora = new Calculadora();
		//Hacer que el metodo sumar() de calculadora me traiga la suma de 2 numeros enteros
		//Hacer que el metodo restar() de calculadora me traiga la suma de 2 numeros enteros
		//Hacer que el metodo dividir() de calculadora me traiga la division de 2 numeros double
		//Hacer que el metodo multiplicar() de calculadora me traiga la multiplicacion de 2 numeros flotantes
		CalculadoraLogica calculadoraLogica = new CalculadoraLogica();

		int sumarop = calculadora.sumar(4, 9);
		System.out.println("EL resultado de la suma es: " + sumarop);

		int restaop = calculadora.restar(5 , 4);
		System.out.println("EL resultado de la resta es: " + restaop);

		double divop = calculadora.dividir(2.5 , 20.5);
		System.out.println("EL resultado de la division es: " + divop);

		float multiop = calculadora.multiplicar(2.15f , 20.10f);
		System.out.println("EL resultado de la multiplicacion es: " + multiop);

		boolean resul = calculadoraLogica.esIgual(3,9);
		System.out.println("¿Los valores ingresados son iguales?: " + resul);

		
		boolean esIgual = calculadoraLogica.esIgual(5 / 5 + (4 - 3) * 7 + 10, 18);
		System.out.println(esIgual);
		//boolean esIgual = calculadoraLogica.esIgual(5 / 5 + (4 - 3) * 7 + 10, 18);
		/*
			Primero, crear el metodo esIgual para que compare que 2 numeros son iguale so no
			Segundo, hacer que el metodo esIgual regrese true cuando le paso los valores y/o operaciones que estan arriba
		*/
		
	}
}

class CalculadoraLogica {

	public boolean esIgual(int num1, int num2 ){
		
		return num1 == num2;
	}
}

class Calculadora{

	public int sumar(int a, int b){
		return a + b;	
	}

	public int restar( int a, int b){
		return a - b;
	}

	public double dividir(double a, double b){
		return a / b;
	}

	public float multiplicar(float a, float b){
		return a * b;
	}
	

}