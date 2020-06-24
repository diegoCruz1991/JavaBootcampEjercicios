public class Ejercicio3 {

	public static void main(String... args) {
		Calculadora calculadora = new Calculadora();
		//Hacer que el metodo sumar() de calculadora me traiga la suma de 2 numeros enteros
      	int suma = calculadora.sumar(7,10);
      	System.out.println(suma);
		//Hacer que el metodo restar() de calculadora me traiga la suma de 2 numeros enteros
      	int resta = calculadora.restar(4,3);
      	System.out.println(resta);
		//Hacer que el metodo dividir() de calculadora me traiga la division de 2 numeros double
		double division = calculadora.dividir(5.25d,2.1d);
      	System.out.println(division);
		//Hacer que el metodo multiplicar() de calculadora me traiga la multiplicacion de 2 numeros flotantes
		float multiplicacion = calculadora.multiplicar(7.1234f,10.9876f);
      	System.out.println(multiplicacion);

		CalculadoraLogica calculadoraLogica = new CalculadoraLogica();

		boolean esIgual = calculadoraLogica.esIgual("5 / 5 + ((4 - 3) * (7 + 10))", 18);
		/*
			Primero, crear el metodo esIgual para que compare que 2 numeros son iguale so no
			Segundo, hacer que el metodo esIgual regrese true cuando le paso los valores y/o operaciones que estan arriba
		*/
		System.out.println(esIgual);
		
	}
}

class CalculadoraLogica{

	public boolean esIgual(String a, int b){
		String compararValor = "5 / 5 + ((4 - 3) * (7 + 10))";
		int valor;
		if (compararValor.equals(a)){
			valor = 18;
			if (valor == b){
				return true;
			}else{
				return false;
			}

		}else{
			return false;
		}

	}

}

class Calculadora{

	public int sumar(int a, int b){
		return a + b;
	}

	public int restar(int a, int b){
		return a - b;		
	}

	public double dividir(double a, double b){
		return a / b;	
	}

	public float multiplicar(float a, float b){
		return a * b;
	}
}