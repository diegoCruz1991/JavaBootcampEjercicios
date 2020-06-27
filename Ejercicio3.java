public class Ejercicio3 {

	public static void main(String... args) {
		Calculadora calculadora = new Calculadora();
		//Hacer que el metodo sumar() de calculadora me traiga la suma de 2 numeros enteros
      	double suma = calculadora.sumar(7.5,10,9);
      	System.out.println(suma);
		//Hacer que el metodo restar() de calculadora me traiga la suma de 2 numeros enteros
      	double resta = calculadora.restar(4,3);
      	System.out.println(resta);
		//Hacer que el metodo dividir() de calculadora me traiga la division de 2 numeros double
		double division = calculadora.dividir(5.25d,2.1d);
      	System.out.println(division);
		//Hacer que el metodo multiplicar() de calculadora me traiga la multiplicacion de 2 numeros flotantes
		float multiplicacion = calculadora.multiplicar(7.1234f,10.9876f);
      	System.out.println(multiplicacion);

		CalculadoraLogica calculadoraLogica = new CalculadoraLogica();

		boolean esIgual = calculadoraLogica.esIgual(5 / 5 + ((4 - 3) * (7 + 10)), 18);
		/*
			Primero, crear el metodo esIgual para que compare que 2 numeros son iguale so no
			Segundo, hacer que el metodo esIgual regrese true cuando le paso los valores y/o operaciones que estan arriba
		*/
		System.out.println(esIgual);
		
	}
}



class Calculadora{

	public void sumar(double a){
		System.out.println("No valido");
	}

	public void sumar(){
		System.out.println("No valido");
	}

	public static float sumar(int a, int b){
		return a + b;
	}


	public static double sumar(double a, double b){
		return a + b;
	}

	public static double sumar(double...numeros){
		double suma=0;
		for (int index =0; index < numeros.length; index++ ){
			suma = suma + numeros[index];
		}
		return suma;
	}

	public void restar(double a){
		System.out.println("No valido");
	}

	public void restar(){
		System.out.println("No valido");
	}


	public static int restar(int a, int b){
		return a - b;		
	}

	public static double restar(double a, double b){
		return a + b;
	}

	public static double restar(double...numeros){
		double resta=0;
		for (int index =0; index < numeros.length; index++ ){
			resta = resta + numeros[index];
		}
		return resta;
	}

	public static double dividir(double a, double b){
		return a / b;	
	}

	public static float multiplicar(float a, float b){
		return a * b;
	}
}

class CalculadoraLogica{

	public boolean esIgual(int a, int b){
		if (a==b){
			return true;
		}else
		return false;
		
	}
		

}