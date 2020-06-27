
public class Ejercicio3 {

	public static void main(String... args) {
		Calculadora calculadora = new Calculadora();
		//Hacer que el metodo sumar() de calculadora me traiga la suma de 2 numeros enteros
		System.out.println(calculadora.sumar(2.3, 5, 10, 20, 30, 100.5));
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
	public static int sumar(int a, int b){
		return a+b;
	}
	public static double sumar(double a, double b){
		return a+b;
	}
	public static float sumar(float a, float b){
		return a+b;
	}
	public static int sumar(int ...a){
		if (a.length <= 1) {
			System.out.println("Esta suma es invalida");
			return -1;
		}
		int suma=0;
		for (int i=0; i< a.length; i++){
			//System.out.println(a[i]);
			suma += a[i];
		}
		return suma;
	}
	public static float sumar(float ...a){
		if (a.length <= 1) {
			System.out.println("Esta suma es invalida");
			return -1;
		}
		float suma=0;
		for (int i=0; i< a.length; i++){
			//System.out.println(a[i]);
			suma += a[i];
		}
		return suma;
	}
	public static double sumar(double ...a){
		if (a.length <= 1) {
			System.out.println("Esta suma es invalida");
			return -1;
		}
		double suma=0;
		for (int i=0; i< a.length; i++){
			//System.out.println(a[i]);
			suma += a[i];
		}
		return suma;
	}

	public static int restar(int a, int b){
		return a-b;
	}
	public static double restar(double a, double b){
		return a-b;
	}
	public static float restar(float a, float b){
		return a-b;
	}
	public static int restar(int ...a){
		if (a.length <= 1) {
			System.out.println("Esta resta es invalida");
			return -1;
		}
		int resta=0;
		for (int i=0; i< a.length; i++){
			//System.out.println(a[i]);
			resta -= a[i];
		}
		return resta;
	}
	public static float restar(float ...a){
		if (a.length <= 1) {
			System.out.println("Esta resta es invalida");
			return -1;
		}
		float resta=0;
		for (int i=0; i< a.length; i++){
			//System.out.println(a[i]);
			resta -= a[i];
		}
		return resta;
	}
	public static double restar(double ...a){
		if (a.length <= 1) {
			System.out.println("Esta resta es invalida");
			return -1;
		}
		double resta=0;
		for (int i=0; i< a.length; i++){
			//System.out.println(a[i]);
			resta -= a[i];
		}
		return resta;
	}

	public static float dividir(float a, float b){
		return a/b;
	}
	public static double dividir(double a, double b){
		return a/b;
	}

	public static int multiplicar(int a, int b){
		return a*b;
	}
	public static float multiplicar(float a, float b){
		return a*b;
	}
	public static double multiplicar(double a, double b){
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

/**
 * Git steps to upload to remote branch
 * 1 - git add Arreglalo2.java
 * 2 - git commit -m "Arreglalo 2 terminado"
 * 3 - git push -u origin LuisAntonio_branch
 */

/**
 * Git steps to pull latest changes from master
 * 1 - git checkout master  
 * 2 - git pull origin master 
 * 3 - git checkout LuisAntonio_branch
 * 4 - git merge master
 */